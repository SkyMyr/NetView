/* Generated By:JavaCC: Do not edit this line. cmmJavaCCTokenManager.java */
package javacc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.jena.*;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFWriter;

/** Token Manager. */
/**
 * Adder的词法分析器。 
 * @author myr
 *
 */
public class cmmJavaCCTokenManager implements cmmJavaCCConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3f80L) != 0L)
         {
            jjmatchedKind = 15;
            return 0;
         }
         return -1;
      case 1:
         if ((active0 & 0x80L) != 0L)
            return 0;
         if ((active0 & 0x3f00L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
            return 0;
         }
         return -1;
      case 2:
         if ((active0 & 0x1000L) != 0L)
            return 0;
         if ((active0 & 0x2f00L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 2;
            return 0;
         }
         return -1;
      case 3:
         if ((active0 & 0x2800L) != 0L)
            return 0;
         if ((active0 & 0x700L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
            return 0;
         }
         return -1;
      case 4:
         if ((active0 & 0x700L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 4;
            return 0;
         }
         return -1;
      case 5:
         if ((active0 & 0x400L) != 0L)
            return 0;
         if ((active0 & 0x300L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 5;
            return 0;
         }
         return -1;
      case 6:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 6;
            return 0;
         }
         if ((active0 & 0x100L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 15;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x200L) != 0L)
            return 0;
         if ((active0 & 0x100L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 15;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x100L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 15;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x100L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 15;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1100L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 123:
         return jjStopAtPos(0, 19);
      case 125:
         return jjStopAtPos(0, 20);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xc00L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 112:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 0);
         break;
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 121:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x300L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(3, 13, 0);
         break;
      case 121:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 0);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(7, 9, 0);
         break;
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(10, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 29;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(1);
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(2, 4);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(5, 7);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjCheckNAddStates(8, 10);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) != 0L && kind > 16)
                     kind = 16;
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(12);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(9);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(6);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(3);
                  break;
               case 17:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 18:
                  if (curChar == 47)
                     jjCheckNAddStates(11, 13);
                  break;
               case 19:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(11, 13);
                  break;
               case 20:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 21:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 22:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 24:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 25:
                  if (curChar == 42)
                     jjAddStates(14, 15);
                  break;
               case 26:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(27, 25);
                  break;
               case 27:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(27, 25);
                  break;
               case 28:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(0);
                  break;
               case 19:
                  jjAddStates(11, 13);
                  break;
               case 24:
                  jjCheckNAddTwoStates(24, 25);
                  break;
               case 26:
               case 27:
                  jjCheckNAddTwoStates(27, 25);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(11, 13);
                  break;
               case 24:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 26:
               case 27:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(27, 25);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 29 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   18, 23, 3, 16, 4, 6, 15, 7, 9, 14, 10, 19, 20, 22, 26, 28, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\151\160", 
"\141\143\143\145\163\163\55\154\151\163\164", "\145\170\164\145\156\144\145\144", "\160\145\162\155\151\164", 
"\144\145\156\171", "\141\156\171", "\150\157\163\164", null, null, null, null, null, "\173", 
"\175", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1dbf81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[29];
static private final int[] jjstateSet = new int[58];
static protected char curChar;
/** Constructor. */
public cmmJavaCCTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public cmmJavaCCTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 29; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
