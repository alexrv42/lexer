/* The following code was generated by JFlex 1.4.3 on 5/7/19 8:10 AM */

package lexer;
import static lexer.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/7/19 8:10 AM from the specification file
 * <tt>src/lexer/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\54\1\0\1\4\5\0"+
    "\1\52\1\51\1\40\1\36\1\47\1\37\1\53\1\34\12\2\1\50"+
    "\1\44\1\43\1\41\1\42\2\0\1\13\1\27\1\14\1\33\1\20"+
    "\1\17\1\11\1\30\1\15\1\31\1\1\1\22\1\24\1\16\1\10"+
    "\1\6\1\1\1\7\1\23\1\21\1\32\1\12\1\1\1\25\1\26"+
    "\1\1\1\46\1\35\1\45\3\0\32\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\14\2\1\6"+
    "\1\4\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\1\1\2"+
    "\2\5\1\0\1\24\1\5\2\2\1\25\12\2\1\26"+
    "\3\2\1\27\1\30\1\31\1\32\1\5\1\0\1\5"+
    "\1\2\1\0\1\33\1\5\1\0\1\24\3\2\1\34"+
    "\1\2\1\35\1\2\1\36\11\2\2\5\1\0\1\24"+
    "\1\0\1\37\1\40\1\2\1\41\1\42\5\2\1\43"+
    "\1\44\3\2\2\24\10\2\1\45\1\46\1\47\1\50"+
    "\3\2\1\51\2\2\1\52\1\53\1\2\1\54\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\u0357\0\55\0\55\0\55\0\55"+
    "\0\u0384\0\u03b1\0\55\0\55\0\55\0\55\0\u03de\0\55"+
    "\0\55\0\u040b\0\u0438\0\u0465\0\u0492\0\u04bf\0\u04ec\0\u0519"+
    "\0\u0546\0\u0573\0\132\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0654"+
    "\0\u0681\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc"+
    "\0\u07e9\0\55\0\55\0\55\0\55\0\u0816\0\u0843\0\u0870"+
    "\0\u089d\0\u08ca\0\u04bf\0\u08f7\0\u0924\0\u0951\0\u097e\0\u09ab"+
    "\0\u09d8\0\132\0\u0a05\0\132\0\u0a32\0\132\0\u0a5f\0\u0a8c"+
    "\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4"+
    "\0\u0c21\0\u0c4e\0\u0924\0\u0c7b\0\132\0\132\0\u0ca8\0\132"+
    "\0\132\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c\0\u0d89\0\132\0\132"+
    "\0\u0db6\0\u0de3\0\u0e10\0\55\0\u0c4e\0\u0e3d\0\u0e6a\0\u0e97"+
    "\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\132\0\132\0\132"+
    "\0\132\0\u0fa5\0\u0fd2\0\u0fff\0\132\0\u102c\0\u1059\0\132"+
    "\0\132\0\u1086\0\132\0\132";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\1\3\1\12\1\13\1\3\1\14\1\3\1\15"+
    "\1\16\1\3\1\17\1\20\1\21\3\3\1\22\3\3"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\5\56\0\1\3\1\43\3\0\26\3\17\0\1\44"+
    "\2\0\1\45\1\4\3\0\26\45\17\0\1\46\4\0"+
    "\1\5\1\0\1\5\46\0\1\5\4\6\1\47\1\0"+
    "\27\6\1\50\17\6\1\0\1\3\1\43\3\0\1\3"+
    "\1\51\24\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\12\3\1\52\13\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\1\3\1\53\24\3\17\0\1\44\2\0\1\3"+
    "\1\43\3\0\5\3\1\54\4\3\1\55\13\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\10\3\1\56\15\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\10\3\1\57"+
    "\15\3\17\0\1\44\2\0\1\3\1\43\3\0\7\3"+
    "\1\60\16\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\10\3\1\61\4\3\1\62\5\3\1\63\2\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\7\3\1\64\2\3"+
    "\1\65\13\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\7\3\1\66\3\3\1\67\12\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\7\3\1\70\16\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\5\3\1\71\20\3\17\0"+
    "\1\44\35\0\1\24\20\0\5\24\1\0\47\24\41\0"+
    "\1\72\54\0\1\73\1\74\53\0\1\75\14\0\1\76"+
    "\1\77\3\0\26\76\17\0\1\100\2\0\1\101\1\43"+
    "\3\0\26\101\17\0\1\100\2\0\2\44\3\0\26\44"+
    "\17\0\1\44\2\0\1\45\4\0\26\45\21\0\2\102"+
    "\1\103\2\102\1\0\45\102\1\104\5\0\1\105\50\0"+
    "\4\6\1\106\1\0\27\6\1\50\17\6\1\0\1\3"+
    "\1\43\3\0\2\3\1\107\23\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\1\110\4\3\1\111\20\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\1\3\1\112\24\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\17\3\1\113"+
    "\6\3\17\0\1\44\2\0\1\3\1\43\3\0\25\3"+
    "\1\114\17\0\1\44\2\0\1\3\1\43\3\0\7\3"+
    "\1\115\16\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\10\3\1\116\15\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\13\3\1\117\12\3\17\0\1\44\2\0\1\3"+
    "\1\43\3\0\6\3\1\120\17\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\12\3\1\121\13\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\16\3\1\122\7\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\12\3\1\123\13\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\10\3\1\124"+
    "\15\3\17\0\1\44\2\0\1\3\1\43\3\0\1\3"+
    "\1\125\24\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\12\3\1\126\13\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\15\3\1\127\10\3\17\0\1\44\2\0\1\76"+
    "\1\130\3\0\26\76\22\0\1\45\1\77\3\0\26\45"+
    "\22\0\2\131\3\0\26\131\17\0\1\100\2\0\2\101"+
    "\3\0\26\101\21\0\5\102\1\0\45\102\1\104\1\0"+
    "\5\104\1\0\46\104\1\0\4\105\1\47\1\0\47\105"+
    "\4\132\1\133\1\0\27\132\1\134\17\132\1\0\1\3"+
    "\1\43\3\0\3\3\1\135\2\3\1\136\17\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\7\3\1\137\16\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\14\3\1\140"+
    "\11\3\17\0\1\44\2\0\1\3\1\43\3\0\20\3"+
    "\1\141\5\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\6\3\1\142\17\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\12\3\1\143\13\3\17\0\1\44\2\0\1\3"+
    "\1\43\3\0\1\3\1\144\24\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\6\3\1\145\17\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\1\146\25\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\1\3\1\147\24\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\2\3\1\150\23\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\7\3\1\151"+
    "\16\3\17\0\1\44\2\0\1\3\1\43\3\0\10\3"+
    "\1\152\15\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\13\3\1\153\12\3\17\0\1\44\3\0\1\130\53\0"+
    "\2\131\3\0\26\131\21\0\4\132\1\154\1\0\27\132"+
    "\1\134\23\132\1\155\1\0\27\132\1\134\17\132\1\0"+
    "\1\3\1\43\3\0\13\3\1\156\12\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\7\3\1\157\16\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\1\3\1\160\24\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\7\3\1\161"+
    "\16\3\17\0\1\44\2\0\1\3\1\43\3\0\24\3"+
    "\1\162\1\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\7\3\1\163\16\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\10\3\1\164\15\3\17\0\1\44\2\0\1\3"+
    "\1\43\3\0\13\3\1\165\12\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\5\3\1\166\20\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\12\3\1\167\13\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\2\3\1\170\23\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\2\3\1\171"+
    "\23\3\17\0\1\44\2\0\1\3\1\43\3\0\21\3"+
    "\1\172\4\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\13\3\1\173\12\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\5\3\1\174\20\3\17\0\1\44\2\0\1\3"+
    "\1\43\3\0\3\3\1\175\22\3\17\0\1\44\2\0"+
    "\1\3\1\43\3\0\1\3\1\176\24\3\17\0\1\44"+
    "\2\0\1\3\1\43\3\0\7\3\1\177\16\3\17\0"+
    "\1\44\2\0\1\3\1\43\3\0\5\3\1\200\20\3"+
    "\17\0\1\44\2\0\1\3\1\43\3\0\1\3\1\201"+
    "\24\3\17\0\1\44\2\0\1\3\1\43\3\0\5\3"+
    "\1\202\20\3\17\0\1\44\2\0\1\3\1\43\3\0"+
    "\1\3\1\203\24\3\17\0\1\44\2\0\1\3\1\43"+
    "\3\0\15\3\1\204\10\3\17\0\1\44\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4275];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\22\1\4\11\2\1\4\11\1\1\2\11"+
    "\4\1\1\0\23\1\4\11\1\1\1\0\2\1\1\0"+
    "\2\1\1\0\24\1\1\0\1\1\1\0\17\1\1\11"+
    "\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[132];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public int getLine() {
    return yyline;
    }
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 114) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 46: break;
        case 12: 
          { lexeme=yytext(); return Menor;
          }
        case 47: break;
        case 23: 
          { lexeme=yytext(); return MayorIgual;
          }
        case 48: break;
        case 13: 
          { lexeme=yytext(); return PuntoYComa;
          }
        case 49: break;
        case 25: 
          { lexeme=yytext(); return Diferente;
          }
        case 50: break;
        case 39: 
          { lexeme=yytext(); return Inicio;
          }
        case 51: break;
        case 36: 
          { lexeme=yytext(); return SiNo;
          }
        case 52: break;
        case 45: 
          { lexeme=yytext(); return Mientras;
          }
        case 53: break;
        case 17: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 54: break;
        case 14: 
          { lexeme=yytext(); return CierraCorchete;
          }
        case 55: break;
        case 24: 
          { lexeme=yytext(); return MenorIgual;
          }
        case 56: break;
        case 41: 
          { lexeme=yytext(); return String;
          }
        case 57: break;
        case 15: 
          { lexeme=yytext(); return AbreCorchete;
          }
        case 58: break;
        case 21: 
          { lexeme=yytext(); return Or;
          }
        case 59: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 60: break;
        case 44: 
          { lexeme=yytext(); return Escribir;
          }
        case 61: break;
        case 31: 
          { lexeme=yytext(); return Prog;
          }
        case 62: break;
        case 19: 
          { lexeme=yytext(); return AbreParentesis;
          }
        case 63: break;
        case 28: 
          { lexeme=yytext(); return Var;
          }
        case 64: break;
        case 33: 
          { lexeme=yytext(); return Real;
          }
        case 65: break;
        case 34: 
          { lexeme=yytext(); return Vexy;
          }
        case 66: break;
        case 27: 
          { lexeme=yytext(); return Reales;
          }
        case 67: break;
        case 20: 
          { lexeme=yytext(); return Cadena;
          }
        case 68: break;
        case 37: 
          { lexeme=yytext(); return Hasta;
          }
        case 69: break;
        case 3: 
          { lexeme=yytext(); return Enteros;
          }
        case 70: break;
        case 8: 
          { lexeme=yytext(); return Resta;
          }
        case 71: break;
        case 11: 
          { lexeme=yytext(); return Mayor;
          }
        case 72: break;
        case 32: 
          { lexeme=yytext(); return Proc;
          }
        case 73: break;
        case 35: 
          { lexeme=yytext(); return Leer;
          }
        case 74: break;
        case 43: 
          { lexeme=yytext(); return Limpiar;
          }
        case 75: break;
        case 5: 
          { lexeme=yytext(); return ERROR;
          }
        case 76: break;
        case 22: 
          { lexeme=yytext(); return Si;
          }
        case 77: break;
        case 9: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 78: break;
        case 1: 
          { return ERROR;
          }
        case 79: break;
        case 18: 
          { lexeme=yytext(); return CierraParentesis;
          }
        case 80: break;
        case 40: 
          { lexeme=yytext(); return Entero;
          }
        case 81: break;
        case 29: 
          { lexeme=yytext(); return And;
          }
        case 82: break;
        case 26: 
          { lexeme=yytext(); return DosPuntosIgual;
          }
        case 83: break;
        case 10: 
          { lexeme=yytext(); return Igual;
          }
        case 84: break;
        case 16: 
          { lexeme=yytext(); return Coma;
          }
        case 85: break;
        case 42: 
          { lexeme=yytext(); return Ejecuta;
          }
        case 86: break;
        case 4: 
          { /*Ignore*/
          }
        case 87: break;
        case 30: 
          { lexeme=yytext(); return Final;
          }
        case 88: break;
        case 7: 
          { lexeme=yytext(); return Suma;
          }
        case 89: break;
        case 38: 
          { lexeme=yytext(); return Repite;
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
