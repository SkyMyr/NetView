package getnetview;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.ModelFactory;

public class GetNetView {
	private static String url="Neiwang1.owl";
	private static OntModel ontModel = ModelFactory.createOntologyModel();
	
	/*
	 * 得到Action、host的URL
	 * */
	public static String getActionUrl(String clazz)
	{
		ontModel.read(url);		
		for(Iterator i=ontModel.listClasses();i.hasNext();)
		{
			OntClass ontclass=(OntClass)i.next();
			if(!ontclass.isAnon())	//判断是否是匿名类
			{
				if(ontclass.getLocalName().equals(clazz))
				{
					return "<"+ontclass.getURI()+">";
				}
			}
		}
		return "";
	}
	
	//格式化URL字符串
	public static String getSimpleClass(String str)
	{
		int flag=str.indexOf("#");
		return str.substring(flag+1, str.length());
	}
	
	//使用Sparql查询
	public static ResultSet getQueryResUlt(String prefix)
	{
		String sparql=prefix;
		String acturl=GetNetView.getActionUrl("Action");
		String hosturl=GetNetView.getActionUrl("Host");
		String denyurl=GetNetView.getActionUrl("UnconsideredEntities");
		//sparql=prefix+" select ?host1 ?host2 ?action ?rule where{{?action rdf:type "+acturl+".?action source:isActionOf ?rule.?host1 source:isSubjectOf ?rule.?host2 source:isObjectOf ?rule.?host1 rdf:type "+hosturl+".?host2 rdf:type "+hosturl+"} union {?action rdf:type "+acturl+".?action source:isActionOf ?rule.?host1 source:isSubjectOf ?rule.?host2 source:isObjectOf ?rule.?host1 rdf:type "+denyurl+".?host2 rdf:type "+hosturl+"}}";
		sparql=prefix+" select ?host1 ?host2 ?action ?rule where{?action rdf:type "+acturl+".?action source:isActionOf ?rule.?host1 source:isSubjectOf ?rule.?host2 source:isObjectOf ?rule.{?host1 rdf:type "+hosturl+".?host2 rdf:type "+hosturl+"} union {?host1 rdf:type "+denyurl+".?host2 rdf:type "+hosturl+"} union {?host1 rdf:type "+denyurl+".?host2 rdf:type "+denyurl+"} union {?host1 rdf:type "+hosturl+".?host2 rdf:type "+denyurl+"}}";
		ResultSet resultSet=null;
		QueryExecution queryExecution = QueryExecutionFactory.create(sparql, ontModel);
		resultSet = queryExecution.execSelect();
		return resultSet;
	}
	
	//Resultset解析为json
	public static String GetNetViewJson() {
		ResultSet resultSet=GetNetView.getQueryResUlt("PREFIX source:<http://www.semanticweb.org/lydia/ontologies/2018/3/untitled-ontology-36#> PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>");
		QuerySolution qs;
		String subhost,objhost,rule,action;
		String json="{title: {text: 'Visible World Routing',left: 'center'},tooltip: {},animationDurationUpdate: 1500,animationEasingUpdate: 'quinticInOut',label: {normal: {";
		json+="show: true,textStyle: {fontSize: 12},}},series: [{type: 'graph',layout: 'force',symbolSize: 45,";
		json+="focusNodeAdjacency: true,roam: true,label: {normal: {show: true,textStyle: {fontSize: 20,color:'#080808',},}},";//文字颜色
		json+="force: {repulsion: 7000,gravity:1},edgeSymbol: ['', 'arrow'],edgeSymbolSize:10,edgeLabel: {normal: {show: true,";
		json+="textStyle: {fontSize: 15},formatter: \"{c}\"}},color:'#B1B1B1',";//节点颜色
		String data=" data: [",lines="links: [";
		while (resultSet.hasNext()) 
		{   
			qs = resultSet.next(); 
 			subhost=GetNetView.getSimpleClass(qs.get("host1").toString());
 			objhost=GetNetView.getSimpleClass(qs.get("host2").toString());
 			rule=GetNetView.getSimpleClass(qs.get("rule").toString());
			action=GetNetView.getSimpleClass(qs.get("action").toString());
			if(data.indexOf(subhost)==-1)
			{
				data+="{name:'"+subhost+"',draggable: true},";
			}
			if(data.indexOf(objhost)==-1)
			{
				data+="{name:'"+objhost+"',draggable: true},";
			}
			lines+="{source: '"+subhost+"',target: '"+objhost+"',value:'"+rule+"',";
			if(action.equals("Permit"))
			{
				lines+="lineStyle:{color:'#0b9608'}},";//线条允许
			}
			else
			{
				lines+="lineStyle:{color:'#f61409'}},";//线条拒绝
			}
		}
		lines=lines.substring(0, lines.length()-1);
		data=data.substring(0, data.length()-1);
		data+="]";
		lines+="]";
		json+=data;
		json+=",";
		json+=lines;
		json+=",lineStyle:{normal:{opacity:0.9,curveness:0}}}]};";
		return json;
	}
}
