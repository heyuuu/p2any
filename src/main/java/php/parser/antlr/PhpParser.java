// Generated from /Users/heyu/Code/local/p2any/src/main/resources/antlr/PhpParser.g4 by ANTLR 4.10.1
package php.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, XmlStart=3, PHPStart=4, HtmlScriptOpen=5, 
		HtmlStyleOpen=6, HtmlComment=7, HtmlDtd=8, HtmlOpen=9, Shebang=10, Error=11, 
		XmlText=12, XmlClose=13, PHPStartInside=14, HtmlClose=15, HtmlSlashClose=16, 
		HtmlSlash=17, HtmlEquals=18, HtmlStartQuoteString=19, HtmlStartDoubleQuoteString=20, 
		HtmlHex=21, HtmlDecimal=22, HtmlSpace=23, HtmlName=24, ErrorInside=25, 
		PHPStartInsideQuoteString=26, HtmlEndQuoteString=27, HtmlQuoteString=28, 
		ErrorHtmlQuote=29, PHPStartDoubleQuoteString=30, HtmlEndDoubleQuoteString=31, 
		HtmlDoubleQuoteString=32, ErrorHtmlDoubleQuote=33, ScriptText=34, HtmlScriptClose=35, 
		PHPStartInsideScript=36, StyleBody=37, PHPEnd=38, Whitespace=39, MultiLineComment=40, 
		SingleLineComment=41, ShellStyleComment=42, AttributeStart=43, Abstract=44, 
		Array=45, As=46, BinaryCast=47, BoolType=48, BooleanConstant=49, Break=50, 
		Callable=51, Case=52, Catch=53, Class=54, Clone=55, Const=56, Continue=57, 
		Declare=58, Default=59, Do=60, DoubleCast=61, DoubleType=62, Echo=63, 
		Else=64, ElseIf=65, Empty=66, EndDeclare=67, EndFor=68, EndForeach=69, 
		EndIf=70, EndSwitch=71, EndWhile=72, Eval=73, Exit=74, Extends=75, Final=76, 
		Finally=77, FloatCast=78, For=79, Foreach=80, Function_=81, Global=82, 
		Goto=83, If=84, Implements=85, Import=86, Include=87, IncludeOnce=88, 
		InstanceOf=89, InsteadOf=90, Int8Cast=91, Int16Cast=92, Int64Type=93, 
		IntType=94, Interface=95, IsSet=96, List=97, LogicalAnd=98, LogicalOr=99, 
		LogicalXor=100, Match_=101, Namespace=102, New=103, Null=104, ObjectType=105, 
		Parent_=106, Partial=107, Print=108, Private=109, Protected=110, Public=111, 
		Require=112, RequireOnce=113, Resource=114, Return=115, Static=116, StringType=117, 
		Switch=118, Throw=119, Trait=120, Try=121, Typeof=122, UintCast=123, UnicodeCast=124, 
		Unset=125, Use=126, Var=127, While=128, Yield=129, From=130, LambdaFn=131, 
		Get=132, Set=133, Call=134, CallStatic=135, Constructor=136, Destruct=137, 
		Wakeup=138, Sleep=139, Autoload=140, IsSet__=141, Unset__=142, ToString__=143, 
		Invoke=144, SetState=145, Clone__=146, DebugInfo=147, Namespace__=148, 
		Class__=149, Traic__=150, Function__=151, Method__=152, Line__=153, File__=154, 
		Dir__=155, Spaceship=156, Lgeneric=157, Rgeneric=158, DoubleArrow=159, 
		Inc=160, Dec=161, IsIdentical=162, IsNoidentical=163, IsEqual=164, IsNotEq=165, 
		IsSmallerOrEqual=166, IsGreaterOrEqual=167, PlusEqual=168, MinusEqual=169, 
		MulEqual=170, Pow=171, PowEqual=172, DivEqual=173, Concaequal=174, ModEqual=175, 
		ShiftLeftEqual=176, ShiftRightEqual=177, AndEqual=178, OrEqual=179, XorEqual=180, 
		BooleanOr=181, BooleanAnd=182, NullCoalescing=183, NullCoalescingEqual=184, 
		ShiftLeft=185, ShiftRight=186, DoubleColon=187, ObjectOperator=188, NamespaceSeparator=189, 
		Ellipsis=190, Less=191, Greater=192, Ampersand=193, Pipe=194, Bang=195, 
		Caret=196, Plus=197, Minus=198, Asterisk=199, Percent=200, Divide=201, 
		Tilde=202, SuppressWarnings=203, Dollar=204, Dot=205, QuestionMark=206, 
		OpenRoundBracket=207, CloseRoundBracket=208, OpenSquareBracket=209, CloseSquareBracket=210, 
		OpenCurlyBracket=211, CloseCurlyBracket=212, Comma=213, Colon=214, SemiColon=215, 
		Eq=216, Quote=217, BackQuote=218, VarName=219, Label=220, Octal=221, Decimal=222, 
		Real=223, Hex=224, Binary=225, BackQuoteString=226, SingleQuoteString=227, 
		DoubleQuote=228, StartNowDoc=229, StartHereDoc=230, ErrorPhp=231, CurlyDollar=232, 
		UnicodeEscape=233, StringPart=234, Comment=235, PHPEndSingleLineComment=236, 
		CommentEnd=237, HereDocText=238, XmlText2=239;
	public static final int
		RULE_htmlDocument = 0, RULE_inlineHtml = 1, RULE_htmlElement = 2, RULE_scriptText = 3, 
		RULE_phpBlock = 4, RULE_topStatement = 5, RULE_useDeclaration = 6, RULE_useDeclarationContentList = 7, 
		RULE_useDeclarationContent = 8, RULE_namespaceDeclaration = 9, RULE_namespaceStatement = 10, 
		RULE_functionDeclaration = 11, RULE_classDeclaration = 12, RULE_classEntryType = 13, 
		RULE_interfaceList = 14, RULE_typeParameterListInBrackets = 15, RULE_typeParameterList = 16, 
		RULE_typeParameterWithDefaultsList = 17, RULE_typeParameterDecl = 18, 
		RULE_typeParameterWithDefaultDecl = 19, RULE_genericDynamicArgs = 20, 
		RULE_attributes = 21, RULE_attributeGroup = 22, RULE_attribute = 23, RULE_innerStatementList = 24, 
		RULE_innerStatement = 25, RULE_statement = 26, RULE_emptyStatement_ = 27, 
		RULE_blockStatement = 28, RULE_ifStatement = 29, RULE_elseIfStatement = 30, 
		RULE_elseIfColonStatement = 31, RULE_elseStatement = 32, RULE_elseColonStatement = 33, 
		RULE_whileStatement = 34, RULE_doWhileStatement = 35, RULE_forStatement = 36, 
		RULE_forInit = 37, RULE_forUpdate = 38, RULE_switchStatement = 39, RULE_switchBlock = 40, 
		RULE_breakStatement = 41, RULE_continueStatement = 42, RULE_returnStatement = 43, 
		RULE_expressionStatement = 44, RULE_unsetStatement = 45, RULE_foreachStatement = 46, 
		RULE_tryCatchFinally = 47, RULE_catchClause = 48, RULE_finallyStatement = 49, 
		RULE_throwStatement = 50, RULE_gotoStatement = 51, RULE_declareStatement = 52, 
		RULE_inlineHtmlStatement = 53, RULE_declareList = 54, RULE_formalParameterList = 55, 
		RULE_formalParameter = 56, RULE_typeHint = 57, RULE_globalStatement = 58, 
		RULE_globalVar = 59, RULE_echoStatement = 60, RULE_staticVariableStatement = 61, 
		RULE_classStatement = 62, RULE_traitAdaptations = 63, RULE_traitAdaptationStatement = 64, 
		RULE_traitPrecedence = 65, RULE_traitAlias = 66, RULE_traitMethodReference = 67, 
		RULE_baseCtorCall = 68, RULE_methodBody = 69, RULE_propertyModifiers = 70, 
		RULE_memberModifiers = 71, RULE_variableInitializer = 72, RULE_identifierInitializer = 73, 
		RULE_globalConstantDeclaration = 74, RULE_expressionList = 75, RULE_parentheses = 76, 
		RULE_expression = 77, RULE_assignable = 78, RULE_arrayCreation = 79, RULE_lambdaFunctionExpr = 80, 
		RULE_matchExpr = 81, RULE_matchItem = 82, RULE_newExpr = 83, RULE_assignmentOperator = 84, 
		RULE_yieldExpression = 85, RULE_arrayItemList = 86, RULE_arrayItem = 87, 
		RULE_lambdaFunctionUseVars = 88, RULE_lambdaFunctionUseVar = 89, RULE_qualifiedStaticTypeRef = 90, 
		RULE_typeRef = 91, RULE_anonymousClass = 92, RULE_indirectTypeRef = 93, 
		RULE_qualifiedNamespaceName = 94, RULE_namespaceNameList = 95, RULE_namespaceNameTail = 96, 
		RULE_qualifiedNamespaceNameList = 97, RULE_arguments = 98, RULE_actualArgument = 99, 
		RULE_argumentName = 100, RULE_constantInitializer = 101, RULE_constant = 102, 
		RULE_literalConstant = 103, RULE_numericConstant = 104, RULE_classConstant = 105, 
		RULE_stringConstant = 106, RULE_string = 107, RULE_interpolatedStringPart = 108, 
		RULE_chainList = 109, RULE_chain = 110, RULE_chainOrigin = 111, RULE_memberAccess = 112, 
		RULE_functionCall = 113, RULE_functionCallName = 114, RULE_actualArguments = 115, 
		RULE_chainBase = 116, RULE_keyedFieldName = 117, RULE_keyedSimpleFieldName = 118, 
		RULE_keyedVariable = 119, RULE_squareCurlyExpression = 120, RULE_assignmentList = 121, 
		RULE_assignmentListElement = 122, RULE_modifier = 123, RULE_identifier = 124, 
		RULE_memberModifier = 125, RULE_magicConstant = 126, RULE_magicMethod = 127, 
		RULE_primitiveType = 128, RULE_castOperation = 129;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "inlineHtml", "htmlElement", "scriptText", "phpBlock", 
			"topStatement", "useDeclaration", "useDeclarationContentList", "useDeclarationContent", 
			"namespaceDeclaration", "namespaceStatement", "functionDeclaration", 
			"classDeclaration", "classEntryType", "interfaceList", "typeParameterListInBrackets", 
			"typeParameterList", "typeParameterWithDefaultsList", "typeParameterDecl", 
			"typeParameterWithDefaultDecl", "genericDynamicArgs", "attributes", "attributeGroup", 
			"attribute", "innerStatementList", "innerStatement", "statement", "emptyStatement_", 
			"blockStatement", "ifStatement", "elseIfStatement", "elseIfColonStatement", 
			"elseStatement", "elseColonStatement", "whileStatement", "doWhileStatement", 
			"forStatement", "forInit", "forUpdate", "switchStatement", "switchBlock", 
			"breakStatement", "continueStatement", "returnStatement", "expressionStatement", 
			"unsetStatement", "foreachStatement", "tryCatchFinally", "catchClause", 
			"finallyStatement", "throwStatement", "gotoStatement", "declareStatement", 
			"inlineHtmlStatement", "declareList", "formalParameterList", "formalParameter", 
			"typeHint", "globalStatement", "globalVar", "echoStatement", "staticVariableStatement", 
			"classStatement", "traitAdaptations", "traitAdaptationStatement", "traitPrecedence", 
			"traitAlias", "traitMethodReference", "baseCtorCall", "methodBody", "propertyModifiers", 
			"memberModifiers", "variableInitializer", "identifierInitializer", "globalConstantDeclaration", 
			"expressionList", "parentheses", "expression", "assignable", "arrayCreation", 
			"lambdaFunctionExpr", "matchExpr", "matchItem", "newExpr", "assignmentOperator", 
			"yieldExpression", "arrayItemList", "arrayItem", "lambdaFunctionUseVars", 
			"lambdaFunctionUseVar", "qualifiedStaticTypeRef", "typeRef", "anonymousClass", 
			"indirectTypeRef", "qualifiedNamespaceName", "namespaceNameList", "namespaceNameTail", 
			"qualifiedNamespaceNameList", "arguments", "actualArgument", "argumentName", 
			"constantInitializer", "constant", "literalConstant", "numericConstant", 
			"classConstant", "stringConstant", "string", "interpolatedStringPart", 
			"chainList", "chain", "chainOrigin", "memberAccess", "functionCall", 
			"functionCallName", "actualArguments", "chainBase", "keyedFieldName", 
			"keyedSimpleFieldName", "keyedVariable", "squareCurlyExpression", "assignmentList", 
			"assignmentListElement", "modifier", "identifier", "memberModifier", 
			"magicConstant", "magicMethod", "primitiveType", "castOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<?xml'", null, null, null, null, null, null, null, 
			null, null, "'?>'", null, null, "'/>'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'#['", "'abstract'", 
			"'array'", "'as'", "'binary'", null, null, "'break'", "'callable'", "'case'", 
			"'catch'", "'class'", "'clone'", "'const'", "'continue'", "'declare'", 
			"'default'", "'do'", "'real'", "'double'", "'echo'", "'else'", "'elseif'", 
			"'empty'", "'enddeclare'", "'endfor'", "'endforeach'", "'endif'", "'endswitch'", 
			"'endwhile'", "'eval'", "'die'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'foreach'", "'function'", "'global'", "'goto'", 
			"'if'", "'implements'", "'import'", "'include'", "'include_once'", "'instanceof'", 
			"'insteadof'", "'int8'", "'int16'", "'int64'", null, "'interface'", "'isset'", 
			"'list'", "'and'", "'or'", "'xor'", "'match'", "'namespace'", "'new'", 
			"'null'", "'object'", "'parent'", "'partial'", "'print'", "'private'", 
			"'protected'", "'public'", "'require'", "'require_once'", "'resource'", 
			"'return'", "'static'", "'string'", "'switch'", "'throw'", "'trait'", 
			"'try'", "'clrtypeof'", null, "'unicode'", "'unset'", "'use'", "'var'", 
			"'while'", "'yield'", "'from'", "'fn'", "'__get'", "'__set'", "'__call'", 
			"'__callstatic'", "'__construct'", "'__destruct'", "'__wakeup'", "'__sleep'", 
			"'__autoload'", "'__isset'", "'__unset'", "'__tostring'", "'__invoke'", 
			"'__set_state'", "'__clone'", "'__debuginfo'", "'__namespace__'", "'__class__'", 
			"'__trait__'", "'__function__'", "'__method__'", "'__line__'", "'__file__'", 
			"'__dir__'", "'<=>'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", 
			"'!=='", "'=='", null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", 
			"'**='", "'/='", "'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", 
			"'||'", "'&&'", "'??'", "'??='", "'<<'", "'>>'", "'::'", "'->'", "'\\'", 
			"'...'", null, null, "'&'", "'|'", "'!'", "'^'", "'+'", "'-'", "'*'", 
			"'%'", null, "'~'", "'@'", null, "'.'", null, "'('", "')'", "'['", "']'", 
			null, "'}'", "','", "':'", "';'", null, "'''", "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SeaWhitespace", "HtmlText", "XmlStart", "PHPStart", "HtmlScriptOpen", 
			"HtmlStyleOpen", "HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", 
			"XmlText", "XmlClose", "PHPStartInside", "HtmlClose", "HtmlSlashClose", 
			"HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", "HtmlStartDoubleQuoteString", 
			"HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", "ErrorInside", "PHPStartInsideQuoteString", 
			"HtmlEndQuoteString", "HtmlQuoteString", "ErrorHtmlQuote", "PHPStartDoubleQuoteString", 
			"HtmlEndDoubleQuoteString", "HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", 
			"ScriptText", "HtmlScriptClose", "PHPStartInsideScript", "StyleBody", 
			"PHPEnd", "Whitespace", "MultiLineComment", "SingleLineComment", "ShellStyleComment", 
			"AttributeStart", "Abstract", "Array", "As", "BinaryCast", "BoolType", 
			"BooleanConstant", "Break", "Callable", "Case", "Catch", "Class", "Clone", 
			"Const", "Continue", "Declare", "Default", "Do", "DoubleCast", "DoubleType", 
			"Echo", "Else", "ElseIf", "Empty", "EndDeclare", "EndFor", "EndForeach", 
			"EndIf", "EndSwitch", "EndWhile", "Eval", "Exit", "Extends", "Final", 
			"Finally", "FloatCast", "For", "Foreach", "Function_", "Global", "Goto", 
			"If", "Implements", "Import", "Include", "IncludeOnce", "InstanceOf", 
			"InsteadOf", "Int8Cast", "Int16Cast", "Int64Type", "IntType", "Interface", 
			"IsSet", "List", "LogicalAnd", "LogicalOr", "LogicalXor", "Match_", "Namespace", 
			"New", "Null", "ObjectType", "Parent_", "Partial", "Print", "Private", 
			"Protected", "Public", "Require", "RequireOnce", "Resource", "Return", 
			"Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", 
			"UintCast", "UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "From", 
			"LambdaFn", "Get", "Set", "Call", "CallStatic", "Constructor", "Destruct", 
			"Wakeup", "Sleep", "Autoload", "IsSet__", "Unset__", "ToString__", "Invoke", 
			"SetState", "Clone__", "DebugInfo", "Namespace__", "Class__", "Traic__", 
			"Function__", "Method__", "Line__", "File__", "Dir__", "Spaceship", "Lgeneric", 
			"Rgeneric", "DoubleArrow", "Inc", "Dec", "IsIdentical", "IsNoidentical", 
			"IsEqual", "IsNotEq", "IsSmallerOrEqual", "IsGreaterOrEqual", "PlusEqual", 
			"MinusEqual", "MulEqual", "Pow", "PowEqual", "DivEqual", "Concaequal", 
			"ModEqual", "ShiftLeftEqual", "ShiftRightEqual", "AndEqual", "OrEqual", 
			"XorEqual", "BooleanOr", "BooleanAnd", "NullCoalescing", "NullCoalescingEqual", 
			"ShiftLeft", "ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", 
			"Ellipsis", "Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", 
			"Plus", "Minus", "Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", 
			"Dollar", "Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
			"OpenSquareBracket", "CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", 
			"Comma", "Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", 
			"Label", "Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", 
			"SingleQuoteString", "DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", 
			"CurlyDollar", "UnicodeEscape", "StringPart", "Comment", "PHPEndSingleLineComment", 
			"CommentEnd", "HereDocText", "XmlText2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PhpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PhpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PhpParser.EOF, 0); }
		public TerminalNode Shebang() { return getToken(PhpParser.Shebang, 0); }
		public List<InlineHtmlContext> inlineHtml() {
			return getRuleContexts(InlineHtmlContext.class);
		}
		public InlineHtmlContext inlineHtml(int i) {
			return getRuleContext(InlineHtmlContext.class,i);
		}
		public List<PhpBlockContext> phpBlock() {
			return getRuleContexts(PhpBlockContext.class);
		}
		public PhpBlockContext phpBlock(int i) {
			return getRuleContext(PhpBlockContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Shebang) {
				{
				setState(260);
				match(Shebang);
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << HtmlScriptClose) | (1L << StyleBody) | (1L << AttributeStart) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function_ - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Match_ - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (While - 128)) | (1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)) | (1L << (Tilde - 195)) | (1L << (SuppressWarnings - 195)) | (1L << (Dollar - 195)) | (1L << (OpenRoundBracket - 195)) | (1L << (OpenSquareBracket - 195)) | (1L << (OpenCurlyBracket - 195)) | (1L << (SemiColon - 195)) | (1L << (VarName - 195)) | (1L << (Label - 195)) | (1L << (Octal - 195)) | (1L << (Decimal - 195)) | (1L << (Real - 195)) | (1L << (Hex - 195)) | (1L << (Binary - 195)) | (1L << (BackQuoteString - 195)) | (1L << (SingleQuoteString - 195)) | (1L << (DoubleQuote - 195)) | (1L << (StartNowDoc - 195)) | (1L << (StartHereDoc - 195)))) != 0)) {
				{
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(263);
					inlineHtml();
					}
					break;
				case 2:
					{
					setState(264);
					phpBlock();
					}
					break;
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineHtmlContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public ScriptTextContext scriptText() {
			return getRuleContext(ScriptTextContext.class,0);
		}
		public InlineHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInlineHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInlineHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInlineHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineHtmlContext inlineHtml() throws RecognitionException {
		InlineHtmlContext _localctx = new InlineHtmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inlineHtml);
		try {
			int _alt;
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case HtmlScriptClose:
			case StyleBody:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(272);
						htmlElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(275); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ScriptText:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				scriptText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode HtmlDtd() { return getToken(PhpParser.HtmlDtd, 0); }
		public TerminalNode HtmlClose() { return getToken(PhpParser.HtmlClose, 0); }
		public TerminalNode HtmlStyleOpen() { return getToken(PhpParser.HtmlStyleOpen, 0); }
		public TerminalNode HtmlOpen() { return getToken(PhpParser.HtmlOpen, 0); }
		public TerminalNode HtmlName() { return getToken(PhpParser.HtmlName, 0); }
		public TerminalNode HtmlSlashClose() { return getToken(PhpParser.HtmlSlashClose, 0); }
		public TerminalNode HtmlSlash() { return getToken(PhpParser.HtmlSlash, 0); }
		public TerminalNode HtmlText() { return getToken(PhpParser.HtmlText, 0); }
		public TerminalNode HtmlEquals() { return getToken(PhpParser.HtmlEquals, 0); }
		public TerminalNode HtmlStartQuoteString() { return getToken(PhpParser.HtmlStartQuoteString, 0); }
		public TerminalNode HtmlEndQuoteString() { return getToken(PhpParser.HtmlEndQuoteString, 0); }
		public TerminalNode HtmlStartDoubleQuoteString() { return getToken(PhpParser.HtmlStartDoubleQuoteString, 0); }
		public TerminalNode HtmlEndDoubleQuoteString() { return getToken(PhpParser.HtmlEndDoubleQuoteString, 0); }
		public TerminalNode HtmlHex() { return getToken(PhpParser.HtmlHex, 0); }
		public TerminalNode HtmlDecimal() { return getToken(PhpParser.HtmlDecimal, 0); }
		public TerminalNode HtmlQuoteString() { return getToken(PhpParser.HtmlQuoteString, 0); }
		public TerminalNode HtmlDoubleQuoteString() { return getToken(PhpParser.HtmlDoubleQuoteString, 0); }
		public TerminalNode StyleBody() { return getToken(PhpParser.StyleBody, 0); }
		public TerminalNode HtmlScriptOpen() { return getToken(PhpParser.HtmlScriptOpen, 0); }
		public TerminalNode HtmlScriptClose() { return getToken(PhpParser.HtmlScriptClose, 0); }
		public TerminalNode XmlStart() { return getToken(PhpParser.XmlStart, 0); }
		public TerminalNode XmlClose() { return getToken(PhpParser.XmlClose, 0); }
		public List<TerminalNode> XmlText() { return getTokens(PhpParser.XmlText); }
		public TerminalNode XmlText(int i) {
			return getToken(PhpParser.XmlText, i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlDtd:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(HtmlDtd);
				}
				break;
			case HtmlClose:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(HtmlClose);
				}
				break;
			case HtmlStyleOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(HtmlStyleOpen);
				}
				break;
			case HtmlOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(HtmlOpen);
				}
				break;
			case HtmlName:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(HtmlName);
				}
				break;
			case HtmlSlashClose:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(HtmlSlashClose);
				}
				break;
			case HtmlSlash:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(HtmlSlash);
				}
				break;
			case HtmlText:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(HtmlText);
				}
				break;
			case HtmlEquals:
				enterOuterAlt(_localctx, 9);
				{
				setState(288);
				match(HtmlEquals);
				}
				break;
			case HtmlStartQuoteString:
				enterOuterAlt(_localctx, 10);
				{
				setState(289);
				match(HtmlStartQuoteString);
				}
				break;
			case HtmlEndQuoteString:
				enterOuterAlt(_localctx, 11);
				{
				setState(290);
				match(HtmlEndQuoteString);
				}
				break;
			case HtmlStartDoubleQuoteString:
				enterOuterAlt(_localctx, 12);
				{
				setState(291);
				match(HtmlStartDoubleQuoteString);
				}
				break;
			case HtmlEndDoubleQuoteString:
				enterOuterAlt(_localctx, 13);
				{
				setState(292);
				match(HtmlEndDoubleQuoteString);
				}
				break;
			case HtmlHex:
				enterOuterAlt(_localctx, 14);
				{
				setState(293);
				match(HtmlHex);
				}
				break;
			case HtmlDecimal:
				enterOuterAlt(_localctx, 15);
				{
				setState(294);
				match(HtmlDecimal);
				}
				break;
			case HtmlQuoteString:
				enterOuterAlt(_localctx, 16);
				{
				setState(295);
				match(HtmlQuoteString);
				}
				break;
			case HtmlDoubleQuoteString:
				enterOuterAlt(_localctx, 17);
				{
				setState(296);
				match(HtmlDoubleQuoteString);
				}
				break;
			case StyleBody:
				enterOuterAlt(_localctx, 18);
				{
				setState(297);
				match(StyleBody);
				}
				break;
			case HtmlScriptOpen:
				enterOuterAlt(_localctx, 19);
				{
				setState(298);
				match(HtmlScriptOpen);
				}
				break;
			case HtmlScriptClose:
				enterOuterAlt(_localctx, 20);
				{
				setState(299);
				match(HtmlScriptClose);
				}
				break;
			case XmlStart:
				enterOuterAlt(_localctx, 21);
				{
				setState(300);
				match(XmlStart);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==XmlText) {
					{
					{
					setState(301);
					match(XmlText);
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(XmlClose);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptTextContext extends ParserRuleContext {
		public List<TerminalNode> ScriptText() { return getTokens(PhpParser.ScriptText); }
		public TerminalNode ScriptText(int i) {
			return getToken(PhpParser.ScriptText, i);
		}
		public ScriptTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterScriptText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitScriptText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitScriptText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptTextContext scriptText() throws RecognitionException {
		ScriptTextContext _localctx = new ScriptTextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(310);
					match(ScriptText);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(313); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhpBlockContext extends ParserRuleContext {
		public List<TopStatementContext> topStatement() {
			return getRuleContexts(TopStatementContext.class);
		}
		public TopStatementContext topStatement(int i) {
			return getRuleContext(TopStatementContext.class,i);
		}
		public PhpBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phpBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPhpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPhpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPhpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhpBlockContext phpBlock() throws RecognitionException {
		PhpBlockContext _localctx = new PhpBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_phpBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(315);
					topStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(318); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public NamespaceDeclarationContext namespaceDeclaration() {
			return getRuleContext(NamespaceDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public TopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopStatementContext topStatement() throws RecognitionException {
		TopStatementContext _localctx = new TopStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topStatement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				namespaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				globalConstantDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public UseDeclarationContentListContext useDeclarationContentList() {
			return getRuleContext(UseDeclarationContentListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Use);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Function_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(332);
			useDeclarationContentList();
			setState(333);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContentListContext extends ParserRuleContext {
		public List<UseDeclarationContentContext> useDeclarationContent() {
			return getRuleContexts(UseDeclarationContentContext.class);
		}
		public UseDeclarationContentContext useDeclarationContent(int i) {
			return getRuleContext(UseDeclarationContentContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public UseDeclarationContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclarationContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclarationContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclarationContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentListContext useDeclarationContentList() throws RecognitionException {
		UseDeclarationContentListContext _localctx = new UseDeclarationContentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_useDeclarationContentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(335);
				match(NamespaceSeparator);
				}
			}

			setState(338);
			useDeclarationContent();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(339);
				match(Comma);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NamespaceSeparator) {
					{
					setState(340);
					match(NamespaceSeparator);
					}
				}

				setState(343);
				useDeclarationContent();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseDeclarationContentContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public UseDeclarationContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclarationContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUseDeclarationContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUseDeclarationContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUseDeclarationContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContentContext useDeclarationContent() throws RecognitionException {
		UseDeclarationContentContext _localctx = new UseDeclarationContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useDeclarationContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			namespaceNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<NamespaceStatementContext> namespaceStatement() {
			return getRuleContexts(NamespaceStatementContext.class);
		}
		public NamespaceStatementContext namespaceStatement(int i) {
			return getRuleContext(NamespaceStatementContext.class,i);
		}
		public NamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDeclarationContext namespaceDeclaration() throws RecognitionException {
		NamespaceDeclarationContext _localctx = new NamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_namespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Namespace);
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) {
					{
					setState(352);
					namespaceNameList();
					}
				}

				setState(355);
				match(OpenCurlyBracket);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HtmlText) | (1L << XmlStart) | (1L << HtmlScriptOpen) | (1L << HtmlStyleOpen) | (1L << HtmlDtd) | (1L << HtmlOpen) | (1L << HtmlClose) | (1L << HtmlSlashClose) | (1L << HtmlSlash) | (1L << HtmlEquals) | (1L << HtmlStartQuoteString) | (1L << HtmlStartDoubleQuoteString) | (1L << HtmlHex) | (1L << HtmlDecimal) | (1L << HtmlName) | (1L << HtmlEndQuoteString) | (1L << HtmlQuoteString) | (1L << HtmlEndDoubleQuoteString) | (1L << HtmlDoubleQuoteString) | (1L << ScriptText) | (1L << HtmlScriptClose) | (1L << StyleBody) | (1L << AttributeStart) | (1L << Abstract) | (1L << Array) | (1L << As) | (1L << BinaryCast) | (1L << BoolType) | (1L << BooleanConstant) | (1L << Break) | (1L << Callable) | (1L << Case) | (1L << Catch) | (1L << Class) | (1L << Clone) | (1L << Const) | (1L << Continue) | (1L << Declare) | (1L << Default) | (1L << Do) | (1L << DoubleCast) | (1L << DoubleType) | (1L << Echo))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Else - 64)) | (1L << (ElseIf - 64)) | (1L << (Empty - 64)) | (1L << (EndDeclare - 64)) | (1L << (EndFor - 64)) | (1L << (EndForeach - 64)) | (1L << (EndIf - 64)) | (1L << (EndSwitch - 64)) | (1L << (EndWhile - 64)) | (1L << (Eval - 64)) | (1L << (Exit - 64)) | (1L << (Extends - 64)) | (1L << (Final - 64)) | (1L << (Finally - 64)) | (1L << (FloatCast - 64)) | (1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (Function_ - 64)) | (1L << (Global - 64)) | (1L << (Goto - 64)) | (1L << (If - 64)) | (1L << (Implements - 64)) | (1L << (Import - 64)) | (1L << (Include - 64)) | (1L << (IncludeOnce - 64)) | (1L << (InstanceOf - 64)) | (1L << (InsteadOf - 64)) | (1L << (Int8Cast - 64)) | (1L << (Int16Cast - 64)) | (1L << (Int64Type - 64)) | (1L << (IntType - 64)) | (1L << (Interface - 64)) | (1L << (IsSet - 64)) | (1L << (List - 64)) | (1L << (LogicalAnd - 64)) | (1L << (LogicalOr - 64)) | (1L << (LogicalXor - 64)) | (1L << (Match_ - 64)) | (1L << (Namespace - 64)) | (1L << (New - 64)) | (1L << (Null - 64)) | (1L << (ObjectType - 64)) | (1L << (Parent_ - 64)) | (1L << (Partial - 64)) | (1L << (Print - 64)) | (1L << (Private - 64)) | (1L << (Protected - 64)) | (1L << (Public - 64)) | (1L << (Require - 64)) | (1L << (RequireOnce - 64)) | (1L << (Resource - 64)) | (1L << (Return - 64)) | (1L << (Static - 64)) | (1L << (StringType - 64)) | (1L << (Switch - 64)) | (1L << (Throw - 64)) | (1L << (Trait - 64)) | (1L << (Try - 64)) | (1L << (Typeof - 64)) | (1L << (UintCast - 64)) | (1L << (UnicodeCast - 64)) | (1L << (Unset - 64)) | (1L << (Use - 64)) | (1L << (Var - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (While - 128)) | (1L << (Yield - 128)) | (1L << (From - 128)) | (1L << (LambdaFn - 128)) | (1L << (Get - 128)) | (1L << (Set - 128)) | (1L << (Call - 128)) | (1L << (CallStatic - 128)) | (1L << (Constructor - 128)) | (1L << (Destruct - 128)) | (1L << (Wakeup - 128)) | (1L << (Sleep - 128)) | (1L << (Autoload - 128)) | (1L << (IsSet__ - 128)) | (1L << (Unset__ - 128)) | (1L << (ToString__ - 128)) | (1L << (Invoke - 128)) | (1L << (SetState - 128)) | (1L << (Clone__ - 128)) | (1L << (DebugInfo - 128)) | (1L << (Namespace__ - 128)) | (1L << (Class__ - 128)) | (1L << (Traic__ - 128)) | (1L << (Function__ - 128)) | (1L << (Method__ - 128)) | (1L << (Line__ - 128)) | (1L << (File__ - 128)) | (1L << (Dir__ - 128)) | (1L << (Inc - 128)) | (1L << (Dec - 128)) | (1L << (NamespaceSeparator - 128)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)) | (1L << (Tilde - 195)) | (1L << (SuppressWarnings - 195)) | (1L << (Dollar - 195)) | (1L << (OpenRoundBracket - 195)) | (1L << (OpenSquareBracket - 195)) | (1L << (OpenCurlyBracket - 195)) | (1L << (SemiColon - 195)) | (1L << (VarName - 195)) | (1L << (Label - 195)) | (1L << (Octal - 195)) | (1L << (Decimal - 195)) | (1L << (Real - 195)) | (1L << (Hex - 195)) | (1L << (Binary - 195)) | (1L << (BackQuoteString - 195)) | (1L << (SingleQuoteString - 195)) | (1L << (DoubleQuote - 195)) | (1L << (StartNowDoc - 195)) | (1L << (StartHereDoc - 195)))) != 0)) {
					{
					{
					setState(356);
					namespaceStatement();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(362);
				match(CloseCurlyBracket);
				}
				break;
			case 2:
				{
				setState(363);
				namespaceNameList();
				setState(364);
				match(SemiColon);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext globalConstantDeclaration() {
			return getRuleContext(GlobalConstantDeclarationContext.class,0);
		}
		public NamespaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceStatementContext namespaceStatement() throws RecognitionException {
		NamespaceStatementContext _localctx = new NamespaceStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_namespaceStatement);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				useDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				globalConstantDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(375);
				attributes();
				}
			}

			setState(378);
			match(Function_);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(379);
				match(Ampersand);
				}
			}

			setState(382);
			identifier();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(383);
				typeParameterListInBrackets();
				}
			}

			setState(386);
			match(OpenRoundBracket);
			setState(387);
			formalParameterList();
			setState(388);
			match(CloseRoundBracket);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(389);
				match(Colon);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QuestionMark) {
					{
					setState(390);
					match(QuestionMark);
					}
				}

				setState(393);
				typeHint(0);
				}
			}

			setState(396);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(398);
				attributes();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(401);
				match(Private);
				}
			}

			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(404);
				modifier();
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(407);
				match(Partial);
				}
			}

			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(410);
				classEntryType();
				setState(411);
				identifier();
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(412);
					typeParameterListInBrackets();
					}
				}

				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(415);
					match(Extends);
					setState(416);
					qualifiedStaticTypeRef();
					}
				}

				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(419);
					match(Implements);
					setState(420);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(423);
				match(Interface);
				setState(424);
				identifier();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(425);
					typeParameterListInBrackets();
					}
				}

				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(428);
					match(Extends);
					setState(429);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(434);
			match(OpenCurlyBracket);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AttributeStart) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function_ - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0)) {
				{
				{
				setState(435);
				classStatement();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassEntryTypeContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public ClassEntryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classEntryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassEntryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassEntryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassEntryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassEntryTypeContext classEntryType() throws RecognitionException {
		ClassEntryTypeContext _localctx = new ClassEntryTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classEntryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Trait) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceListContext extends ParserRuleContext {
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public InterfaceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInterfaceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInterfaceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInterfaceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceListContext interfaceList() throws RecognitionException {
		InterfaceListContext _localctx = new InterfaceListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interfaceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			qualifiedStaticTypeRef();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(446);
				match(Comma);
				setState(447);
				qualifiedStaticTypeRef();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListInBracketsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() {
			return getRuleContext(TypeParameterWithDefaultsListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TypeParameterListInBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterListInBrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterListInBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterListInBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterListInBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListInBracketsContext typeParameterListInBrackets() throws RecognitionException {
		TypeParameterListInBracketsContext _localctx = new TypeParameterListInBracketsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeParameterListInBrackets);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(Lgeneric);
				setState(454);
				typeParameterList();
				setState(455);
				match(Rgeneric);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(Lgeneric);
				setState(458);
				typeParameterWithDefaultsList();
				setState(459);
				match(Rgeneric);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(Lgeneric);
				setState(462);
				typeParameterList();
				setState(463);
				match(Comma);
				setState(464);
				typeParameterWithDefaultsList();
				setState(465);
				match(Rgeneric);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterDeclContext> typeParameterDecl() {
			return getRuleContexts(TypeParameterDeclContext.class);
		}
		public TypeParameterDeclContext typeParameterDecl(int i) {
			return getRuleContext(TypeParameterDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			typeParameterDecl();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					match(Comma);
					setState(471);
					typeParameterDecl();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterWithDefaultsListContext extends ParserRuleContext {
		public List<TypeParameterWithDefaultDeclContext> typeParameterWithDefaultDecl() {
			return getRuleContexts(TypeParameterWithDefaultDeclContext.class);
		}
		public TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl(int i) {
			return getRuleContext(TypeParameterWithDefaultDeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public TypeParameterWithDefaultsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterWithDefaultsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterWithDefaultsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultsListContext typeParameterWithDefaultsList() throws RecognitionException {
		TypeParameterWithDefaultsListContext _localctx = new TypeParameterWithDefaultsListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameterWithDefaultsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			typeParameterWithDefaultDecl();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(478);
				match(Comma);
				setState(479);
				typeParameterWithDefaultDecl();
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterDeclContext typeParameterDecl() throws RecognitionException {
		TypeParameterDeclContext _localctx = new TypeParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(485);
				attributes();
				}
			}

			setState(488);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterWithDefaultDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeParameterWithDefaultDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterWithDefaultDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeParameterWithDefaultDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeParameterWithDefaultDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeParameterWithDefaultDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterWithDefaultDeclContext typeParameterWithDefaultDecl() throws RecognitionException {
		TypeParameterWithDefaultDeclContext _localctx = new TypeParameterWithDefaultDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeParameterWithDefaultDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(490);
				attributes();
				}
			}

			setState(493);
			identifier();
			setState(494);
			match(Eq);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(495);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(496);
				primitiveType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericDynamicArgsContext extends ParserRuleContext {
		public TerminalNode Lgeneric() { return getToken(PhpParser.Lgeneric, 0); }
		public List<TypeRefContext> typeRef() {
			return getRuleContexts(TypeRefContext.class);
		}
		public TypeRefContext typeRef(int i) {
			return getRuleContext(TypeRefContext.class,i);
		}
		public TerminalNode Rgeneric() { return getToken(PhpParser.Rgeneric, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GenericDynamicArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDynamicArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGenericDynamicArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGenericDynamicArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGenericDynamicArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDynamicArgsContext genericDynamicArgs() throws RecognitionException {
		GenericDynamicArgsContext _localctx = new GenericDynamicArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_genericDynamicArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(Lgeneric);
			setState(500);
			typeRef();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(501);
				match(Comma);
				setState(502);
				typeRef();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(Rgeneric);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeGroupContext> attributeGroup() {
			return getRuleContexts(AttributeGroupContext.class);
		}
		public AttributeGroupContext attributeGroup(int i) {
			return getRuleContext(AttributeGroupContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(510);
				attributeGroup();
				}
				}
				setState(513); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AttributeStart );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeGroupContext extends ParserRuleContext {
		public TerminalNode AttributeStart() { return getToken(PhpParser.AttributeStart, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AttributeGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttributeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttributeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttributeGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeGroupContext attributeGroup() throws RecognitionException {
		AttributeGroupContext _localctx = new AttributeGroupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attributeGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(AttributeStart);
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(516);
				identifier();
				setState(517);
				match(Colon);
				}
				break;
			}
			setState(521);
			attribute();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(522);
				match(Comma);
				setState(523);
				attribute();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(CloseSquareBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			qualifiedNamespaceName();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(532);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerStatementListContext extends ParserRuleContext {
		public List<InnerStatementContext> innerStatement() {
			return getRuleContexts(InnerStatementContext.class);
		}
		public InnerStatementContext innerStatement(int i) {
			return getRuleContext(InnerStatementContext.class,i);
		}
		public InnerStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInnerStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInnerStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInnerStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementListContext innerStatementList() throws RecognitionException {
		InnerStatementListContext _localctx = new InnerStatementListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_innerStatementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					innerStatement();
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InnerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInnerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInnerStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInnerStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStatementContext innerStatement() throws RecognitionException {
		InnerStatementContext _localctx = new InnerStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_innerStatement);
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(543);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GlobalStatementContext globalStatement() {
			return getRuleContext(GlobalStatementContext.class,0);
		}
		public StaticVariableStatementContext staticVariableStatement() {
			return getRuleContext(StaticVariableStatementContext.class,0);
		}
		public EchoStatementContext echoStatement() {
			return getRuleContext(EchoStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public UnsetStatementContext unsetStatement() {
			return getRuleContext(UnsetStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public TryCatchFinallyContext tryCatchFinally() {
			return getRuleContext(TryCatchFinallyContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public DeclareStatementContext declareStatement() {
			return getRuleContext(DeclareStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public InlineHtmlStatementContext inlineHtmlStatement() {
			return getRuleContext(InlineHtmlStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				identifier();
				setState(547);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
				switchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(555);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(556);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(557);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(558);
				yieldExpression();
				setState(559);
				match(SemiColon);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(561);
				globalStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(562);
				staticVariableStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(563);
				echoStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(564);
				expressionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(565);
				unsetStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(566);
				foreachStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(567);
				tryCatchFinally();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(568);
				throwStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(569);
				gotoStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(570);
				declareStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(571);
				emptyStatement_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(572);
				inlineHtmlStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_blockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(OpenCurlyBracket);
			setState(578);
			innerStatementList();
			setState(579);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<ElseIfColonStatementContext> elseIfColonStatement() {
			return getRuleContexts(ElseIfColonStatementContext.class);
		}
		public ElseIfColonStatementContext elseIfColonStatement(int i) {
			return getRuleContext(ElseIfColonStatementContext.class,i);
		}
		public ElseColonStatementContext elseColonStatement() {
			return getRuleContext(ElseColonStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(If);
				setState(582);
				parentheses();
				setState(583);
				statement();
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						elseIfStatement();
						}
						} 
					}
					setState(589);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(591);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(590);
					elseStatement();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(If);
				setState(594);
				parentheses();
				setState(595);
				match(Colon);
				setState(596);
				innerStatementList();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ElseIf) {
					{
					{
					setState(597);
					elseIfColonStatement();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(603);
					elseColonStatement();
					}
				}

				setState(606);
				match(EndIf);
				setState(607);
				match(SemiColon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(ElseIf);
			setState(612);
			parentheses();
			setState(613);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfColonStatementContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseIfColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseIfColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseIfColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseIfColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfColonStatementContext elseIfColonStatement() throws RecognitionException {
		ElseIfColonStatementContext _localctx = new ElseIfColonStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_elseIfColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(ElseIf);
			setState(616);
			parentheses();
			setState(617);
			match(Colon);
			setState(618);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(Else);
			setState(621);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseColonStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public ElseColonStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseColonStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterElseColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitElseColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitElseColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseColonStatementContext elseColonStatement() throws RecognitionException {
		ElseColonStatementContext _localctx = new ElseColonStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elseColonStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(Else);
			setState(624);
			match(Colon);
			setState(625);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(While);
			setState(628);
			parentheses();
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(629);
				statement();
				}
				break;
			case Colon:
				{
				setState(630);
				match(Colon);
				setState(631);
				innerStatementList();
				setState(632);
				match(EndWhile);
				setState(633);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(Do);
			setState(638);
			statement();
			setState(639);
			match(While);
			setState(640);
			parentheses();
			setState(641);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(For);
			setState(644);
			match(OpenRoundBracket);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(645);
				forInit();
				}
			}

			setState(648);
			match(SemiColon);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(649);
				expressionList();
				}
			}

			setState(652);
			match(SemiColon);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(653);
				forUpdate();
				}
			}

			setState(656);
			match(CloseRoundBracket);
			setState(663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(657);
				statement();
				}
				break;
			case Colon:
				{
				setState(658);
				match(Colon);
				setState(659);
				innerStatementList();
				setState(660);
				match(EndFor);
				setState(661);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<SwitchBlockContext> switchBlock() {
			return getRuleContexts(SwitchBlockContext.class);
		}
		public SwitchBlockContext switchBlock(int i) {
			return getRuleContext(SwitchBlockContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(Switch);
			setState(670);
			parentheses();
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBracket:
				{
				setState(671);
				match(OpenCurlyBracket);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(672);
					match(SemiColon);
					}
				}

				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(675);
					switchBlock();
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(CloseCurlyBracket);
				}
				break;
			case Colon:
				{
				setState(682);
				match(Colon);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(683);
					match(SemiColon);
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(686);
					switchBlock();
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(EndSwitch);
				setState(693);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(PhpParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PhpParser.Colon, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(PhpParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(PhpParser.SemiColon, i);
		}
		public List<TerminalNode> Case() { return getTokens(PhpParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(PhpParser.Case, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Default() { return getTokens(PhpParser.Default); }
		public TerminalNode Default(int i) {
			return getToken(PhpParser.Default, i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(699);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Case:
						{
						setState(696);
						match(Case);
						setState(697);
						expression(0);
						}
						break;
					case Default:
						{
						setState(698);
						match(Default);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(701);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==SemiColon) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(704); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(706);
			innerStatementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(Break);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(709);
				expression(0);
				}
			}

			setState(712);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(Continue);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(715);
				expression(0);
				}
			}

			setState(718);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(Return);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(721);
				expression(0);
				}
			}

			setState(724);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			expression(0);
			setState(727);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsetStatementContext extends ParserRuleContext {
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public UnsetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUnsetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUnsetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUnsetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetStatementContext unsetStatement() throws RecognitionException {
		UnsetStatementContext _localctx = new UnsetStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_unsetStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(Unset);
			setState(730);
			match(OpenRoundBracket);
			setState(731);
			chainList();
			setState(732);
			match(CloseRoundBracket);
			setState(733);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public List<TerminalNode> OpenRoundBracket() { return getTokens(PhpParser.OpenRoundBracket); }
		public TerminalNode OpenRoundBracket(int i) {
			return getToken(PhpParser.OpenRoundBracket, i);
		}
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public List<TerminalNode> CloseRoundBracket() { return getTokens(PhpParser.CloseRoundBracket); }
		public TerminalNode CloseRoundBracket(int i) {
			return getToken(PhpParser.CloseRoundBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Ampersand() { return getTokens(PhpParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(PhpParser.Ampersand, i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_foreachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(Foreach);
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(736);
				match(OpenRoundBracket);
				setState(737);
				chain();
				setState(738);
				match(As);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(739);
					match(Ampersand);
					}
				}

				setState(742);
				assignable();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(743);
					match(DoubleArrow);
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(744);
						match(Ampersand);
						}
					}

					setState(747);
					chain();
					}
				}

				setState(750);
				match(CloseRoundBracket);
				}
				break;
			case 2:
				{
				setState(752);
				match(OpenRoundBracket);
				setState(753);
				expression(0);
				setState(754);
				match(As);
				setState(755);
				assignable();
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(756);
					match(DoubleArrow);
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ampersand) {
						{
						setState(757);
						match(Ampersand);
						}
					}

					setState(760);
					chain();
					}
				}

				setState(763);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				{
				setState(765);
				match(OpenRoundBracket);
				setState(766);
				chain();
				setState(767);
				match(As);
				setState(768);
				match(List);
				setState(769);
				match(OpenRoundBracket);
				setState(770);
				assignmentList();
				setState(771);
				match(CloseRoundBracket);
				setState(772);
				match(CloseRoundBracket);
				}
				break;
			}
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(776);
				statement();
				}
				break;
			case Colon:
				{
				setState(777);
				match(Colon);
				setState(778);
				innerStatementList();
				setState(779);
				match(EndForeach);
				setState(780);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchFinallyContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTryCatchFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTryCatchFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTryCatchFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchFinallyContext tryCatchFinally() throws RecognitionException {
		TryCatchFinallyContext _localctx = new TryCatchFinallyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tryCatchFinally);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(Try);
			setState(785);
			blockStatement();
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(787); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(786);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(789); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(791);
					finallyStatement();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(794);
					catchClause();
					}
					}
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(800);
				finallyStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<QualifiedStaticTypeRefContext> qualifiedStaticTypeRef() {
			return getRuleContexts(QualifiedStaticTypeRefContext.class);
		}
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef(int i) {
			return getRuleContext(QualifiedStaticTypeRefContext.class,i);
		}
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<TerminalNode> Pipe() { return getTokens(PhpParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(PhpParser.Pipe, i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(Catch);
			setState(804);
			match(OpenRoundBracket);
			setState(805);
			qualifiedStaticTypeRef();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(806);
				match(Pipe);
				setState(807);
				qualifiedStaticTypeRef();
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			match(VarName);
			setState(814);
			match(CloseRoundBracket);
			setState(815);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFinallyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFinallyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(Finally);
			setState(818);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(Throw);
			setState(821);
			expression(0);
			setState(822);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Goto);
			setState(825);
			identifier();
			setState(826);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStatementContext extends ParserRuleContext {
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public DeclareListContext declareList() {
			return getRuleContext(DeclareListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public InnerStatementListContext innerStatementList() {
			return getRuleContext(InnerStatementListContext.class,0);
		}
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public DeclareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDeclareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDeclareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDeclareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareStatementContext declareStatement() throws RecognitionException {
		DeclareStatementContext _localctx = new DeclareStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_declareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(Declare);
			setState(829);
			match(OpenRoundBracket);
			setState(830);
			declareList();
			setState(831);
			match(CloseRoundBracket);
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HtmlText:
			case XmlStart:
			case HtmlScriptOpen:
			case HtmlStyleOpen:
			case HtmlDtd:
			case HtmlOpen:
			case HtmlClose:
			case HtmlSlashClose:
			case HtmlSlash:
			case HtmlEquals:
			case HtmlStartQuoteString:
			case HtmlStartDoubleQuoteString:
			case HtmlHex:
			case HtmlDecimal:
			case HtmlName:
			case HtmlEndQuoteString:
			case HtmlQuoteString:
			case HtmlEndDoubleQuoteString:
			case HtmlDoubleQuoteString:
			case ScriptText:
			case HtmlScriptClose:
			case StyleBody:
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCurlyBracket:
			case SemiColon:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				{
				setState(832);
				statement();
				}
				break;
			case Colon:
				{
				setState(833);
				match(Colon);
				setState(834);
				innerStatementList();
				setState(835);
				match(EndDeclare);
				setState(836);
				match(SemiColon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineHtmlStatementContext extends ParserRuleContext {
		public List<InlineHtmlContext> inlineHtml() {
			return getRuleContexts(InlineHtmlContext.class);
		}
		public InlineHtmlContext inlineHtml(int i) {
			return getRuleContext(InlineHtmlContext.class,i);
		}
		public InlineHtmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineHtmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInlineHtmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInlineHtmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInlineHtmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineHtmlStatementContext inlineHtmlStatement() throws RecognitionException {
		InlineHtmlStatementContext _localctx = new InlineHtmlStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inlineHtmlStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(841); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(840);
					inlineHtml();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(843); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareListContext extends ParserRuleContext {
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public DeclareListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterDeclareList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitDeclareList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitDeclareList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareListContext declareList() throws RecognitionException {
		DeclareListContext _localctx = new DeclareListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_declareList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			identifierInitializer();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(846);
				match(Comma);
				setState(847);
				identifierInitializer();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (AttributeStart - 43)) | (1L << (Abstract - 43)) | (1L << (Array - 43)) | (1L << (As - 43)) | (1L << (BinaryCast - 43)) | (1L << (BoolType - 43)) | (1L << (BooleanConstant - 43)) | (1L << (Break - 43)) | (1L << (Callable - 43)) | (1L << (Case - 43)) | (1L << (Catch - 43)) | (1L << (Class - 43)) | (1L << (Clone - 43)) | (1L << (Const - 43)) | (1L << (Continue - 43)) | (1L << (Declare - 43)) | (1L << (Default - 43)) | (1L << (Do - 43)) | (1L << (DoubleCast - 43)) | (1L << (DoubleType - 43)) | (1L << (Echo - 43)) | (1L << (Else - 43)) | (1L << (ElseIf - 43)) | (1L << (Empty - 43)) | (1L << (EndDeclare - 43)) | (1L << (EndFor - 43)) | (1L << (EndForeach - 43)) | (1L << (EndIf - 43)) | (1L << (EndSwitch - 43)) | (1L << (EndWhile - 43)) | (1L << (Eval - 43)) | (1L << (Exit - 43)) | (1L << (Extends - 43)) | (1L << (Final - 43)) | (1L << (Finally - 43)) | (1L << (FloatCast - 43)) | (1L << (For - 43)) | (1L << (Foreach - 43)) | (1L << (Function_ - 43)) | (1L << (Global - 43)) | (1L << (Goto - 43)) | (1L << (If - 43)) | (1L << (Implements - 43)) | (1L << (Import - 43)) | (1L << (Include - 43)) | (1L << (IncludeOnce - 43)) | (1L << (InstanceOf - 43)) | (1L << (InsteadOf - 43)) | (1L << (Int8Cast - 43)) | (1L << (Int16Cast - 43)) | (1L << (Int64Type - 43)) | (1L << (IntType - 43)) | (1L << (Interface - 43)) | (1L << (IsSet - 43)) | (1L << (List - 43)) | (1L << (LogicalAnd - 43)) | (1L << (LogicalOr - 43)) | (1L << (LogicalXor - 43)) | (1L << (Namespace - 43)) | (1L << (New - 43)) | (1L << (Null - 43)) | (1L << (ObjectType - 43)) | (1L << (Parent_ - 43)))) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (Partial - 107)) | (1L << (Print - 107)) | (1L << (Private - 107)) | (1L << (Protected - 107)) | (1L << (Public - 107)) | (1L << (Require - 107)) | (1L << (RequireOnce - 107)) | (1L << (Resource - 107)) | (1L << (Return - 107)) | (1L << (Static - 107)) | (1L << (StringType - 107)) | (1L << (Switch - 107)) | (1L << (Throw - 107)) | (1L << (Trait - 107)) | (1L << (Try - 107)) | (1L << (Typeof - 107)) | (1L << (UintCast - 107)) | (1L << (UnicodeCast - 107)) | (1L << (Unset - 107)) | (1L << (Use - 107)) | (1L << (Var - 107)) | (1L << (While - 107)) | (1L << (Yield - 107)) | (1L << (From - 107)) | (1L << (Get - 107)) | (1L << (Set - 107)) | (1L << (Call - 107)) | (1L << (CallStatic - 107)) | (1L << (Constructor - 107)) | (1L << (Destruct - 107)) | (1L << (Wakeup - 107)) | (1L << (Sleep - 107)) | (1L << (Autoload - 107)) | (1L << (IsSet__ - 107)) | (1L << (Unset__ - 107)) | (1L << (ToString__ - 107)) | (1L << (Invoke - 107)) | (1L << (SetState - 107)) | (1L << (Clone__ - 107)) | (1L << (DebugInfo - 107)) | (1L << (Namespace__ - 107)) | (1L << (Class__ - 107)) | (1L << (Traic__ - 107)) | (1L << (Function__ - 107)) | (1L << (Method__ - 107)) | (1L << (Line__ - 107)) | (1L << (File__ - 107)) | (1L << (Dir__ - 107)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ellipsis - 189)) | (1L << (Ampersand - 189)) | (1L << (QuestionMark - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)))) != 0)) {
				{
				setState(853);
				formalParameter();
				}
			}

			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(856);
					match(Comma);
					setState(857);
					formalParameter();
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(863);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(866);
				attributes();
				}
			}

			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(869);
				memberModifier();
				}
				break;
			}
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QuestionMark) {
				{
				setState(872);
				match(QuestionMark);
				}
			}

			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
				{
				setState(875);
				typeHint(0);
				}
			}

			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(878);
				match(Ampersand);
				}
			}

			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(881);
				match(Ellipsis);
				}
			}

			setState(884);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeHintContext extends ParserRuleContext {
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TypeHintContext> typeHint() {
			return getRuleContexts(TypeHintContext.class);
		}
		public TypeHintContext typeHint(int i) {
			return getRuleContext(TypeHintContext.class,i);
		}
		public TerminalNode Pipe() { return getToken(PhpParser.Pipe, 0); }
		public TypeHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeHint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeHintContext typeHint() throws RecognitionException {
		return typeHint(0);
	}

	private TypeHintContext typeHint(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeHintContext _localctx = new TypeHintContext(_ctx, _parentState);
		TypeHintContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_typeHint, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(887);
				qualifiedStaticTypeRef();
				}
				break;
			case 2:
				{
				setState(888);
				match(Callable);
				}
				break;
			case 3:
				{
				setState(889);
				primitiveType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeHintContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeHint);
					setState(892);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(893);
					match(Pipe);
					setState(894);
					typeHint(2);
					}
					} 
				}
				setState(899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GlobalStatementContext extends ParserRuleContext {
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public List<GlobalVarContext> globalVar() {
			return getRuleContexts(GlobalVarContext.class);
		}
		public GlobalVarContext globalVar(int i) {
			return getRuleContext(GlobalVarContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_globalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(Global);
			setState(901);
			globalVar();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(902);
				match(Comma);
				setState(903);
				globalVar();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(909);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Dollar() { return getToken(PhpParser.Dollar, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public GlobalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarContext globalVar() throws RecognitionException {
		GlobalVarContext _localctx = new GlobalVarContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_globalVar);
		try {
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				match(VarName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(Dollar);
				setState(913);
				chain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				match(Dollar);
				setState(915);
				match(OpenCurlyBracket);
				setState(916);
				expression(0);
				setState(917);
				match(CloseCurlyBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EchoStatementContext extends ParserRuleContext {
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public EchoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterEchoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitEchoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitEchoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoStatementContext echoStatement() throws RecognitionException {
		EchoStatementContext _localctx = new EchoStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_echoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(Echo);
			setState(922);
			expressionList();
			setState(923);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticVariableStatementContext extends ParserRuleContext {
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public StaticVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStaticVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStaticVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStaticVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticVariableStatementContext staticVariableStatement() throws RecognitionException {
		StaticVariableStatementContext _localctx = new StaticVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_staticVariableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(Static);
			setState(926);
			variableInitializer();
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(927);
				match(Comma);
				setState(928);
				variableInitializer();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassStatementContext extends ParserRuleContext {
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public BaseCtorCallContext baseCtorCall() {
			return getRuleContext(BaseCtorCallContext.class,0);
		}
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TraitAdaptationsContext traitAdaptations() {
			return getRuleContext(TraitAdaptationsContext.class,0);
		}
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_classStatement);
		int _la;
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AttributeStart:
			case Abstract:
			case Const:
			case Final:
			case Function_:
			case Private:
			case Protected:
			case Public:
			case Static:
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(936);
					attributes();
					}
				}

				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(939);
					propertyModifiers();
					setState(941);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
						{
						setState(940);
						typeHint(0);
						}
					}

					setState(943);
					variableInitializer();
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(944);
						match(Comma);
						setState(945);
						variableInitializer();
						}
						}
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(951);
					match(SemiColon);
					}
					break;
				case 2:
					{
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) {
						{
						setState(953);
						memberModifiers();
						}
					}

					setState(986);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Const:
						{
						setState(956);
						match(Const);
						setState(958);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
						case 1:
							{
							setState(957);
							typeHint(0);
							}
							break;
						}
						setState(960);
						identifierInitializer();
						setState(965);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(961);
							match(Comma);
							setState(962);
							identifierInitializer();
							}
							}
							setState(967);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(968);
						match(SemiColon);
						}
						break;
					case Function_:
						{
						setState(970);
						match(Function_);
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Ampersand) {
							{
							setState(971);
							match(Ampersand);
							}
						}

						setState(974);
						identifier();
						setState(976);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Lgeneric) {
							{
							setState(975);
							typeParameterListInBrackets();
							}
						}

						setState(978);
						match(OpenRoundBracket);
						setState(979);
						formalParameterList();
						setState(980);
						match(CloseRoundBracket);
						setState(982);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Colon) {
							{
							setState(981);
							baseCtorCall();
							}
						}

						setState(984);
						methodBody();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			case Use:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(Use);
				setState(991);
				qualifiedNamespaceNameList();
				setState(992);
				traitAdaptations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAdaptationsContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TraitAdaptationStatementContext> traitAdaptationStatement() {
			return getRuleContexts(TraitAdaptationStatementContext.class);
		}
		public TraitAdaptationStatementContext traitAdaptationStatement(int i) {
			return getRuleContext(TraitAdaptationStatementContext.class,i);
		}
		public TraitAdaptationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAdaptations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAdaptations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAdaptations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationsContext traitAdaptations() throws RecognitionException {
		TraitAdaptationsContext _localctx = new TraitAdaptationsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_traitAdaptations);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(996);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(OpenCurlyBracket);
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==NamespaceSeparator || _la==Label) {
					{
					{
					setState(998);
					traitAdaptationStatement();
					}
					}
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1004);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAdaptationStatementContext extends ParserRuleContext {
		public TraitPrecedenceContext traitPrecedence() {
			return getRuleContext(TraitPrecedenceContext.class,0);
		}
		public TraitAliasContext traitAlias() {
			return getRuleContext(TraitAliasContext.class,0);
		}
		public TraitAdaptationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAdaptationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAdaptationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAdaptationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAdaptationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAdaptationStatementContext traitAdaptationStatement() throws RecognitionException {
		TraitAdaptationStatementContext _localctx = new TraitAdaptationStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_traitAdaptationStatement);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				traitPrecedence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				traitAlias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitPrecedenceContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public QualifiedNamespaceNameListContext qualifiedNamespaceNameList() {
			return getRuleContext(QualifiedNamespaceNameListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public TraitPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitPrecedenceContext traitPrecedence() throws RecognitionException {
		TraitPrecedenceContext _localctx = new TraitPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_traitPrecedence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			qualifiedNamespaceName();
			setState(1012);
			match(DoubleColon);
			setState(1013);
			identifier();
			setState(1014);
			match(InsteadOf);
			setState(1015);
			qualifiedNamespaceNameList();
			setState(1016);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitAliasContext extends ParserRuleContext {
		public TraitMethodReferenceContext traitMethodReference() {
			return getRuleContext(TraitMethodReferenceContext.class,0);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public MemberModifierContext memberModifier() {
			return getRuleContext(MemberModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TraitAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitAliasContext traitAlias() throws RecognitionException {
		TraitAliasContext _localctx = new TraitAliasContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_traitAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			traitMethodReference();
			setState(1019);
			match(As);
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1020);
				memberModifier();
				}
				break;
			case 2:
				{
				setState(1022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1021);
					memberModifier();
					}
					break;
				}
				setState(1024);
				identifier();
				}
				break;
			}
			setState(1027);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraitMethodReferenceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TraitMethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitMethodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTraitMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTraitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTraitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitMethodReferenceContext traitMethodReference() throws RecognitionException {
		TraitMethodReferenceContext _localctx = new TraitMethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_traitMethodReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1029);
				qualifiedNamespaceName();
				setState(1030);
				match(DoubleColon);
				}
				break;
			}
			setState(1034);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseCtorCallContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BaseCtorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseCtorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBaseCtorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBaseCtorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBaseCtorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseCtorCallContext baseCtorCall() throws RecognitionException {
		BaseCtorCallContext _localctx = new BaseCtorCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_baseCtorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(Colon);
			setState(1037);
			typeHint(0);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenRoundBracket) {
				{
				setState(1038);
				arguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_methodBody);
		try {
			setState(1043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				match(SemiColon);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				blockStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModifiersContext extends ParserRuleContext {
		public MemberModifiersContext memberModifiers() {
			return getRuleContext(MemberModifiersContext.class,0);
		}
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPropertyModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPropertyModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPropertyModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_propertyModifiers);
		try {
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Final:
			case Private:
			case Protected:
			case Public:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1045);
				memberModifiers();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(1046);
				match(Var);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberModifiersContext extends ParserRuleContext {
		public List<MemberModifierContext> memberModifier() {
			return getRuleContexts(MemberModifierContext.class);
		}
		public MemberModifierContext memberModifier(int i) {
			return getRuleContext(MemberModifierContext.class,i);
		}
		public MemberModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifiersContext memberModifiers() throws RecognitionException {
		MemberModifiersContext _localctx = new MemberModifiersContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_memberModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1049);
					memberModifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1052); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(VarName);
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Eq) {
				{
				setState(1055);
				match(Eq);
				setState(1056);
				constantInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierInitializerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public IdentifierInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIdentifierInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIdentifierInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIdentifierInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierInitializerContext identifierInitializer() throws RecognitionException {
		IdentifierInitializerContext _localctx = new IdentifierInitializerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identifierInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			identifier();
			setState(1060);
			match(Eq);
			setState(1061);
			constantInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public List<IdentifierInitializerContext> identifierInitializer() {
			return getRuleContexts(IdentifierInitializerContext.class);
		}
		public IdentifierInitializerContext identifierInitializer(int i) {
			return getRuleContext(IdentifierInitializerContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(PhpParser.SemiColon, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public GlobalConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalConstantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalConstantDeclarationContext globalConstantDeclaration() throws RecognitionException {
		GlobalConstantDeclarationContext _localctx = new GlobalConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_globalConstantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1063);
				attributes();
				}
			}

			setState(1066);
			match(Const);
			setState(1067);
			identifierInitializer();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1068);
				match(Comma);
				setState(1069);
				identifierInitializer();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1075);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			expression(0);
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1078);
				match(Comma);
				setState(1079);
				expression(0);
				}
				}
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(OpenRoundBracket);
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1086);
				expression(0);
				}
				break;
			case 2:
				{
				setState(1087);
				yieldExpression();
				}
				break;
			}
			setState(1090);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChainExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialWordExpressionContext extends ExpressionContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public ChainListContext chainList() {
			return getRuleContext(ChainListContext.class,0);
		}
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public SpecialWordExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSpecialWordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSpecialWordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSpecialWordExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreationExpressionContext extends ExpressionContext {
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public ArrayCreationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackQuoteStringExpressionContext extends ExpressionContext {
		public TerminalNode BackQuoteString() { return getToken(PhpParser.BackQuoteString, 0); }
		public BackQuoteStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBackQuoteStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBackQuoteStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBackQuoteStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatchExpressionContext extends ExpressionContext {
		public MatchExprContext matchExpr() {
			return getRuleContext(MatchExprContext.class,0);
		}
		public MatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpressionContext extends ExpressionContext {
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PostfixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPostfixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPostfixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPostfixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CloneExpressionContext extends ExpressionContext {
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CloneExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PhpParser.Tilde, 0); }
		public TerminalNode SuppressWarnings() { return getToken(PhpParser.SuppressWarnings, 0); }
		public TerminalNode Bang() { return getToken(PhpParser.Bang, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public UnaryOperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterUnaryOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitUnaryOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitUnaryOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpaceshipExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Spaceship() { return getToken(PhpParser.Spaceship, 0); }
		public SpaceshipExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSpaceshipExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSpaceshipExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSpaceshipExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TerminalNode QuestionMark() { return getToken(PhpParser.QuestionMark, 0); }
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullCoalescingExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NullCoalescing() { return getToken(PhpParser.NullCoalescing, 0); }
		public NullCoalescingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNullCoalescingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNullCoalescingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNullCoalescingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(PhpParser.Pow, 0); }
		public TerminalNode Asterisk() { return getToken(PhpParser.Asterisk, 0); }
		public TerminalNode Divide() { return getToken(PhpParser.Divide, 0); }
		public TerminalNode Percent() { return getToken(PhpParser.Percent, 0); }
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public TerminalNode Dot() { return getToken(PhpParser.Dot, 0); }
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexerExpressionContext extends ExpressionContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public IndexerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIndexerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIndexerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public ScalarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterScalarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitScalarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitScalarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrefixIncDecExpressionContext extends ExpressionContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode Inc() { return getToken(PhpParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(PhpParser.Dec, 0); }
		public PrefixIncDecExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrefixIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrefixIncDecExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrefixIncDecExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ShiftLeft() { return getToken(PhpParser.ShiftLeft, 0); }
		public TerminalNode ShiftRight() { return getToken(PhpParser.ShiftRight, 0); }
		public TerminalNode Less() { return getToken(PhpParser.Less, 0); }
		public TerminalNode IsSmallerOrEqual() { return getToken(PhpParser.IsSmallerOrEqual, 0); }
		public TerminalNode Greater() { return getToken(PhpParser.Greater, 0); }
		public TerminalNode IsGreaterOrEqual() { return getToken(PhpParser.IsGreaterOrEqual, 0); }
		public TerminalNode IsIdentical() { return getToken(PhpParser.IsIdentical, 0); }
		public TerminalNode IsNoidentical() { return getToken(PhpParser.IsNoidentical, 0); }
		public TerminalNode IsEqual() { return getToken(PhpParser.IsEqual, 0); }
		public TerminalNode IsNotEq() { return getToken(PhpParser.IsNotEq, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public CastOperationContext castOperation() {
			return getRuleContext(CastOperationContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public InstanceOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInstanceOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInstanceOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionExpressionContext extends ExpressionContext {
		public LambdaFunctionExprContext lambdaFunctionExpr() {
			return getRuleContext(LambdaFunctionExprContext.class,0);
		}
		public LambdaFunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public TerminalNode Caret() { return getToken(PhpParser.Caret, 0); }
		public TerminalNode Pipe() { return getToken(PhpParser.Pipe, 0); }
		public TerminalNode BooleanAnd() { return getToken(PhpParser.BooleanAnd, 0); }
		public TerminalNode BooleanOr() { return getToken(PhpParser.BooleanOr, 0); }
		public BitwiseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterBitwiseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitBitwiseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitBitwiseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				_localctx = new CloneExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1093);
				match(Clone);
				setState(1094);
				expression(47);
				}
				break;
			case 2:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1095);
				newExpr();
				}
				break;
			case 3:
				{
				_localctx = new IndexerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1096);
				stringConstant();
				setState(1097);
				match(OpenSquareBracket);
				setState(1098);
				expression(0);
				setState(1099);
				match(CloseSquareBracket);
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1101);
				match(OpenRoundBracket);
				setState(1102);
				castOperation();
				setState(1103);
				match(CloseRoundBracket);
				setState(1104);
				expression(44);
				}
				break;
			case 5:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1106);
				_la = _input.LA(1);
				if ( !(_la==Tilde || _la==SuppressWarnings) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1107);
				expression(43);
				}
				break;
			case 6:
				{
				_localctx = new UnaryOperatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1108);
				_la = _input.LA(1);
				if ( !(((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (Bang - 195)) | (1L << (Plus - 195)) | (1L << (Minus - 195)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1109);
				expression(42);
				}
				break;
			case 7:
				{
				_localctx = new PrefixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1111);
				chain();
				}
				break;
			case 8:
				{
				_localctx = new PostfixIncDecExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1112);
				chain();
				setState(1113);
				_la = _input.LA(1);
				if ( !(_la==Inc || _la==Dec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new PrintExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1115);
				match(Print);
				setState(1116);
				expression(39);
				}
				break;
			case 10:
				{
				_localctx = new ChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1117);
				chain();
				}
				break;
			case 11:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1118);
				constant();
				}
				break;
			case 12:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1119);
				string();
				}
				break;
			case 13:
				{
				_localctx = new ScalarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1120);
				match(Label);
				}
				break;
			case 14:
				{
				_localctx = new BackQuoteStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1121);
				match(BackQuoteString);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1122);
				parentheses();
				}
				break;
			case 16:
				{
				_localctx = new ArrayCreationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1123);
				arrayCreation();
				}
				break;
			case 17:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1124);
				match(Yield);
				}
				break;
			case 18:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1125);
				match(List);
				setState(1126);
				match(OpenRoundBracket);
				setState(1127);
				assignmentList();
				setState(1128);
				match(CloseRoundBracket);
				setState(1129);
				match(Eq);
				setState(1130);
				expression(30);
				}
				break;
			case 19:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1132);
				match(IsSet);
				setState(1133);
				match(OpenRoundBracket);
				setState(1134);
				chainList();
				setState(1135);
				match(CloseRoundBracket);
				}
				break;
			case 20:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1137);
				match(Empty);
				setState(1138);
				match(OpenRoundBracket);
				setState(1139);
				chain();
				setState(1140);
				match(CloseRoundBracket);
				}
				break;
			case 21:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1142);
				match(Eval);
				setState(1143);
				match(OpenRoundBracket);
				setState(1144);
				expression(0);
				setState(1145);
				match(CloseRoundBracket);
				}
				break;
			case 22:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1147);
				match(Exit);
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1148);
					match(OpenRoundBracket);
					setState(1149);
					match(CloseRoundBracket);
					}
					break;
				case 2:
					{
					setState(1150);
					parentheses();
					}
					break;
				}
				}
				break;
			case 23:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1153);
				_la = _input.LA(1);
				if ( !(_la==Include || _la==IncludeOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1154);
				expression(25);
				}
				break;
			case 24:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==Require || _la==RequireOnce) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1156);
				expression(24);
				}
				break;
			case 25:
				{
				_localctx = new LambdaFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1157);
				lambdaFunctionExpr();
				}
				break;
			case 26:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1158);
				matchExpr();
				}
				break;
			case 27:
				{
				_localctx = new SpecialWordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1159);
				match(Throw);
				setState(1160);
				expression(6);
				}
				break;
			case 28:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1161);
				assignable();
				setState(1162);
				assignmentOperator();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1163);
					attributes();
					}
				}

				setState(1166);
				expression(5);
				}
				break;
			case 29:
				{
				_localctx = new AssignmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1168);
				assignable();
				setState(1169);
				match(Eq);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AttributeStart) {
					{
					setState(1170);
					attributes();
					}
				}

				setState(1173);
				match(Ampersand);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1174);
					chain();
					}
					break;
				case 2:
					{
					setState(1175);
					newExpr();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1180);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1181);
						((ArithmeticExpressionContext)_localctx).op = match(Pow);
						setState(1182);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1183);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1184);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (Asterisk - 199)) | (1L << (Percent - 199)) | (1L << (Divide - 199)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1185);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1186);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1187);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (Plus - 197)) | (1L << (Minus - 197)) | (1L << (Dot - 197)))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1188);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1189);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1190);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ShiftLeft || _la==ShiftRight) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1191);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1192);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1193);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & ((1L << (IsSmallerOrEqual - 166)) | (1L << (IsGreaterOrEqual - 166)) | (1L << (Less - 166)) | (1L << (Greater - 166)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1194);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1195);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1196);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (IsIdentical - 162)) | (1L << (IsNoidentical - 162)) | (1L << (IsEqual - 162)) | (1L << (IsNotEq - 162)))) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1197);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1198);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1199);
						((BitwiseExpressionContext)_localctx).op = match(Ampersand);
						setState(1200);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1202);
						((BitwiseExpressionContext)_localctx).op = match(Caret);
						setState(1203);
						expression(14);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1204);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1205);
						((BitwiseExpressionContext)_localctx).op = match(Pipe);
						setState(1206);
						expression(13);
						}
						break;
					case 10:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1207);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1208);
						((BitwiseExpressionContext)_localctx).op = match(BooleanAnd);
						setState(1209);
						expression(12);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1211);
						((BitwiseExpressionContext)_localctx).op = match(BooleanOr);
						setState(1212);
						expression(11);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1214);
						((ConditionalExpressionContext)_localctx).op = match(QuestionMark);
						setState(1216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
							{
							setState(1215);
							expression(0);
							}
						}

						setState(1218);
						match(Colon);
						setState(1219);
						expression(10);
						}
						break;
					case 13:
						{
						_localctx = new NullCoalescingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1221);
						((NullCoalescingExpressionContext)_localctx).op = match(NullCoalescing);
						setState(1222);
						expression(9);
						}
						break;
					case 14:
						{
						_localctx = new SpaceshipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1224);
						((SpaceshipExpressionContext)_localctx).op = match(Spaceship);
						setState(1225);
						expression(8);
						}
						break;
					case 15:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1227);
						((LogicalExpressionContext)_localctx).op = match(LogicalAnd);
						setState(1228);
						expression(4);
						}
						break;
					case 16:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1230);
						((LogicalExpressionContext)_localctx).op = match(LogicalXor);
						setState(1231);
						expression(3);
						}
						break;
					case 17:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1232);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1233);
						((LogicalExpressionContext)_localctx).op = match(LogicalOr);
						setState(1234);
						expression(2);
						}
						break;
					case 18:
						{
						_localctx = new InstanceOfExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1235);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1236);
						match(InstanceOf);
						setState(1237);
						typeRef();
						}
						break;
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignableContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayCreationContext arrayCreation() {
			return getRuleContext(ArrayCreationContext.class,0);
		}
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assignable);
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				arrayCreation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationContext extends ParserRuleContext {
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> OpenSquareBracket() { return getTokens(PhpParser.OpenSquareBracket); }
		public TerminalNode OpenSquareBracket(int i) {
			return getToken(PhpParser.OpenSquareBracket, i);
		}
		public List<TerminalNode> CloseSquareBracket() { return getTokens(PhpParser.CloseSquareBracket); }
		public TerminalNode CloseSquareBracket(int i) {
			return getToken(PhpParser.CloseSquareBracket, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public ArrayCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationContext arrayCreation() throws RecognitionException {
		ArrayCreationContext _localctx = new ArrayCreationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arrayCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
				{
				setState(1247);
				match(Array);
				setState(1248);
				match(OpenRoundBracket);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1249);
					arrayItemList();
					}
				}

				setState(1252);
				match(CloseRoundBracket);
				}
				break;
			case OpenSquareBracket:
				{
				setState(1253);
				match(OpenSquareBracket);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1254);
					arrayItemList();
					}
				}

				setState(1257);
				match(CloseSquareBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1260);
				match(OpenSquareBracket);
				setState(1261);
				expression(0);
				setState(1262);
				match(CloseSquareBracket);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionExprContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarsContext lambdaFunctionUseVars() {
			return getRuleContext(LambdaFunctionUseVarsContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public TypeHintContext typeHint() {
			return getRuleContext(TypeHintContext.class,0);
		}
		public TerminalNode LambdaFn() { return getToken(PhpParser.LambdaFn, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionExprContext lambdaFunctionExpr() throws RecognitionException {
		LambdaFunctionExprContext _localctx = new LambdaFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lambdaFunctionExpr);
		int _la;
		try {
			setState(1292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function_:
			case Static:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(1266);
					match(Static);
					}
				}

				setState(1269);
				match(Function_);
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ampersand) {
					{
					setState(1270);
					match(Ampersand);
					}
				}

				setState(1273);
				match(OpenRoundBracket);
				setState(1274);
				formalParameterList();
				setState(1275);
				match(CloseRoundBracket);
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Use) {
					{
					setState(1276);
					lambdaFunctionUseVars();
					}
				}

				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1279);
					match(Colon);
					setState(1280);
					typeHint(0);
					}
				}

				setState(1283);
				blockStatement();
				}
				break;
			case LambdaFn:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				match(LambdaFn);
				setState(1286);
				match(OpenRoundBracket);
				setState(1287);
				formalParameterList();
				setState(1288);
				match(CloseRoundBracket);
				setState(1289);
				match(DoubleArrow);
				setState(1290);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchExprContext extends ParserRuleContext {
		public TerminalNode Match_() { return getToken(PhpParser.Match_, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public List<MatchItemContext> matchItem() {
			return getRuleContexts(MatchItemContext.class);
		}
		public MatchItemContext matchItem(int i) {
			return getRuleContext(MatchItemContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MatchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExprContext matchExpr() throws RecognitionException {
		MatchExprContext _localctx = new MatchExprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_matchExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(Match_);
			setState(1295);
			match(OpenRoundBracket);
			setState(1296);
			expression(0);
			setState(1297);
			match(CloseRoundBracket);
			setState(1298);
			match(OpenCurlyBracket);
			setState(1299);
			matchItem();
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1300);
					match(Comma);
					setState(1301);
					matchItem();
					}
					} 
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1307);
				match(Comma);
				}
			}

			setState(1310);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public MatchItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMatchItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMatchItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMatchItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchItemContext matchItem() throws RecognitionException {
		MatchItemContext _localctx = new MatchItemContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_matchItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			expression(0);
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1313);
				match(Comma);
				setState(1314);
				expression(0);
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1320);
			match(DoubleArrow);
			setState(1321);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewExprContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TypeRefContext typeRef() {
			return getRuleContext(TypeRefContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExprContext newExpr() throws RecognitionException {
		NewExprContext _localctx = new NewExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_newExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(New);
			setState(1324);
			typeRef();
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1325);
				arguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Eq() { return getToken(PhpParser.Eq, 0); }
		public TerminalNode PlusEqual() { return getToken(PhpParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(PhpParser.MinusEqual, 0); }
		public TerminalNode MulEqual() { return getToken(PhpParser.MulEqual, 0); }
		public TerminalNode PowEqual() { return getToken(PhpParser.PowEqual, 0); }
		public TerminalNode DivEqual() { return getToken(PhpParser.DivEqual, 0); }
		public TerminalNode Concaequal() { return getToken(PhpParser.Concaequal, 0); }
		public TerminalNode ModEqual() { return getToken(PhpParser.ModEqual, 0); }
		public TerminalNode AndEqual() { return getToken(PhpParser.AndEqual, 0); }
		public TerminalNode OrEqual() { return getToken(PhpParser.OrEqual, 0); }
		public TerminalNode XorEqual() { return getToken(PhpParser.XorEqual, 0); }
		public TerminalNode ShiftLeftEqual() { return getToken(PhpParser.ShiftLeftEqual, 0); }
		public TerminalNode ShiftRightEqual() { return getToken(PhpParser.ShiftRightEqual, 0); }
		public TerminalNode NullCoalescingEqual() { return getToken(PhpParser.NullCoalescingEqual, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_la = _input.LA(1);
			if ( !(((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (PlusEqual - 168)) | (1L << (MinusEqual - 168)) | (1L << (MulEqual - 168)) | (1L << (PowEqual - 168)) | (1L << (DivEqual - 168)) | (1L << (Concaequal - 168)) | (1L << (ModEqual - 168)) | (1L << (ShiftLeftEqual - 168)) | (1L << (ShiftRightEqual - 168)) | (1L << (AndEqual - 168)) | (1L << (OrEqual - 168)) | (1L << (XorEqual - 168)) | (1L << (NullCoalescingEqual - 168)) | (1L << (Eq - 168)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldExpressionContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public YieldExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterYieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitYieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitYieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldExpressionContext yieldExpression() throws RecognitionException {
		YieldExpressionContext _localctx = new YieldExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yieldExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(Yield);
			setState(1338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1331);
				expression(0);
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1332);
					match(DoubleArrow);
					setState(1333);
					expression(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1336);
				match(From);
				setState(1337);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayItemListContext extends ParserRuleContext {
		public List<ArrayItemContext> arrayItem() {
			return getRuleContexts(ArrayItemContext.class);
		}
		public ArrayItemContext arrayItem(int i) {
			return getRuleContext(ArrayItemContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArrayItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemListContext arrayItemList() throws RecognitionException {
		ArrayItemListContext _localctx = new ArrayItemListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_arrayItemList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			arrayItem();
			setState(1345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1341);
					match(Comma);
					setState(1342);
					arrayItem();
					}
					} 
				}
				setState(1347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1348);
				match(Comma);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DoubleArrow() { return getToken(PhpParser.DoubleArrow, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ArrayItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArrayItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArrayItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayItemContext arrayItem() throws RecognitionException {
		ArrayItemContext _localctx = new ArrayItemContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arrayItem);
		int _la;
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				expression(0);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DoubleArrow) {
					{
					setState(1352);
					match(DoubleArrow);
					setState(1353);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1356);
					expression(0);
					setState(1357);
					match(DoubleArrow);
					}
				}

				setState(1361);
				match(Ampersand);
				setState(1362);
				chain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionUseVarsContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public List<LambdaFunctionUseVarContext> lambdaFunctionUseVar() {
			return getRuleContexts(LambdaFunctionUseVarContext.class);
		}
		public LambdaFunctionUseVarContext lambdaFunctionUseVar(int i) {
			return getRuleContext(LambdaFunctionUseVarContext.class,i);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public LambdaFunctionUseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionUseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionUseVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarsContext lambdaFunctionUseVars() throws RecognitionException {
		LambdaFunctionUseVarsContext _localctx = new LambdaFunctionUseVarsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_lambdaFunctionUseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(Use);
			setState(1366);
			match(OpenRoundBracket);
			setState(1367);
			lambdaFunctionUseVar();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1368);
				match(Comma);
				setState(1369);
				lambdaFunctionUseVar();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1375);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionUseVarContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public LambdaFunctionUseVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionUseVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLambdaFunctionUseVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLambdaFunctionUseVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLambdaFunctionUseVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionUseVarContext lambdaFunctionUseVar() throws RecognitionException {
		LambdaFunctionUseVarContext _localctx = new LambdaFunctionUseVarContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_lambdaFunctionUseVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ampersand) {
				{
				setState(1377);
				match(Ampersand);
				}
			}

			setState(1380);
			match(VarName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedStaticTypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public QualifiedStaticTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedStaticTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedStaticTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedStaticTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedStaticTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedStaticTypeRefContext qualifiedStaticTypeRef() throws RecognitionException {
		QualifiedStaticTypeRefContext _localctx = new QualifiedStaticTypeRefContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_qualifiedStaticTypeRef);
		try {
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				qualifiedNamespaceName();
				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1383);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(Static);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRefContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public IndirectTypeRefContext indirectTypeRef() {
			return getRuleContext(IndirectTypeRefContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public AnonymousClassContext anonymousClass() {
			return getRuleContext(AnonymousClassContext.class,0);
		}
		public TypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRefContext typeRef() throws RecognitionException {
		TypeRefContext _localctx = new TypeRefContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_typeRef);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1389);
					qualifiedNamespaceName();
					}
					break;
				case 2:
					{
					setState(1390);
					indirectTypeRef();
					}
					break;
				}
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1393);
					genericDynamicArgs();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1396);
				primitiveType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				match(Static);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				anonymousClass();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnonymousClassContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public ClassEntryTypeContext classEntryType() {
			return getRuleContext(ClassEntryTypeContext.class,0);
		}
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public List<ClassStatementContext> classStatement() {
			return getRuleContexts(ClassStatementContext.class);
		}
		public ClassStatementContext classStatement(int i) {
			return getRuleContext(ClassStatementContext.class,i);
		}
		public TypeParameterListInBracketsContext typeParameterListInBrackets() {
			return getRuleContext(TypeParameterListInBracketsContext.class,0);
		}
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public InterfaceListContext interfaceList() {
			return getRuleContext(InterfaceListContext.class,0);
		}
		public AnonymousClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAnonymousClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAnonymousClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAnonymousClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousClassContext anonymousClass() throws RecognitionException {
		AnonymousClassContext _localctx = new AnonymousClassContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_anonymousClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AttributeStart) {
				{
				setState(1401);
				attributes();
				}
			}

			setState(1405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Private) {
				{
				setState(1404);
				match(Private);
				}
			}

			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract || _la==Final) {
				{
				setState(1407);
				modifier();
				}
			}

			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Partial) {
				{
				setState(1410);
				match(Partial);
				}
			}

			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Trait:
				{
				setState(1413);
				classEntryType();
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1414);
					typeParameterListInBrackets();
					}
				}

				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1417);
					match(Extends);
					setState(1418);
					qualifiedStaticTypeRef();
					}
				}

				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(1421);
					match(Implements);
					setState(1422);
					interfaceList();
					}
				}

				}
				break;
			case Interface:
				{
				setState(1425);
				match(Interface);
				setState(1426);
				identifier();
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Lgeneric) {
					{
					setState(1427);
					typeParameterListInBrackets();
					}
				}

				setState(1432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(1430);
					match(Extends);
					setState(1431);
					interfaceList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1436);
			match(OpenCurlyBracket);
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AttributeStart) | (1L << Abstract) | (1L << Const))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Function_ - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)) | (1L << (Use - 76)) | (1L << (Var - 76)))) != 0)) {
				{
				{
				setState(1437);
				classStatement();
				}
				}
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1443);
			match(CloseCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectTypeRefContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public List<TerminalNode> ObjectOperator() { return getTokens(PhpParser.ObjectOperator); }
		public TerminalNode ObjectOperator(int i) {
			return getToken(PhpParser.ObjectOperator, i);
		}
		public List<KeyedFieldNameContext> keyedFieldName() {
			return getRuleContexts(KeyedFieldNameContext.class);
		}
		public KeyedFieldNameContext keyedFieldName(int i) {
			return getRuleContext(KeyedFieldNameContext.class,i);
		}
		public IndirectTypeRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectTypeRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIndirectTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIndirectTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIndirectTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndirectTypeRefContext indirectTypeRef() throws RecognitionException {
		IndirectTypeRefContext _localctx = new IndirectTypeRefContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_indirectTypeRef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			chainBase();
			setState(1450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1446);
					match(ObjectOperator);
					setState(1447);
					keyedFieldName();
					}
					} 
				}
				setState(1452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNamespaceNameContext extends ParserRuleContext {
		public NamespaceNameListContext namespaceNameList() {
			return getRuleContext(NamespaceNameListContext.class,0);
		}
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode NamespaceSeparator() { return getToken(PhpParser.NamespaceSeparator, 0); }
		public QualifiedNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameContext qualifiedNamespaceName() throws RecognitionException {
		QualifiedNamespaceNameContext _localctx = new QualifiedNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_qualifiedNamespaceName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1453);
				match(Namespace);
				}
				break;
			}
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NamespaceSeparator) {
				{
				setState(1456);
				match(NamespaceSeparator);
				}
			}

			setState(1459);
			namespaceNameList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NamespaceSeparator() { return getTokens(PhpParser.NamespaceSeparator); }
		public TerminalNode NamespaceSeparator(int i) {
			return getToken(PhpParser.NamespaceSeparator, i);
		}
		public NamespaceNameTailContext namespaceNameTail() {
			return getRuleContext(NamespaceNameTailContext.class,0);
		}
		public NamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameListContext namespaceNameList() throws RecognitionException {
		NamespaceNameListContext _localctx = new NamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceNameList);
		try {
			int _alt;
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				identifier();
				setState(1467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1463);
						match(NamespaceSeparator);
						setState(1464);
						identifier();
						}
						} 
					}
					setState(1469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1470);
					match(NamespaceSeparator);
					setState(1471);
					namespaceNameTail();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNameTailContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public List<NamespaceNameTailContext> namespaceNameTail() {
			return getRuleContexts(NamespaceNameTailContext.class);
		}
		public NamespaceNameTailContext namespaceNameTail(int i) {
			return getRuleContext(NamespaceNameTailContext.class,i);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public NamespaceNameTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNameTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNamespaceNameTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNamespaceNameTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNamespaceNameTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameTailContext namespaceNameTail() throws RecognitionException {
		NamespaceNameTailContext _localctx = new NamespaceNameTailContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespaceNameTail);
		int _la;
		try {
			int _alt;
			setState(1495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				identifier();
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1477);
					match(As);
					setState(1478);
					identifier();
					}
					break;
				}
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1481);
				match(OpenCurlyBracket);
				setState(1482);
				namespaceNameTail();
				setState(1487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1483);
						match(Comma);
						setState(1484);
						namespaceNameTail();
						}
						} 
					}
					setState(1489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1490);
					match(Comma);
					}
				}

				setState(1493);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNamespaceNameListContext extends ParserRuleContext {
		public List<QualifiedNamespaceNameContext> qualifiedNamespaceName() {
			return getRuleContexts(QualifiedNamespaceNameContext.class);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName(int i) {
			return getRuleContext(QualifiedNamespaceNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public QualifiedNamespaceNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNamespaceNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterQualifiedNamespaceNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitQualifiedNamespaceNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitQualifiedNamespaceNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNamespaceNameListContext qualifiedNamespaceNameList() throws RecognitionException {
		QualifiedNamespaceNameListContext _localctx = new QualifiedNamespaceNameListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_qualifiedNamespaceNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			qualifiedNamespaceName();
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1498);
				match(Comma);
				setState(1499);
				qualifiedNamespaceName();
				}
				}
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public List<ActualArgumentContext> actualArgument() {
			return getRuleContexts(ActualArgumentContext.class);
		}
		public ActualArgumentContext actualArgument(int i) {
			return getRuleContext(ActualArgumentContext.class,i);
		}
		public YieldExpressionContext yieldExpression() {
			return getRuleContext(YieldExpressionContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(OpenRoundBracket);
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1506);
				actualArgument();
				setState(1511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1507);
						match(Comma);
						setState(1508);
						actualArgument();
						}
						} 
					}
					setState(1513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1514);
				yieldExpression();
				}
				break;
			}
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1517);
				match(Comma);
				}
			}

			setState(1520);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PhpParser.Ellipsis, 0); }
		public TerminalNode Ampersand() { return getToken(PhpParser.Ampersand, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ActualArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterActualArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitActualArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitActualArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentContext actualArgument() throws RecognitionException {
		ActualArgumentContext _localctx = new ActualArgumentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_actualArgument);
		int _la;
		try {
			setState(1531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Match_:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case LambdaFn:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Inc:
			case Dec:
			case NamespaceSeparator:
			case Ellipsis:
			case Bang:
			case Plus:
			case Minus:
			case Tilde:
			case SuppressWarnings:
			case Dollar:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VarName:
			case Label:
			case Octal:
			case Decimal:
			case Real:
			case Hex:
			case Binary:
			case BackQuoteString:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1522);
					argumentName();
					}
					break;
				}
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1525);
					match(Ellipsis);
					}
				}

				setState(1528);
				expression(0);
				}
				break;
			case Ampersand:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				match(Ampersand);
				setState(1530);
				chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PhpParser.Colon, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitArgumentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitArgumentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			identifier();
			setState(1534);
			match(Colon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantInitializerContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ArrayItemListContext arrayItemList() {
			return getRuleContext(ArrayItemListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PhpParser.Comma, 0); }
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ConstantInitializerContext constantInitializer() {
			return getRuleContext(ConstantInitializerContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PhpParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PhpParser.Minus, 0); }
		public ConstantInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstantInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstantInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstantInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantInitializerContext constantInitializer() throws RecognitionException {
		ConstantInitializerContext _localctx = new ConstantInitializerContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_constantInitializer);
		int _la;
		try {
			setState(1557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538);
				match(Array);
				setState(1539);
				match(OpenRoundBracket);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1540);
					arrayItemList();
					setState(1542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1541);
						match(Comma);
						}
					}

					}
				}

				setState(1546);
				match(CloseRoundBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1547);
				match(OpenSquareBracket);
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1548);
					arrayItemList();
					setState(1550);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(1549);
						match(Comma);
						}
					}

					}
				}

				setState(1554);
				match(CloseSquareBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1555);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1556);
				constantInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public LiteralConstantContext literalConstant() {
			return getRuleContext(LiteralConstantContext.class,0);
		}
		public MagicConstantContext magicConstant() {
			return getRuleContext(MagicConstantContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_constant);
		try {
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				match(Null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1560);
				literalConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1561);
				magicConstant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1562);
				classConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1563);
				qualifiedNamespaceName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralConstantContext extends ParserRuleContext {
		public TerminalNode Real() { return getToken(PhpParser.Real, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public LiteralConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterLiteralConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitLiteralConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitLiteralConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralConstantContext literalConstant() throws RecognitionException {
		LiteralConstantContext _localctx = new LiteralConstantContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_literalConstant);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Real:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(Real);
				}
				break;
			case BooleanConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				match(BooleanConstant);
				}
				break;
			case Octal:
			case Decimal:
			case Hex:
			case Binary:
				enterOuterAlt(_localctx, 3);
				{
				setState(1568);
				numericConstant();
				}
				break;
			case Label:
				enterOuterAlt(_localctx, 4);
				{
				setState(1569);
				stringConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericConstantContext extends ParserRuleContext {
		public TerminalNode Octal() { return getToken(PhpParser.Octal, 0); }
		public TerminalNode Decimal() { return getToken(PhpParser.Decimal, 0); }
		public TerminalNode Hex() { return getToken(PhpParser.Hex, 0); }
		public TerminalNode Binary() { return getToken(PhpParser.Binary, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_numericConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_la = _input.LA(1);
			if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (Octal - 221)) | (1L << (Decimal - 221)) | (1L << (Hex - 221)) | (1L << (Binary - 221)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassConstantContext extends ParserRuleContext {
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ClassConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterClassConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitClassConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitClassConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstantContext classConstant() throws RecognitionException {
		ClassConstantContext _localctx = new ClassConstantContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_classConstant);
		int _la;
		try {
			setState(1592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Parent_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1575);
				match(DoubleColon);
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1576);
					identifier();
					}
					break;
				case 2:
					{
					setState(1577);
					match(Constructor);
					}
					break;
				case 3:
					{
					setState(1578);
					match(Get);
					}
					break;
				case 4:
					{
					setState(1579);
					match(Set);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case NamespaceSeparator:
				case Label:
					{
					setState(1582);
					qualifiedStaticTypeRef();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1583);
					keyedVariable();
					}
					break;
				case SingleQuoteString:
				case DoubleQuote:
				case StartNowDoc:
				case StartHereDoc:
					{
					setState(1584);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1587);
				match(DoubleColon);
				setState(1590);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Abstract:
				case Array:
				case As:
				case BinaryCast:
				case BoolType:
				case BooleanConstant:
				case Break:
				case Callable:
				case Case:
				case Catch:
				case Class:
				case Clone:
				case Const:
				case Continue:
				case Declare:
				case Default:
				case Do:
				case DoubleCast:
				case DoubleType:
				case Echo:
				case Else:
				case ElseIf:
				case Empty:
				case EndDeclare:
				case EndFor:
				case EndForeach:
				case EndIf:
				case EndSwitch:
				case EndWhile:
				case Eval:
				case Exit:
				case Extends:
				case Final:
				case Finally:
				case FloatCast:
				case For:
				case Foreach:
				case Function_:
				case Global:
				case Goto:
				case If:
				case Implements:
				case Import:
				case Include:
				case IncludeOnce:
				case InstanceOf:
				case InsteadOf:
				case Int8Cast:
				case Int16Cast:
				case Int64Type:
				case IntType:
				case Interface:
				case IsSet:
				case List:
				case LogicalAnd:
				case LogicalOr:
				case LogicalXor:
				case Namespace:
				case New:
				case Null:
				case ObjectType:
				case Parent_:
				case Partial:
				case Print:
				case Private:
				case Protected:
				case Public:
				case Require:
				case RequireOnce:
				case Resource:
				case Return:
				case Static:
				case StringType:
				case Switch:
				case Throw:
				case Trait:
				case Try:
				case Typeof:
				case UintCast:
				case UnicodeCast:
				case Unset:
				case Use:
				case Var:
				case While:
				case Yield:
				case From:
				case Get:
				case Set:
				case Call:
				case CallStatic:
				case Constructor:
				case Destruct:
				case Wakeup:
				case Sleep:
				case Autoload:
				case IsSet__:
				case Unset__:
				case ToString__:
				case Invoke:
				case SetState:
				case Clone__:
				case DebugInfo:
				case Namespace__:
				case Class__:
				case Traic__:
				case Function__:
				case Method__:
				case Line__:
				case File__:
				case Dir__:
				case Label:
					{
					setState(1588);
					identifier();
					}
					break;
				case Dollar:
				case VarName:
					{
					setState(1589);
					keyedVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(Label);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StartHereDoc() { return getToken(PhpParser.StartHereDoc, 0); }
		public List<TerminalNode> HereDocText() { return getTokens(PhpParser.HereDocText); }
		public TerminalNode HereDocText(int i) {
			return getToken(PhpParser.HereDocText, i);
		}
		public TerminalNode StartNowDoc() { return getToken(PhpParser.StartNowDoc, 0); }
		public TerminalNode SingleQuoteString() { return getToken(PhpParser.SingleQuoteString, 0); }
		public List<TerminalNode> DoubleQuote() { return getTokens(PhpParser.DoubleQuote); }
		public TerminalNode DoubleQuote(int i) {
			return getToken(PhpParser.DoubleQuote, i);
		}
		public List<InterpolatedStringPartContext> interpolatedStringPart() {
			return getRuleContexts(InterpolatedStringPartContext.class);
		}
		public InterpolatedStringPartContext interpolatedStringPart(int i) {
			return getRuleContext(InterpolatedStringPartContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_string);
		try {
			int _alt;
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StartHereDoc:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				match(StartHereDoc);
				setState(1598); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1597);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1600); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case StartNowDoc:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
				match(StartNowDoc);
				setState(1604); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1603);
						match(HereDocText);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1606); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleQuoteString:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				match(SingleQuoteString);
				}
				break;
			case DoubleQuote:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				match(DoubleQuote);
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1610);
						interpolatedStringPart();
						}
						} 
					}
					setState(1615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
				}
				setState(1616);
				match(DoubleQuote);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpolatedStringPartContext extends ParserRuleContext {
		public TerminalNode StringPart() { return getToken(PhpParser.StringPart, 0); }
		public TerminalNode UnicodeEscape() { return getToken(PhpParser.UnicodeEscape, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InterpolatedStringPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolatedStringPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterInterpolatedStringPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitInterpolatedStringPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitInterpolatedStringPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolatedStringPartContext interpolatedStringPart() throws RecognitionException {
		InterpolatedStringPartContext _localctx = new InterpolatedStringPartContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interpolatedStringPart);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringPart:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				match(StringPart);
				}
				break;
			case UnicodeEscape:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				match(UnicodeEscape);
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Dollar:
			case OpenRoundBracket:
			case VarName:
			case Label:
			case SingleQuoteString:
			case DoubleQuote:
			case StartNowDoc:
			case StartHereDoc:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				chain();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainListContext extends ParserRuleContext {
		public List<ChainContext> chain() {
			return getRuleContexts(ChainContext.class);
		}
		public ChainContext chain(int i) {
			return getRuleContext(ChainContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public ChainListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainListContext chainList() throws RecognitionException {
		ChainListContext _localctx = new ChainListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_chainList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			chain();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1625);
				match(Comma);
				setState(1626);
				chain();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainContext extends ParserRuleContext {
		public ChainOriginContext chainOrigin() {
			return getRuleContext(ChainOriginContext.class,0);
		}
		public List<MemberAccessContext> memberAccess() {
			return getRuleContexts(MemberAccessContext.class);
		}
		public MemberAccessContext memberAccess(int i) {
			return getRuleContext(MemberAccessContext.class,i);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			chainOrigin();
			setState(1636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1633);
					memberAccess();
					}
					} 
				}
				setState(1638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainOriginContext extends ParserRuleContext {
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public NewExprContext newExpr() {
			return getRuleContext(NewExprContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ChainOriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainOrigin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainOrigin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainOrigin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainOriginContext chainOrigin() throws RecognitionException {
		ChainOriginContext _localctx = new ChainOriginContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_chainOrigin);
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				chainBase();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1641);
				match(OpenRoundBracket);
				setState(1642);
				newExpr();
				setState(1643);
				match(CloseRoundBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberAccessContext extends ParserRuleContext {
		public TerminalNode ObjectOperator() { return getToken(PhpParser.ObjectOperator, 0); }
		public KeyedFieldNameContext keyedFieldName() {
			return getRuleContext(KeyedFieldNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_memberAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			match(ObjectOperator);
			setState(1648);
			keyedFieldName();
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1649);
				actualArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallNameContext functionCallName() {
			return getRuleContext(FunctionCallNameContext.class,0);
		}
		public ActualArgumentsContext actualArguments() {
			return getRuleContext(ActualArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			functionCallName();
			setState(1653);
			actualArguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallNameContext extends ParserRuleContext {
		public QualifiedNamespaceNameContext qualifiedNamespaceName() {
			return getRuleContext(QualifiedNamespaceNameContext.class,0);
		}
		public ClassConstantContext classConstant() {
			return getRuleContext(ClassConstantContext.class,0);
		}
		public ChainBaseContext chainBase() {
			return getRuleContext(ChainBaseContext.class,0);
		}
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public FunctionCallNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterFunctionCallName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitFunctionCallName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitFunctionCallName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNameContext functionCallName() throws RecognitionException {
		FunctionCallNameContext _localctx = new FunctionCallNameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_functionCallName);
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				qualifiedNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				classConstant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1657);
				chainBase();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1658);
				parentheses();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualArgumentsContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public GenericDynamicArgsContext genericDynamicArgs() {
			return getRuleContext(GenericDynamicArgsContext.class,0);
		}
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public ActualArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterActualArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitActualArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitActualArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualArgumentsContext actualArguments() throws RecognitionException {
		ActualArgumentsContext _localctx = new ActualArgumentsContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_actualArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Lgeneric) {
				{
				setState(1661);
				genericDynamicArgs();
				}
			}

			setState(1664);
			arguments();
			setState(1668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1665);
					squareCurlyExpression();
					}
					} 
				}
				setState(1670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainBaseContext extends ParserRuleContext {
		public List<KeyedVariableContext> keyedVariable() {
			return getRuleContexts(KeyedVariableContext.class);
		}
		public KeyedVariableContext keyedVariable(int i) {
			return getRuleContext(KeyedVariableContext.class,i);
		}
		public TerminalNode DoubleColon() { return getToken(PhpParser.DoubleColon, 0); }
		public QualifiedStaticTypeRefContext qualifiedStaticTypeRef() {
			return getRuleContext(QualifiedStaticTypeRefContext.class,0);
		}
		public ChainBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterChainBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitChainBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitChainBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainBaseContext chainBase() throws RecognitionException {
		ChainBaseContext _localctx = new ChainBaseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_chainBase);
		try {
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				keyedVariable();
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1672);
					match(DoubleColon);
					setState(1673);
					keyedVariable();
					}
					break;
				}
				}
				break;
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case NamespaceSeparator:
			case Label:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				qualifiedStaticTypeRef();
				setState(1677);
				match(DoubleColon);
				setState(1678);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedFieldNameContext extends ParserRuleContext {
		public KeyedSimpleFieldNameContext keyedSimpleFieldName() {
			return getRuleContext(KeyedSimpleFieldNameContext.class,0);
		}
		public KeyedVariableContext keyedVariable() {
			return getRuleContext(KeyedVariableContext.class,0);
		}
		public KeyedFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedFieldNameContext keyedFieldName() throws RecognitionException {
		KeyedFieldNameContext _localctx = new KeyedFieldNameContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_keyedFieldName);
		try {
			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case OpenCurlyBracket:
			case Label:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				keyedSimpleFieldName();
				}
				break;
			case Dollar:
			case VarName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				keyedVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedSimpleFieldNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedSimpleFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedSimpleFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedSimpleFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedSimpleFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedSimpleFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedSimpleFieldNameContext keyedSimpleFieldName() throws RecognitionException {
		KeyedSimpleFieldNameContext _localctx = new KeyedSimpleFieldNameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_keyedSimpleFieldName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Abstract:
			case Array:
			case As:
			case BinaryCast:
			case BoolType:
			case BooleanConstant:
			case Break:
			case Callable:
			case Case:
			case Catch:
			case Class:
			case Clone:
			case Const:
			case Continue:
			case Declare:
			case Default:
			case Do:
			case DoubleCast:
			case DoubleType:
			case Echo:
			case Else:
			case ElseIf:
			case Empty:
			case EndDeclare:
			case EndFor:
			case EndForeach:
			case EndIf:
			case EndSwitch:
			case EndWhile:
			case Eval:
			case Exit:
			case Extends:
			case Final:
			case Finally:
			case FloatCast:
			case For:
			case Foreach:
			case Function_:
			case Global:
			case Goto:
			case If:
			case Implements:
			case Import:
			case Include:
			case IncludeOnce:
			case InstanceOf:
			case InsteadOf:
			case Int8Cast:
			case Int16Cast:
			case Int64Type:
			case IntType:
			case Interface:
			case IsSet:
			case List:
			case LogicalAnd:
			case LogicalOr:
			case LogicalXor:
			case Namespace:
			case New:
			case Null:
			case ObjectType:
			case Parent_:
			case Partial:
			case Print:
			case Private:
			case Protected:
			case Public:
			case Require:
			case RequireOnce:
			case Resource:
			case Return:
			case Static:
			case StringType:
			case Switch:
			case Throw:
			case Trait:
			case Try:
			case Typeof:
			case UintCast:
			case UnicodeCast:
			case Unset:
			case Use:
			case Var:
			case While:
			case Yield:
			case From:
			case Get:
			case Set:
			case Call:
			case CallStatic:
			case Constructor:
			case Destruct:
			case Wakeup:
			case Sleep:
			case Autoload:
			case IsSet__:
			case Unset__:
			case ToString__:
			case Invoke:
			case SetState:
			case Clone__:
			case DebugInfo:
			case Namespace__:
			case Class__:
			case Traic__:
			case Function__:
			case Method__:
			case Line__:
			case File__:
			case Dir__:
			case Label:
				{
				setState(1686);
				identifier();
				}
				break;
			case OpenCurlyBracket:
				{
				setState(1687);
				match(OpenCurlyBracket);
				setState(1688);
				expression(0);
				setState(1689);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1693);
					squareCurlyExpression();
					}
					} 
				}
				setState(1698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyedVariableContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(PhpParser.VarName, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PhpParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PhpParser.Dollar, i);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public List<SquareCurlyExpressionContext> squareCurlyExpression() {
			return getRuleContexts(SquareCurlyExpressionContext.class);
		}
		public SquareCurlyExpressionContext squareCurlyExpression(int i) {
			return getRuleContext(SquareCurlyExpressionContext.class,i);
		}
		public KeyedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyedVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterKeyedVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitKeyedVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitKeyedVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyedVariableContext keyedVariable() throws RecognitionException {
		KeyedVariableContext _localctx = new KeyedVariableContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_keyedVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699);
					match(Dollar);
					}
					} 
				}
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VarName:
				{
				setState(1705);
				match(VarName);
				}
				break;
			case Dollar:
				{
				setState(1706);
				match(Dollar);
				setState(1707);
				match(OpenCurlyBracket);
				setState(1708);
				expression(0);
				setState(1709);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1713);
					squareCurlyExpression();
					}
					} 
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SquareCurlyExpressionContext extends ParserRuleContext {
		public TerminalNode OpenSquareBracket() { return getToken(PhpParser.OpenSquareBracket, 0); }
		public TerminalNode CloseSquareBracket() { return getToken(PhpParser.CloseSquareBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OpenCurlyBracket() { return getToken(PhpParser.OpenCurlyBracket, 0); }
		public TerminalNode CloseCurlyBracket() { return getToken(PhpParser.CloseCurlyBracket, 0); }
		public SquareCurlyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareCurlyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterSquareCurlyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitSquareCurlyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitSquareCurlyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareCurlyExpressionContext squareCurlyExpression() throws RecognitionException {
		SquareCurlyExpressionContext _localctx = new SquareCurlyExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_squareCurlyExpression);
		int _la;
		try {
			setState(1728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenSquareBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1719);
				match(OpenSquareBracket);
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1720);
					expression(0);
					}
				}

				setState(1723);
				match(CloseSquareBracket);
				}
				break;
			case OpenCurlyBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				match(OpenCurlyBracket);
				setState(1725);
				expression(0);
				setState(1726);
				match(CloseCurlyBracket);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentListElementContext> assignmentListElement() {
			return getRuleContexts(AssignmentListElementContext.class);
		}
		public AssignmentListElementContext assignmentListElement(int i) {
			return getRuleContext(AssignmentListElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PhpParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PhpParser.Comma, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
				{
				setState(1730);
				assignmentListElement();
				}
			}

			setState(1739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1733);
				match(Comma);
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Match_ - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (LambdaFn - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)) | (1L << (Inc - 108)) | (1L << (Dec - 108)))) != 0) || ((((_la - 189)) & ~0x3f) == 0 && ((1L << (_la - 189)) & ((1L << (NamespaceSeparator - 189)) | (1L << (Ampersand - 189)) | (1L << (Bang - 189)) | (1L << (Plus - 189)) | (1L << (Minus - 189)) | (1L << (Tilde - 189)) | (1L << (SuppressWarnings - 189)) | (1L << (Dollar - 189)) | (1L << (OpenRoundBracket - 189)) | (1L << (OpenSquareBracket - 189)) | (1L << (VarName - 189)) | (1L << (Label - 189)) | (1L << (Octal - 189)) | (1L << (Decimal - 189)) | (1L << (Real - 189)) | (1L << (Hex - 189)) | (1L << (Binary - 189)) | (1L << (BackQuoteString - 189)) | (1L << (SingleQuoteString - 189)) | (1L << (DoubleQuote - 189)) | (1L << (StartNowDoc - 189)) | (1L << (StartHereDoc - 189)))) != 0)) {
					{
					setState(1734);
					assignmentListElement();
					}
				}

				}
				}
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListElementContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(PhpParser.OpenRoundBracket, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode CloseRoundBracket() { return getToken(PhpParser.CloseRoundBracket, 0); }
		public ArrayItemContext arrayItem() {
			return getRuleContext(ArrayItemContext.class,0);
		}
		public AssignmentListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterAssignmentListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitAssignmentListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitAssignmentListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListElementContext assignmentListElement() throws RecognitionException {
		AssignmentListElementContext _localctx = new AssignmentListElementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_assignmentListElement);
		try {
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1742);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				match(List);
				setState(1744);
				match(OpenRoundBracket);
				setState(1745);
				assignmentList();
				setState(1746);
				match(CloseRoundBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1748);
				arrayItem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			_la = _input.LA(1);
			if ( !(_la==Abstract || _la==Final) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Label() { return getToken(PhpParser.Label, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode As() { return getToken(PhpParser.As, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode BooleanConstant() { return getToken(PhpParser.BooleanConstant, 0); }
		public TerminalNode Break() { return getToken(PhpParser.Break, 0); }
		public TerminalNode Callable() { return getToken(PhpParser.Callable, 0); }
		public TerminalNode Case() { return getToken(PhpParser.Case, 0); }
		public TerminalNode Catch() { return getToken(PhpParser.Catch, 0); }
		public TerminalNode Class() { return getToken(PhpParser.Class, 0); }
		public TerminalNode Clone() { return getToken(PhpParser.Clone, 0); }
		public TerminalNode Const() { return getToken(PhpParser.Const, 0); }
		public TerminalNode Continue() { return getToken(PhpParser.Continue, 0); }
		public TerminalNode Declare() { return getToken(PhpParser.Declare, 0); }
		public TerminalNode Default() { return getToken(PhpParser.Default, 0); }
		public TerminalNode Do() { return getToken(PhpParser.Do, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode Echo() { return getToken(PhpParser.Echo, 0); }
		public TerminalNode Else() { return getToken(PhpParser.Else, 0); }
		public TerminalNode ElseIf() { return getToken(PhpParser.ElseIf, 0); }
		public TerminalNode Empty() { return getToken(PhpParser.Empty, 0); }
		public TerminalNode EndDeclare() { return getToken(PhpParser.EndDeclare, 0); }
		public TerminalNode EndFor() { return getToken(PhpParser.EndFor, 0); }
		public TerminalNode EndForeach() { return getToken(PhpParser.EndForeach, 0); }
		public TerminalNode EndIf() { return getToken(PhpParser.EndIf, 0); }
		public TerminalNode EndSwitch() { return getToken(PhpParser.EndSwitch, 0); }
		public TerminalNode EndWhile() { return getToken(PhpParser.EndWhile, 0); }
		public TerminalNode Eval() { return getToken(PhpParser.Eval, 0); }
		public TerminalNode Exit() { return getToken(PhpParser.Exit, 0); }
		public TerminalNode Extends() { return getToken(PhpParser.Extends, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public TerminalNode Finally() { return getToken(PhpParser.Finally, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode For() { return getToken(PhpParser.For, 0); }
		public TerminalNode Foreach() { return getToken(PhpParser.Foreach, 0); }
		public TerminalNode Function_() { return getToken(PhpParser.Function_, 0); }
		public TerminalNode Global() { return getToken(PhpParser.Global, 0); }
		public TerminalNode Goto() { return getToken(PhpParser.Goto, 0); }
		public TerminalNode If() { return getToken(PhpParser.If, 0); }
		public TerminalNode Implements() { return getToken(PhpParser.Implements, 0); }
		public TerminalNode Import() { return getToken(PhpParser.Import, 0); }
		public TerminalNode Include() { return getToken(PhpParser.Include, 0); }
		public TerminalNode IncludeOnce() { return getToken(PhpParser.IncludeOnce, 0); }
		public TerminalNode InstanceOf() { return getToken(PhpParser.InstanceOf, 0); }
		public TerminalNode InsteadOf() { return getToken(PhpParser.InsteadOf, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Interface() { return getToken(PhpParser.Interface, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode IsSet() { return getToken(PhpParser.IsSet, 0); }
		public TerminalNode List() { return getToken(PhpParser.List, 0); }
		public TerminalNode LogicalAnd() { return getToken(PhpParser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(PhpParser.LogicalOr, 0); }
		public TerminalNode LogicalXor() { return getToken(PhpParser.LogicalXor, 0); }
		public TerminalNode Namespace() { return getToken(PhpParser.Namespace, 0); }
		public TerminalNode New() { return getToken(PhpParser.New, 0); }
		public TerminalNode Null() { return getToken(PhpParser.Null, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Parent_() { return getToken(PhpParser.Parent_, 0); }
		public TerminalNode Partial() { return getToken(PhpParser.Partial, 0); }
		public TerminalNode Print() { return getToken(PhpParser.Print, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Require() { return getToken(PhpParser.Require, 0); }
		public TerminalNode RequireOnce() { return getToken(PhpParser.RequireOnce, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Return() { return getToken(PhpParser.Return, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Switch() { return getToken(PhpParser.Switch, 0); }
		public TerminalNode Throw() { return getToken(PhpParser.Throw, 0); }
		public TerminalNode Trait() { return getToken(PhpParser.Trait, 0); }
		public TerminalNode Try() { return getToken(PhpParser.Try, 0); }
		public TerminalNode Typeof() { return getToken(PhpParser.Typeof, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public TerminalNode Use() { return getToken(PhpParser.Use, 0); }
		public TerminalNode Var() { return getToken(PhpParser.Var, 0); }
		public TerminalNode While() { return getToken(PhpParser.While, 0); }
		public TerminalNode Yield() { return getToken(PhpParser.Yield, 0); }
		public TerminalNode From() { return getToken(PhpParser.From, 0); }
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (Abstract - 44)) | (1L << (Array - 44)) | (1L << (As - 44)) | (1L << (BinaryCast - 44)) | (1L << (BoolType - 44)) | (1L << (BooleanConstant - 44)) | (1L << (Break - 44)) | (1L << (Callable - 44)) | (1L << (Case - 44)) | (1L << (Catch - 44)) | (1L << (Class - 44)) | (1L << (Clone - 44)) | (1L << (Const - 44)) | (1L << (Continue - 44)) | (1L << (Declare - 44)) | (1L << (Default - 44)) | (1L << (Do - 44)) | (1L << (DoubleCast - 44)) | (1L << (DoubleType - 44)) | (1L << (Echo - 44)) | (1L << (Else - 44)) | (1L << (ElseIf - 44)) | (1L << (Empty - 44)) | (1L << (EndDeclare - 44)) | (1L << (EndFor - 44)) | (1L << (EndForeach - 44)) | (1L << (EndIf - 44)) | (1L << (EndSwitch - 44)) | (1L << (EndWhile - 44)) | (1L << (Eval - 44)) | (1L << (Exit - 44)) | (1L << (Extends - 44)) | (1L << (Final - 44)) | (1L << (Finally - 44)) | (1L << (FloatCast - 44)) | (1L << (For - 44)) | (1L << (Foreach - 44)) | (1L << (Function_ - 44)) | (1L << (Global - 44)) | (1L << (Goto - 44)) | (1L << (If - 44)) | (1L << (Implements - 44)) | (1L << (Import - 44)) | (1L << (Include - 44)) | (1L << (IncludeOnce - 44)) | (1L << (InstanceOf - 44)) | (1L << (InsteadOf - 44)) | (1L << (Int8Cast - 44)) | (1L << (Int16Cast - 44)) | (1L << (Int64Type - 44)) | (1L << (IntType - 44)) | (1L << (Interface - 44)) | (1L << (IsSet - 44)) | (1L << (List - 44)) | (1L << (LogicalAnd - 44)) | (1L << (LogicalOr - 44)) | (1L << (LogicalXor - 44)) | (1L << (Namespace - 44)) | (1L << (New - 44)) | (1L << (Null - 44)) | (1L << (ObjectType - 44)) | (1L << (Parent_ - 44)) | (1L << (Partial - 44)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (Print - 108)) | (1L << (Private - 108)) | (1L << (Protected - 108)) | (1L << (Public - 108)) | (1L << (Require - 108)) | (1L << (RequireOnce - 108)) | (1L << (Resource - 108)) | (1L << (Return - 108)) | (1L << (Static - 108)) | (1L << (StringType - 108)) | (1L << (Switch - 108)) | (1L << (Throw - 108)) | (1L << (Trait - 108)) | (1L << (Try - 108)) | (1L << (Typeof - 108)) | (1L << (UintCast - 108)) | (1L << (UnicodeCast - 108)) | (1L << (Unset - 108)) | (1L << (Use - 108)) | (1L << (Var - 108)) | (1L << (While - 108)) | (1L << (Yield - 108)) | (1L << (From - 108)) | (1L << (Get - 108)) | (1L << (Set - 108)) | (1L << (Call - 108)) | (1L << (CallStatic - 108)) | (1L << (Constructor - 108)) | (1L << (Destruct - 108)) | (1L << (Wakeup - 108)) | (1L << (Sleep - 108)) | (1L << (Autoload - 108)) | (1L << (IsSet__ - 108)) | (1L << (Unset__ - 108)) | (1L << (ToString__ - 108)) | (1L << (Invoke - 108)) | (1L << (SetState - 108)) | (1L << (Clone__ - 108)) | (1L << (DebugInfo - 108)) | (1L << (Namespace__ - 108)) | (1L << (Class__ - 108)) | (1L << (Traic__ - 108)) | (1L << (Function__ - 108)) | (1L << (Method__ - 108)) | (1L << (Line__ - 108)) | (1L << (File__ - 108)) | (1L << (Dir__ - 108)))) != 0) || _la==Label) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(PhpParser.Public, 0); }
		public TerminalNode Protected() { return getToken(PhpParser.Protected, 0); }
		public TerminalNode Private() { return getToken(PhpParser.Private, 0); }
		public TerminalNode Static() { return getToken(PhpParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(PhpParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(PhpParser.Final, 0); }
		public MemberModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMemberModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMemberModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMemberModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberModifierContext memberModifier() throws RecognitionException {
		MemberModifierContext _localctx = new MemberModifierContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_memberModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_la = _input.LA(1);
			if ( !(_la==Abstract || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Final - 76)) | (1L << (Private - 76)) | (1L << (Protected - 76)) | (1L << (Public - 76)) | (1L << (Static - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagicConstantContext extends ParserRuleContext {
		public TerminalNode Namespace__() { return getToken(PhpParser.Namespace__, 0); }
		public TerminalNode Class__() { return getToken(PhpParser.Class__, 0); }
		public TerminalNode Traic__() { return getToken(PhpParser.Traic__, 0); }
		public TerminalNode Function__() { return getToken(PhpParser.Function__, 0); }
		public TerminalNode Method__() { return getToken(PhpParser.Method__, 0); }
		public TerminalNode Line__() { return getToken(PhpParser.Line__, 0); }
		public TerminalNode File__() { return getToken(PhpParser.File__, 0); }
		public TerminalNode Dir__() { return getToken(PhpParser.Dir__, 0); }
		public MagicConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMagicConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMagicConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMagicConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicConstantContext magicConstant() throws RecognitionException {
		MagicConstantContext _localctx = new MagicConstantContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_magicConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (Namespace__ - 148)) | (1L << (Class__ - 148)) | (1L << (Traic__ - 148)) | (1L << (Function__ - 148)) | (1L << (Method__ - 148)) | (1L << (Line__ - 148)) | (1L << (File__ - 148)) | (1L << (Dir__ - 148)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagicMethodContext extends ParserRuleContext {
		public TerminalNode Get() { return getToken(PhpParser.Get, 0); }
		public TerminalNode Set() { return getToken(PhpParser.Set, 0); }
		public TerminalNode Call() { return getToken(PhpParser.Call, 0); }
		public TerminalNode CallStatic() { return getToken(PhpParser.CallStatic, 0); }
		public TerminalNode Constructor() { return getToken(PhpParser.Constructor, 0); }
		public TerminalNode Destruct() { return getToken(PhpParser.Destruct, 0); }
		public TerminalNode Wakeup() { return getToken(PhpParser.Wakeup, 0); }
		public TerminalNode Sleep() { return getToken(PhpParser.Sleep, 0); }
		public TerminalNode Autoload() { return getToken(PhpParser.Autoload, 0); }
		public TerminalNode IsSet__() { return getToken(PhpParser.IsSet__, 0); }
		public TerminalNode Unset__() { return getToken(PhpParser.Unset__, 0); }
		public TerminalNode ToString__() { return getToken(PhpParser.ToString__, 0); }
		public TerminalNode Invoke() { return getToken(PhpParser.Invoke, 0); }
		public TerminalNode SetState() { return getToken(PhpParser.SetState, 0); }
		public TerminalNode Clone__() { return getToken(PhpParser.Clone__, 0); }
		public TerminalNode DebugInfo() { return getToken(PhpParser.DebugInfo, 0); }
		public MagicMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magicMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterMagicMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitMagicMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitMagicMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagicMethodContext magicMethod() throws RecognitionException {
		MagicMethodContext _localctx = new MagicMethodContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_magicMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Get - 132)) | (1L << (Set - 132)) | (1L << (Call - 132)) | (1L << (CallStatic - 132)) | (1L << (Constructor - 132)) | (1L << (Destruct - 132)) | (1L << (Wakeup - 132)) | (1L << (Sleep - 132)) | (1L << (Autoload - 132)) | (1L << (IsSet__ - 132)) | (1L << (Unset__ - 132)) | (1L << (ToString__ - 132)) | (1L << (Invoke - 132)) | (1L << (SetState - 132)) | (1L << (Clone__ - 132)) | (1L << (DebugInfo - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BoolType) | (1L << DoubleType))) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Int64Type - 93)) | (1L << (IntType - 93)) | (1L << (ObjectType - 93)) | (1L << (Resource - 93)) | (1L << (StringType - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastOperationContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(PhpParser.BoolType, 0); }
		public TerminalNode Int8Cast() { return getToken(PhpParser.Int8Cast, 0); }
		public TerminalNode Int16Cast() { return getToken(PhpParser.Int16Cast, 0); }
		public TerminalNode IntType() { return getToken(PhpParser.IntType, 0); }
		public TerminalNode Int64Type() { return getToken(PhpParser.Int64Type, 0); }
		public TerminalNode UintCast() { return getToken(PhpParser.UintCast, 0); }
		public TerminalNode DoubleCast() { return getToken(PhpParser.DoubleCast, 0); }
		public TerminalNode DoubleType() { return getToken(PhpParser.DoubleType, 0); }
		public TerminalNode FloatCast() { return getToken(PhpParser.FloatCast, 0); }
		public TerminalNode StringType() { return getToken(PhpParser.StringType, 0); }
		public TerminalNode BinaryCast() { return getToken(PhpParser.BinaryCast, 0); }
		public TerminalNode UnicodeCast() { return getToken(PhpParser.UnicodeCast, 0); }
		public TerminalNode Array() { return getToken(PhpParser.Array, 0); }
		public TerminalNode ObjectType() { return getToken(PhpParser.ObjectType, 0); }
		public TerminalNode Resource() { return getToken(PhpParser.Resource, 0); }
		public TerminalNode Unset() { return getToken(PhpParser.Unset, 0); }
		public CastOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).enterCastOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PhpParserListener ) ((PhpParserListener)listener).exitCastOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PhpParserVisitor ) return ((PhpParserVisitor<? extends T>)visitor).visitCastOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastOperationContext castOperation() throws RecognitionException {
		CastOperationContext _localctx = new CastOperationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_castOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Array) | (1L << BinaryCast) | (1L << BoolType) | (1L << DoubleCast) | (1L << DoubleType))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (FloatCast - 78)) | (1L << (Int8Cast - 78)) | (1L << (Int16Cast - 78)) | (1L << (Int64Type - 78)) | (1L << (IntType - 78)) | (1L << (ObjectType - 78)) | (1L << (Resource - 78)) | (1L << (StringType - 78)) | (1L << (UintCast - 78)) | (1L << (UnicodeCast - 78)) | (1L << (Unset - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 57:
			return typeHint_sempred((TypeHintContext)_localctx, predIndex);
		case 77:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeHint_sempred(TypeHintContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		case 18:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ef\u06e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0001\u0000\u0003\u0000\u0106\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u010a\b\u0000\n\u0000\f\u0000\u010d\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0112\b\u0001\u000b\u0001"+
		"\f\u0001\u0113\u0001\u0001\u0003\u0001\u0117\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u012f\b\u0002\n\u0002\f\u0002"+
		"\u0132\t\u0002\u0001\u0002\u0003\u0002\u0135\b\u0002\u0001\u0003\u0004"+
		"\u0003\u0138\b\u0003\u000b\u0003\f\u0003\u0139\u0001\u0004\u0004\u0004"+
		"\u013d\b\u0004\u000b\u0004\f\u0004\u013e\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0147\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u014b\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0003\u0007\u0151\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0156\b\u0007\u0001\u0007\u0005\u0007\u0159\b\u0007"+
		"\n\u0007\f\u0007\u015c\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t"+
		"\u0162\b\t\u0001\t\u0001\t\u0005\t\u0166\b\t\n\t\f\t\u0169\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u016f\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0176\b\n\u0001\u000b\u0003\u000b\u0179\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u017d\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0181\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0188\b\u000b\u0001\u000b\u0003\u000b\u018b\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u0190\b\f\u0001\f\u0003\f\u0193"+
		"\b\f\u0001\f\u0003\f\u0196\b\f\u0001\f\u0003\f\u0199\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u019e\b\f\u0001\f\u0001\f\u0003\f\u01a2\b\f\u0001\f"+
		"\u0001\f\u0003\f\u01a6\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u01ab\b\f\u0001"+
		"\f\u0001\f\u0003\f\u01af\b\f\u0003\f\u01b1\b\f\u0001\f\u0001\f\u0005\f"+
		"\u01b5\b\f\n\f\f\f\u01b8\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u01c1\b\u000e\n\u000e\f\u000e\u01c4"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01d4\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u01d9\b\u0010\n\u0010\f\u0010\u01dc\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01e1\b\u0011\n\u0011"+
		"\f\u0011\u01e4\t\u0011\u0001\u0012\u0003\u0012\u01e7\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0003\u0013\u01ec\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01f2\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u01f8\b\u0014\n\u0014\f\u0014\u01fb"+
		"\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u0200\b\u0015"+
		"\u000b\u0015\f\u0015\u0201\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0208\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u020d\b\u0016\n\u0016\f\u0016\u0210\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0216\b\u0017\u0001\u0018\u0005\u0018\u0219"+
		"\b\u0018\n\u0018\f\u0018\u021c\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0221\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u023e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u024a\b\u001d\n\u001d\f\u001d\u024d\t\u001d\u0001\u001d\u0003\u001d\u0250"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0257\b\u001d\n\u001d\f\u001d\u025a\t\u001d\u0001\u001d\u0003\u001d"+
		"\u025d\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0262\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u027c\b\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001$\u0003$\u0287\b$\u0001$\u0001$\u0003$\u028b"+
		"\b$\u0001$\u0001$\u0003$\u028f\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0298\b$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u02a2\b\'\u0001\'\u0005\'\u02a5\b\'\n\'\f\'\u02a8\t"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u02ad\b\'\u0001\'\u0005\'\u02b0\b\'"+
		"\n\'\f\'\u02b3\t\'\u0001\'\u0001\'\u0003\'\u02b7\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u02bc\b(\u0001(\u0004(\u02bf\b(\u000b(\f(\u02c0\u0001(\u0001"+
		"(\u0001)\u0001)\u0003)\u02c7\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u02cd"+
		"\b*\u0001*\u0001*\u0001+\u0001+\u0003+\u02d3\b+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u02e5\b.\u0001.\u0001.\u0001.\u0003.\u02ea\b.\u0001"+
		".\u0003.\u02ed\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u02f7\b.\u0001.\u0003.\u02fa\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0307\b.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u030f\b.\u0001/\u0001/\u0001/\u0004"+
		"/\u0314\b/\u000b/\f/\u0315\u0001/\u0003/\u0319\b/\u0001/\u0005/\u031c"+
		"\b/\n/\f/\u031f\t/\u0001/\u0003/\u0322\b/\u00010\u00010\u00010\u00010"+
		"\u00010\u00050\u0329\b0\n0\f0\u032c\t0\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u0347\b4\u00015\u00045\u034a\b5\u000b5\f5\u034b\u00016\u0001"+
		"6\u00016\u00056\u0351\b6\n6\f6\u0354\t6\u00017\u00037\u0357\b7\u00017"+
		"\u00017\u00057\u035b\b7\n7\f7\u035e\t7\u00017\u00037\u0361\b7\u00018\u0003"+
		"8\u0364\b8\u00018\u00038\u0367\b8\u00018\u00038\u036a\b8\u00018\u0003"+
		"8\u036d\b8\u00018\u00038\u0370\b8\u00018\u00038\u0373\b8\u00018\u0001"+
		"8\u00019\u00019\u00019\u00019\u00039\u037b\b9\u00019\u00019\u00019\u0005"+
		"9\u0380\b9\n9\f9\u0383\t9\u0001:\u0001:\u0001:\u0001:\u0005:\u0389\b:"+
		"\n:\f:\u038c\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u0398\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0005=\u03a2\b=\n=\f=\u03a5\t=\u0001=\u0001=\u0001>\u0003"+
		">\u03aa\b>\u0001>\u0001>\u0003>\u03ae\b>\u0001>\u0001>\u0001>\u0005>\u03b3"+
		"\b>\n>\f>\u03b6\t>\u0001>\u0001>\u0001>\u0003>\u03bb\b>\u0001>\u0001>"+
		"\u0003>\u03bf\b>\u0001>\u0001>\u0001>\u0005>\u03c4\b>\n>\f>\u03c7\t>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u03cd\b>\u0001>\u0001>\u0003>\u03d1\b>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u03d7\b>\u0001>\u0001>\u0003>\u03db\b>\u0003"+
		">\u03dd\b>\u0001>\u0001>\u0001>\u0001>\u0003>\u03e3\b>\u0001?\u0001?\u0001"+
		"?\u0005?\u03e8\b?\n?\f?\u03eb\t?\u0001?\u0003?\u03ee\b?\u0001@\u0001@"+
		"\u0003@\u03f2\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u03ff\bB\u0001B\u0003B\u0402\bB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0003C\u0409\bC\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0003D\u0410\bD\u0001E\u0001E\u0003E\u0414\bE\u0001F\u0001F\u0003F\u0418"+
		"\bF\u0001G\u0004G\u041b\bG\u000bG\fG\u041c\u0001H\u0001H\u0001H\u0003"+
		"H\u0422\bH\u0001I\u0001I\u0001I\u0001I\u0001J\u0003J\u0429\bJ\u0001J\u0001"+
		"J\u0001J\u0001J\u0005J\u042f\bJ\nJ\fJ\u0432\tJ\u0001J\u0001J\u0001K\u0001"+
		"K\u0001K\u0005K\u0439\bK\nK\fK\u043c\tK\u0001L\u0001L\u0001L\u0003L\u0441"+
		"\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0003M\u0480\bM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0003M\u048d\bM\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0003M\u0494\bM\u0001M\u0001M\u0001M\u0003M\u0499\bM\u0003M\u049b"+
		"\bM\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u04c1\bM\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0005M\u04d7"+
		"\bM\nM\fM\u04da\tM\u0001N\u0001N\u0003N\u04de\bN\u0001O\u0001O\u0001O"+
		"\u0003O\u04e3\bO\u0001O\u0001O\u0001O\u0003O\u04e8\bO\u0001O\u0003O\u04eb"+
		"\bO\u0001O\u0001O\u0001O\u0001O\u0003O\u04f1\bO\u0001P\u0003P\u04f4\b"+
		"P\u0001P\u0001P\u0003P\u04f8\bP\u0001P\u0001P\u0001P\u0001P\u0003P\u04fe"+
		"\bP\u0001P\u0001P\u0003P\u0502\bP\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u050d\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u0517\bQ\nQ\fQ\u051a\tQ\u0001Q\u0003Q\u051d"+
		"\bQ\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0005R\u0524\bR\nR\fR\u0527\tR"+
		"\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0003S\u052f\bS\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0001U\u0003U\u0537\bU\u0001U\u0001U\u0003U\u053b"+
		"\bU\u0001V\u0001V\u0001V\u0005V\u0540\bV\nV\fV\u0543\tV\u0001V\u0003V"+
		"\u0546\bV\u0001W\u0001W\u0001W\u0003W\u054b\bW\u0001W\u0001W\u0001W\u0003"+
		"W\u0550\bW\u0001W\u0001W\u0003W\u0554\bW\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0005X\u055b\bX\nX\fX\u055e\tX\u0001X\u0001X\u0001Y\u0003Y\u0563\bY"+
		"\u0001Y\u0001Y\u0001Z\u0001Z\u0003Z\u0569\bZ\u0001Z\u0003Z\u056c\bZ\u0001"+
		"[\u0001[\u0003[\u0570\b[\u0001[\u0003[\u0573\b[\u0001[\u0001[\u0001[\u0003"+
		"[\u0578\b[\u0001\\\u0003\\\u057b\b\\\u0001\\\u0003\\\u057e\b\\\u0001\\"+
		"\u0003\\\u0581\b\\\u0001\\\u0003\\\u0584\b\\\u0001\\\u0001\\\u0003\\\u0588"+
		"\b\\\u0001\\\u0001\\\u0003\\\u058c\b\\\u0001\\\u0001\\\u0003\\\u0590\b"+
		"\\\u0001\\\u0001\\\u0001\\\u0003\\\u0595\b\\\u0001\\\u0001\\\u0003\\\u0599"+
		"\b\\\u0003\\\u059b\b\\\u0001\\\u0001\\\u0005\\\u059f\b\\\n\\\f\\\u05a2"+
		"\t\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0005]\u05a9\b]\n]\f]\u05ac"+
		"\t]\u0001^\u0003^\u05af\b^\u0001^\u0003^\u05b2\b^\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0001_\u0005_\u05ba\b_\n_\f_\u05bd\t_\u0001_\u0001_\u0003"+
		"_\u05c1\b_\u0003_\u05c3\b_\u0001`\u0001`\u0001`\u0003`\u05c8\b`\u0001"+
		"`\u0001`\u0001`\u0001`\u0005`\u05ce\b`\n`\f`\u05d1\t`\u0001`\u0003`\u05d4"+
		"\b`\u0001`\u0001`\u0003`\u05d8\b`\u0001a\u0001a\u0001a\u0005a\u05dd\b"+
		"a\na\fa\u05e0\ta\u0001b\u0001b\u0001b\u0001b\u0005b\u05e6\bb\nb\fb\u05e9"+
		"\tb\u0001b\u0003b\u05ec\bb\u0001b\u0003b\u05ef\bb\u0001b\u0001b\u0001"+
		"c\u0003c\u05f4\bc\u0001c\u0003c\u05f7\bc\u0001c\u0001c\u0001c\u0003c\u05fc"+
		"\bc\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0003"+
		"e\u0607\be\u0003e\u0609\be\u0001e\u0001e\u0001e\u0001e\u0003e\u060f\b"+
		"e\u0003e\u0611\be\u0001e\u0001e\u0001e\u0003e\u0616\be\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0003f\u061d\bf\u0001g\u0001g\u0001g\u0001g\u0003g\u0623"+
		"\bg\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u062d"+
		"\bi\u0001i\u0001i\u0001i\u0003i\u0632\bi\u0001i\u0001i\u0001i\u0003i\u0637"+
		"\bi\u0003i\u0639\bi\u0001j\u0001j\u0001k\u0001k\u0004k\u063f\bk\u000b"+
		"k\fk\u0640\u0001k\u0001k\u0004k\u0645\bk\u000bk\fk\u0646\u0001k\u0001"+
		"k\u0001k\u0005k\u064c\bk\nk\fk\u064f\tk\u0001k\u0003k\u0652\bk\u0001l"+
		"\u0001l\u0001l\u0003l\u0657\bl\u0001m\u0001m\u0001m\u0005m\u065c\bm\n"+
		"m\fm\u065f\tm\u0001n\u0001n\u0005n\u0663\bn\nn\fn\u0666\tn\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0001o\u0003o\u066e\bo\u0001p\u0001p\u0001p\u0003"+
		"p\u0673\bp\u0001q\u0001q\u0001q\u0001r\u0001r\u0001r\u0001r\u0003r\u067c"+
		"\br\u0001s\u0003s\u067f\bs\u0001s\u0001s\u0005s\u0683\bs\ns\fs\u0686\t"+
		"s\u0001t\u0001t\u0001t\u0003t\u068b\bt\u0001t\u0001t\u0001t\u0001t\u0003"+
		"t\u0691\bt\u0001u\u0001u\u0003u\u0695\bu\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0003v\u069c\bv\u0001v\u0005v\u069f\bv\nv\fv\u06a2\tv\u0001w\u0005w"+
		"\u06a5\bw\nw\fw\u06a8\tw\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0003"+
		"w\u06b0\bw\u0001w\u0005w\u06b3\bw\nw\fw\u06b6\tw\u0001x\u0001x\u0003x"+
		"\u06ba\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u06c1\bx\u0001y\u0003"+
		"y\u06c4\by\u0001y\u0001y\u0003y\u06c8\by\u0005y\u06ca\by\ny\fy\u06cd\t"+
		"y\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u06d6\bz\u0001"+
		"{\u0001{\u0001|\u0001|\u0001}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f"+
		"\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0000\u0002"+
		"r\u009a\u0082\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0000\u0018\u0002\u000088Q"+
		"Q\u0002\u000066xx\u0001\u0000\u00d6\u00d7\u0001\u0000\u00ca\u00cb\u0002"+
		"\u0000\u00c3\u00c3\u00c5\u00c6\u0001\u0000\u00a0\u00a1\u0001\u0000WX\u0001"+
		"\u0000pq\u0001\u0000\u00c7\u00c9\u0002\u0000\u00c5\u00c6\u00cd\u00cd\u0001"+
		"\u0000\u00b9\u00ba\u0002\u0000\u00a6\u00a7\u00bf\u00c0\u0001\u0000\u00a2"+
		"\u00a5\u0004\u0000\u00a8\u00aa\u00ac\u00b4\u00b8\u00b8\u00d8\u00d8\u0001"+
		"\u0000\u00c5\u00c6\u0002\u0000\u00dd\u00de\u00e0\u00e1\u0002\u000066j"+
		"j\u0002\u0000,,LL\u0004\u0000,df\u0082\u0084\u009b\u00dc\u00dc\u0004\u0000"+
		",,LLmott\u0001\u0000\u0094\u009b\u0001\u0000\u0084\u0093\u0007\u0000-"+
		"-00>>]^iirruu\t\u0000--/0=>NN[^iirruu{}\u07ba\u0000\u0105\u0001\u0000"+
		"\u0000\u0000\u0002\u0116\u0001\u0000\u0000\u0000\u0004\u0134\u0001\u0000"+
		"\u0000\u0000\u0006\u0137\u0001\u0000\u0000\u0000\b\u013c\u0001\u0000\u0000"+
		"\u0000\n\u0146\u0001\u0000\u0000\u0000\f\u0148\u0001\u0000\u0000\u0000"+
		"\u000e\u0150\u0001\u0000\u0000\u0000\u0010\u015d\u0001\u0000\u0000\u0000"+
		"\u0012\u015f\u0001\u0000\u0000\u0000\u0014\u0175\u0001\u0000\u0000\u0000"+
		"\u0016\u0178\u0001\u0000\u0000\u0000\u0018\u018f\u0001\u0000\u0000\u0000"+
		"\u001a\u01bb\u0001\u0000\u0000\u0000\u001c\u01bd\u0001\u0000\u0000\u0000"+
		"\u001e\u01d3\u0001\u0000\u0000\u0000 \u01d5\u0001\u0000\u0000\u0000\""+
		"\u01dd\u0001\u0000\u0000\u0000$\u01e6\u0001\u0000\u0000\u0000&\u01eb\u0001"+
		"\u0000\u0000\u0000(\u01f3\u0001\u0000\u0000\u0000*\u01ff\u0001\u0000\u0000"+
		"\u0000,\u0203\u0001\u0000\u0000\u0000.\u0213\u0001\u0000\u0000\u00000"+
		"\u021a\u0001\u0000\u0000\u00002\u0220\u0001\u0000\u0000\u00004\u023d\u0001"+
		"\u0000\u0000\u00006\u023f\u0001\u0000\u0000\u00008\u0241\u0001\u0000\u0000"+
		"\u0000:\u0261\u0001\u0000\u0000\u0000<\u0263\u0001\u0000\u0000\u0000>"+
		"\u0267\u0001\u0000\u0000\u0000@\u026c\u0001\u0000\u0000\u0000B\u026f\u0001"+
		"\u0000\u0000\u0000D\u0273\u0001\u0000\u0000\u0000F\u027d\u0001\u0000\u0000"+
		"\u0000H\u0283\u0001\u0000\u0000\u0000J\u0299\u0001\u0000\u0000\u0000L"+
		"\u029b\u0001\u0000\u0000\u0000N\u029d\u0001\u0000\u0000\u0000P\u02be\u0001"+
		"\u0000\u0000\u0000R\u02c4\u0001\u0000\u0000\u0000T\u02ca\u0001\u0000\u0000"+
		"\u0000V\u02d0\u0001\u0000\u0000\u0000X\u02d6\u0001\u0000\u0000\u0000Z"+
		"\u02d9\u0001\u0000\u0000\u0000\\\u02df\u0001\u0000\u0000\u0000^\u0310"+
		"\u0001\u0000\u0000\u0000`\u0323\u0001\u0000\u0000\u0000b\u0331\u0001\u0000"+
		"\u0000\u0000d\u0334\u0001\u0000\u0000\u0000f\u0338\u0001\u0000\u0000\u0000"+
		"h\u033c\u0001\u0000\u0000\u0000j\u0349\u0001\u0000\u0000\u0000l\u034d"+
		"\u0001\u0000\u0000\u0000n\u0356\u0001\u0000\u0000\u0000p\u0363\u0001\u0000"+
		"\u0000\u0000r\u037a\u0001\u0000\u0000\u0000t\u0384\u0001\u0000\u0000\u0000"+
		"v\u0397\u0001\u0000\u0000\u0000x\u0399\u0001\u0000\u0000\u0000z\u039d"+
		"\u0001\u0000\u0000\u0000|\u03e2\u0001\u0000\u0000\u0000~\u03ed\u0001\u0000"+
		"\u0000\u0000\u0080\u03f1\u0001\u0000\u0000\u0000\u0082\u03f3\u0001\u0000"+
		"\u0000\u0000\u0084\u03fa\u0001\u0000\u0000\u0000\u0086\u0408\u0001\u0000"+
		"\u0000\u0000\u0088\u040c\u0001\u0000\u0000\u0000\u008a\u0413\u0001\u0000"+
		"\u0000\u0000\u008c\u0417\u0001\u0000\u0000\u0000\u008e\u041a\u0001\u0000"+
		"\u0000\u0000\u0090\u041e\u0001\u0000\u0000\u0000\u0092\u0423\u0001\u0000"+
		"\u0000\u0000\u0094\u0428\u0001\u0000\u0000\u0000\u0096\u0435\u0001\u0000"+
		"\u0000\u0000\u0098\u043d\u0001\u0000\u0000\u0000\u009a\u049a\u0001\u0000"+
		"\u0000\u0000\u009c\u04dd\u0001\u0000\u0000\u0000\u009e\u04ea\u0001\u0000"+
		"\u0000\u0000\u00a0\u050c\u0001\u0000\u0000\u0000\u00a2\u050e\u0001\u0000"+
		"\u0000\u0000\u00a4\u0520\u0001\u0000\u0000\u0000\u00a6\u052b\u0001\u0000"+
		"\u0000\u0000\u00a8\u0530\u0001\u0000\u0000\u0000\u00aa\u0532\u0001\u0000"+
		"\u0000\u0000\u00ac\u053c\u0001\u0000\u0000\u0000\u00ae\u0553\u0001\u0000"+
		"\u0000\u0000\u00b0\u0555\u0001\u0000\u0000\u0000\u00b2\u0562\u0001\u0000"+
		"\u0000\u0000\u00b4\u056b\u0001\u0000\u0000\u0000\u00b6\u0577\u0001\u0000"+
		"\u0000\u0000\u00b8\u057a\u0001\u0000\u0000\u0000\u00ba\u05a5\u0001\u0000"+
		"\u0000\u0000\u00bc\u05ae\u0001\u0000\u0000\u0000\u00be\u05c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u05d7\u0001\u0000\u0000\u0000\u00c2\u05d9\u0001\u0000"+
		"\u0000\u0000\u00c4\u05e1\u0001\u0000\u0000\u0000\u00c6\u05fb\u0001\u0000"+
		"\u0000\u0000\u00c8\u05fd\u0001\u0000\u0000\u0000\u00ca\u0615\u0001\u0000"+
		"\u0000\u0000\u00cc\u061c\u0001\u0000\u0000\u0000\u00ce\u0622\u0001\u0000"+
		"\u0000\u0000\u00d0\u0624\u0001\u0000\u0000\u0000\u00d2\u0638\u0001\u0000"+
		"\u0000\u0000\u00d4\u063a\u0001\u0000\u0000\u0000\u00d6\u0651\u0001\u0000"+
		"\u0000\u0000\u00d8\u0656\u0001\u0000\u0000\u0000\u00da\u0658\u0001\u0000"+
		"\u0000\u0000\u00dc\u0660\u0001\u0000\u0000\u0000\u00de\u066d\u0001\u0000"+
		"\u0000\u0000\u00e0\u066f\u0001\u0000\u0000\u0000\u00e2\u0674\u0001\u0000"+
		"\u0000\u0000\u00e4\u067b\u0001\u0000\u0000\u0000\u00e6\u067e\u0001\u0000"+
		"\u0000\u0000\u00e8\u0690\u0001\u0000\u0000\u0000\u00ea\u0694\u0001\u0000"+
		"\u0000\u0000\u00ec\u069b\u0001\u0000\u0000\u0000\u00ee\u06a6\u0001\u0000"+
		"\u0000\u0000\u00f0\u06c0\u0001\u0000\u0000\u0000\u00f2\u06c3\u0001\u0000"+
		"\u0000\u0000\u00f4\u06d5\u0001\u0000\u0000\u0000\u00f6\u06d7\u0001\u0000"+
		"\u0000\u0000\u00f8\u06d9\u0001\u0000\u0000\u0000\u00fa\u06db\u0001\u0000"+
		"\u0000\u0000\u00fc\u06dd\u0001\u0000\u0000\u0000\u00fe\u06df\u0001\u0000"+
		"\u0000\u0000\u0100\u06e1\u0001\u0000\u0000\u0000\u0102\u06e3\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0005\n\u0000\u0000\u0105\u0104\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010b\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0003\u0002\u0001\u0000\u0108\u010a\u0003\b\u0004\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0000\u0000\u0001"+
		"\u010f\u0001\u0001\u0000\u0000\u0000\u0110\u0112\u0003\u0004\u0002\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0117\u0003\u0006\u0003\u0000"+
		"\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0003\u0001\u0000\u0000\u0000\u0118\u0135\u0005\b\u0000\u0000\u0119"+
		"\u0135\u0005\u000f\u0000\u0000\u011a\u0135\u0005\u0006\u0000\u0000\u011b"+
		"\u0135\u0005\t\u0000\u0000\u011c\u0135\u0005\u0018\u0000\u0000\u011d\u0135"+
		"\u0005\u0010\u0000\u0000\u011e\u0135\u0005\u0011\u0000\u0000\u011f\u0135"+
		"\u0005\u0002\u0000\u0000\u0120\u0135\u0005\u0012\u0000\u0000\u0121\u0135"+
		"\u0005\u0013\u0000\u0000\u0122\u0135\u0005\u001b\u0000\u0000\u0123\u0135"+
		"\u0005\u0014\u0000\u0000\u0124\u0135\u0005\u001f\u0000\u0000\u0125\u0135"+
		"\u0005\u0015\u0000\u0000\u0126\u0135\u0005\u0016\u0000\u0000\u0127\u0135"+
		"\u0005\u001c\u0000\u0000\u0128\u0135\u0005 \u0000\u0000\u0129\u0135\u0005"+
		"%\u0000\u0000\u012a\u0135\u0005\u0005\u0000\u0000\u012b\u0135\u0005#\u0000"+
		"\u0000\u012c\u0130\u0005\u0003\u0000\u0000\u012d\u012f\u0005\f\u0000\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0135\u0005\r\u0000\u0000\u0134\u0118\u0001\u0000\u0000\u0000\u0134"+
		"\u0119\u0001\u0000\u0000\u0000\u0134\u011a\u0001\u0000\u0000\u0000\u0134"+
		"\u011b\u0001\u0000\u0000\u0000\u0134\u011c\u0001\u0000\u0000\u0000\u0134"+
		"\u011d\u0001\u0000\u0000\u0000\u0134\u011e\u0001\u0000\u0000\u0000\u0134"+
		"\u011f\u0001\u0000\u0000\u0000\u0134\u0120\u0001\u0000\u0000\u0000\u0134"+
		"\u0121\u0001\u0000\u0000\u0000\u0134\u0122\u0001\u0000\u0000\u0000\u0134"+
		"\u0123\u0001\u0000\u0000\u0000\u0134\u0124\u0001\u0000\u0000\u0000\u0134"+
		"\u0125\u0001\u0000\u0000\u0000\u0134\u0126\u0001\u0000\u0000\u0000\u0134"+
		"\u0127\u0001\u0000\u0000\u0000\u0134\u0128\u0001\u0000\u0000\u0000\u0134"+
		"\u0129\u0001\u0000\u0000\u0000\u0134\u012a\u0001\u0000\u0000\u0000\u0134"+
		"\u012b\u0001\u0000\u0000\u0000\u0134\u012c\u0001\u0000\u0000\u0000\u0135"+
		"\u0005\u0001\u0000\u0000\u0000\u0136\u0138\u0005\"\u0000\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0007"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0003\n\u0005\u0000\u013c\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\t\u0001\u0000"+
		"\u0000\u0000\u0140\u0147\u00034\u001a\u0000\u0141\u0147\u0003\f\u0006"+
		"\u0000\u0142\u0147\u0003\u0012\t\u0000\u0143\u0147\u0003\u0016\u000b\u0000"+
		"\u0144\u0147\u0003\u0018\f\u0000\u0145\u0147\u0003\u0094J\u0000\u0146"+
		"\u0140\u0001\u0000\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146"+
		"\u0142\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146"+
		"\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u000b\u0001\u0000\u0000\u0000\u0148\u014a\u0005~\u0000\u0000\u0149\u014b"+
		"\u0007\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0003\u000e\u0007\u0000\u014d\u014e\u0005\u00d7\u0000\u0000\u014e\r\u0001"+
		"\u0000\u0000\u0000\u014f\u0151\u0005\u00bd\u0000\u0000\u0150\u014f\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u015a\u0003\u0010\b\u0000\u0153\u0155\u0005\u00d5"+
		"\u0000\u0000\u0154\u0156\u0005\u00bd\u0000\u0000\u0155\u0154\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0159\u0003\u0010\b\u0000\u0158\u0153\u0001\u0000\u0000"+
		"\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u000f\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0003\u00be_\u0000"+
		"\u015e\u0011\u0001\u0000\u0000\u0000\u015f\u016e\u0005f\u0000\u0000\u0160"+
		"\u0162\u0003\u00be_\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0167"+
		"\u0005\u00d3\u0000\u0000\u0164\u0166\u0003\u0014\n\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016f\u0005"+
		"\u00d4\u0000\u0000\u016b\u016c\u0003\u00be_\u0000\u016c\u016d\u0005\u00d7"+
		"\u0000\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0161\u0001\u0000"+
		"\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0013\u0001\u0000"+
		"\u0000\u0000\u0170\u0176\u00034\u001a\u0000\u0171\u0176\u0003\f\u0006"+
		"\u0000\u0172\u0176\u0003\u0016\u000b\u0000\u0173\u0176\u0003\u0018\f\u0000"+
		"\u0174\u0176\u0003\u0094J\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175"+
		"\u0171\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0015\u0001\u0000\u0000\u0000\u0177\u0179\u0003*\u0015\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0005Q\u0000\u0000\u017b\u017d\u0005"+
		"\u00c1\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0003"+
		"\u00f8|\u0000\u017f\u0181\u0003\u001e\u000f\u0000\u0180\u017f\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005\u00cf\u0000\u0000\u0183\u0184\u0003n7\u0000"+
		"\u0184\u018a\u0005\u00d0\u0000\u0000\u0185\u0187\u0005\u00d6\u0000\u0000"+
		"\u0186\u0188\u0005\u00ce\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\u0003r9\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u00038\u001c\u0000\u018d\u0017\u0001\u0000\u0000\u0000\u018e\u0190\u0003"+
		"*\u0015\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000"+
		"\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0193\u0005m\u0000"+
		"\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0196\u0003\u00f6{\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0199\u0005k\u0000\u0000\u0198"+
		"\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u01b0\u0001\u0000\u0000\u0000\u019a\u019b\u0003\u001a\r\u0000\u019b\u019d"+
		"\u0003\u00f8|\u0000\u019c\u019e\u0003\u001e\u000f\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0005K\u0000\u0000\u01a0\u01a2\u0003\u00b4"+
		"Z\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005U\u0000\u0000"+
		"\u01a4\u01a6\u0003\u001c\u000e\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01b1\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005_\u0000\u0000\u01a8\u01aa\u0003\u00f8|\u0000\u01a9\u01ab"+
		"\u0003\u001e\u000f\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005K\u0000\u0000\u01ad\u01af\u0003\u001c\u000e\u0000\u01ae\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b0\u019a\u0001\u0000\u0000\u0000\u01b0\u01a7\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005"+
		"\u00d3\u0000\u0000\u01b3\u01b5\u0003|>\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u00d4\u0000"+
		"\u0000\u01ba\u0019\u0001\u0000\u0000\u0000\u01bb\u01bc\u0007\u0001\u0000"+
		"\u0000\u01bc\u001b\u0001\u0000\u0000\u0000\u01bd\u01c2\u0003\u00b4Z\u0000"+
		"\u01be\u01bf\u0005\u00d5\u0000\u0000\u01bf\u01c1\u0003\u00b4Z\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3"+
		"\u001d\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0005\u009d\u0000\u0000\u01c6\u01c7\u0003 \u0010\u0000\u01c7\u01c8"+
		"\u0005\u009e\u0000\u0000\u01c8\u01d4\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0005\u009d\u0000\u0000\u01ca\u01cb\u0003\"\u0011\u0000\u01cb\u01cc\u0005"+
		"\u009e\u0000\u0000\u01cc\u01d4\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005"+
		"\u009d\u0000\u0000\u01ce\u01cf\u0003 \u0010\u0000\u01cf\u01d0\u0005\u00d5"+
		"\u0000\u0000\u01d0\u01d1\u0003\"\u0011\u0000\u01d1\u01d2\u0005\u009e\u0000"+
		"\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01c5\u0001\u0000\u0000"+
		"\u0000\u01d3\u01c9\u0001\u0000\u0000\u0000\u01d3\u01cd\u0001\u0000\u0000"+
		"\u0000\u01d4\u001f\u0001\u0000\u0000\u0000\u01d5\u01da\u0003$\u0012\u0000"+
		"\u01d6\u01d7\u0005\u00d5\u0000\u0000\u01d7\u01d9\u0003$\u0012\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		"!\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e2"+
		"\u0003&\u0013\u0000\u01de\u01df\u0005\u00d5\u0000\u0000\u01df\u01e1\u0003"+
		"&\u0013\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3#\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e7\u0003*\u0015\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0003\u00f8|\u0000\u01e9%\u0001\u0000\u0000\u0000\u01ea\u01ec"+
		"\u0003*\u0015\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003"+
		"\u00f8|\u0000\u01ee\u01f1\u0005\u00d8\u0000\u0000\u01ef\u01f2\u0003\u00b4"+
		"Z\u0000\u01f0\u01f2\u0003\u0100\u0080\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\'\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0005\u009d\u0000\u0000\u01f4\u01f9\u0003\u00b6[\u0000\u01f5"+
		"\u01f6\u0005\u00d5\u0000\u0000\u01f6\u01f8\u0003\u00b6[\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0005\u009e\u0000\u0000\u01fd)\u0001\u0000\u0000\u0000\u01fe\u0200\u0003"+
		",\u0016\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202+\u0001\u0000\u0000\u0000\u0203\u0207\u0005+\u0000\u0000"+
		"\u0204\u0205\u0003\u00f8|\u0000\u0205\u0206\u0005\u00d6\u0000\u0000\u0206"+
		"\u0208\u0001\u0000\u0000\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020e\u0003.\u0017\u0000\u020a\u020b\u0005\u00d5\u0000\u0000\u020b\u020d"+
		"\u0003.\u0017\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0210\u0001"+
		"\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210\u020e\u0001"+
		"\u0000\u0000\u0000\u0211\u0212\u0005\u00d2\u0000\u0000\u0212-\u0001\u0000"+
		"\u0000\u0000\u0213\u0215\u0003\u00bc^\u0000\u0214\u0216\u0003\u00c4b\u0000"+
		"\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216/\u0001\u0000\u0000\u0000\u0217\u0219\u00032\u0019\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b1\u0001"+
		"\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u0221\u0003"+
		"4\u001a\u0000\u021e\u0221\u0003\u0016\u000b\u0000\u021f\u0221\u0003\u0018"+
		"\f\u0000\u0220\u021d\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000"+
		"\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u02213\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0003\u00f8|\u0000\u0223\u0224\u0005\u00d6\u0000\u0000\u0224"+
		"\u023e\u0001\u0000\u0000\u0000\u0225\u023e\u00038\u001c\u0000\u0226\u023e"+
		"\u0003:\u001d\u0000\u0227\u023e\u0003D\"\u0000\u0228\u023e\u0003F#\u0000"+
		"\u0229\u023e\u0003H$\u0000\u022a\u023e\u0003N\'\u0000\u022b\u023e\u0003"+
		"R)\u0000\u022c\u023e\u0003T*\u0000\u022d\u023e\u0003V+\u0000\u022e\u022f"+
		"\u0003\u00aaU\u0000\u022f\u0230\u0005\u00d7\u0000\u0000\u0230\u023e\u0001"+
		"\u0000\u0000\u0000\u0231\u023e\u0003t:\u0000\u0232\u023e\u0003z=\u0000"+
		"\u0233\u023e\u0003x<\u0000\u0234\u023e\u0003X,\u0000\u0235\u023e\u0003"+
		"Z-\u0000\u0236\u023e\u0003\\.\u0000\u0237\u023e\u0003^/\u0000\u0238\u023e"+
		"\u0003d2\u0000\u0239\u023e\u0003f3\u0000\u023a\u023e\u0003h4\u0000\u023b"+
		"\u023e\u00036\u001b\u0000\u023c\u023e\u0003j5\u0000\u023d\u0222\u0001"+
		"\u0000\u0000\u0000\u023d\u0225\u0001\u0000\u0000\u0000\u023d\u0226\u0001"+
		"\u0000\u0000\u0000\u023d\u0227\u0001\u0000\u0000\u0000\u023d\u0228\u0001"+
		"\u0000\u0000\u0000\u023d\u0229\u0001\u0000\u0000\u0000\u023d\u022a\u0001"+
		"\u0000\u0000\u0000\u023d\u022b\u0001\u0000\u0000\u0000\u023d\u022c\u0001"+
		"\u0000\u0000\u0000\u023d\u022d\u0001\u0000\u0000\u0000\u023d\u022e\u0001"+
		"\u0000\u0000\u0000\u023d\u0231\u0001\u0000\u0000\u0000\u023d\u0232\u0001"+
		"\u0000\u0000\u0000\u023d\u0233\u0001\u0000\u0000\u0000\u023d\u0234\u0001"+
		"\u0000\u0000\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u0236\u0001"+
		"\u0000\u0000\u0000\u023d\u0237\u0001\u0000\u0000\u0000\u023d\u0238\u0001"+
		"\u0000\u0000\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d\u023a\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023c\u0001"+
		"\u0000\u0000\u0000\u023e5\u0001\u0000\u0000\u0000\u023f\u0240\u0005\u00d7"+
		"\u0000\u0000\u02407\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u00d3\u0000"+
		"\u0000\u0242\u0243\u00030\u0018\u0000\u0243\u0244\u0005\u00d4\u0000\u0000"+
		"\u02449\u0001\u0000\u0000\u0000\u0245\u0246\u0005T\u0000\u0000\u0246\u0247"+
		"\u0003\u0098L\u0000\u0247\u024b\u00034\u001a\u0000\u0248\u024a\u0003<"+
		"\u001e\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0003@ \u0000\u024f\u024e\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0262\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0005T\u0000\u0000\u0252\u0253\u0003\u0098L\u0000\u0253\u0254"+
		"\u0005\u00d6\u0000\u0000\u0254\u0258\u00030\u0018\u0000\u0255\u0257\u0003"+
		">\u001f\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000"+
		"\u0000\u0000\u025b\u025d\u0003B!\u0000\u025c\u025b\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0005F\u0000\u0000\u025f\u0260\u0005\u00d7\u0000\u0000\u0260"+
		"\u0262\u0001\u0000\u0000\u0000\u0261\u0245\u0001\u0000\u0000\u0000\u0261"+
		"\u0251\u0001\u0000\u0000\u0000\u0262;\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0005A\u0000\u0000\u0264\u0265\u0003\u0098L\u0000\u0265\u0266\u00034"+
		"\u001a\u0000\u0266=\u0001\u0000\u0000\u0000\u0267\u0268\u0005A\u0000\u0000"+
		"\u0268\u0269\u0003\u0098L\u0000\u0269\u026a\u0005\u00d6\u0000\u0000\u026a"+
		"\u026b\u00030\u0018\u0000\u026b?\u0001\u0000\u0000\u0000\u026c\u026d\u0005"+
		"@\u0000\u0000\u026d\u026e\u00034\u001a\u0000\u026eA\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0005@\u0000\u0000\u0270\u0271\u0005\u00d6\u0000\u0000"+
		"\u0271\u0272\u00030\u0018\u0000\u0272C\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0005\u0080\u0000\u0000\u0274\u027b\u0003\u0098L\u0000\u0275\u027c\u0003"+
		"4\u001a\u0000\u0276\u0277\u0005\u00d6\u0000\u0000\u0277\u0278\u00030\u0018"+
		"\u0000\u0278\u0279\u0005H\u0000\u0000\u0279\u027a\u0005\u00d7\u0000\u0000"+
		"\u027a\u027c\u0001\u0000\u0000\u0000\u027b\u0275\u0001\u0000\u0000\u0000"+
		"\u027b\u0276\u0001\u0000\u0000\u0000\u027cE\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0005<\u0000\u0000\u027e\u027f\u00034\u001a\u0000\u027f\u0280\u0005"+
		"\u0080\u0000\u0000\u0280\u0281\u0003\u0098L\u0000\u0281\u0282\u0005\u00d7"+
		"\u0000\u0000\u0282G\u0001\u0000\u0000\u0000\u0283\u0284\u0005O\u0000\u0000"+
		"\u0284\u0286\u0005\u00cf\u0000\u0000\u0285\u0287\u0003J%\u0000\u0286\u0285"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u028a\u0005\u00d7\u0000\u0000\u0289\u028b"+
		"\u0003\u0096K\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001"+
		"\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0005"+
		"\u00d7\u0000\u0000\u028d\u028f\u0003L&\u0000\u028e\u028d\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0297\u0005\u00d0\u0000\u0000\u0291\u0298\u00034\u001a\u0000"+
		"\u0292\u0293\u0005\u00d6\u0000\u0000\u0293\u0294\u00030\u0018\u0000\u0294"+
		"\u0295\u0005D\u0000\u0000\u0295\u0296\u0005\u00d7\u0000\u0000\u0296\u0298"+
		"\u0001\u0000\u0000\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0297\u0292"+
		"\u0001\u0000\u0000\u0000\u0298I\u0001\u0000\u0000\u0000\u0299\u029a\u0003"+
		"\u0096K\u0000\u029aK\u0001\u0000\u0000\u0000\u029b\u029c\u0003\u0096K"+
		"\u0000\u029cM\u0001\u0000\u0000\u0000\u029d\u029e\u0005v\u0000\u0000\u029e"+
		"\u02b6\u0003\u0098L\u0000\u029f\u02a1\u0005\u00d3\u0000\u0000\u02a0\u02a2"+
		"\u0005\u00d7\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a6\u0001\u0000\u0000\u0000\u02a3\u02a5"+
		"\u0003P(\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a9\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a9\u02b7\u0005\u00d4\u0000\u0000\u02aa\u02ac\u0005\u00d6"+
		"\u0000\u0000\u02ab\u02ad\u0005\u00d7\u0000\u0000\u02ac\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02b1\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b0\u0003P(\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b3\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005G\u0000\u0000\u02b5"+
		"\u02b7\u0005\u00d7\u0000\u0000\u02b6\u029f\u0001\u0000\u0000\u0000\u02b6"+
		"\u02aa\u0001\u0000\u0000\u0000\u02b7O\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u00054\u0000\u0000\u02b9\u02bc\u0003\u009aM\u0000\u02ba\u02bc\u0005;"+
		"\u0000\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02bf\u0007\u0002"+
		"\u0000\u0000\u02be\u02bb\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u00030\u0018"+
		"\u0000\u02c3Q\u0001\u0000\u0000\u0000\u02c4\u02c6\u00052\u0000\u0000\u02c5"+
		"\u02c7\u0003\u009aM\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9"+
		"\u0005\u00d7\u0000\u0000\u02c9S\u0001\u0000\u0000\u0000\u02ca\u02cc\u0005"+
		"9\u0000\u0000\u02cb\u02cd\u0003\u009aM\u0000\u02cc\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0005\u00d7\u0000\u0000\u02cfU\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d2\u0005s\u0000\u0000\u02d1\u02d3\u0003\u009aM\u0000\u02d2\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005\u00d7\u0000\u0000\u02d5W\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d7\u0003\u009aM\u0000\u02d7\u02d8\u0005\u00d7"+
		"\u0000\u0000\u02d8Y\u0001\u0000\u0000\u0000\u02d9\u02da\u0005}\u0000\u0000"+
		"\u02da\u02db\u0005\u00cf\u0000\u0000\u02db\u02dc\u0003\u00dam\u0000\u02dc"+
		"\u02dd\u0005\u00d0\u0000\u0000\u02dd\u02de\u0005\u00d7\u0000\u0000\u02de"+
		"[\u0001\u0000\u0000\u0000\u02df\u0306\u0005P\u0000\u0000\u02e0\u02e1\u0005"+
		"\u00cf\u0000\u0000\u02e1\u02e2\u0003\u00dcn\u0000\u02e2\u02e4\u0005.\u0000"+
		"\u0000\u02e3\u02e5\u0005\u00c1\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e6\u02ec\u0003\u009cN\u0000\u02e7\u02e9\u0005\u009f\u0000\u0000"+
		"\u02e8\u02ea\u0005\u00c1\u0000\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ed\u0003\u00dcn\u0000\u02ec\u02e7\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0005\u00d0\u0000\u0000\u02ef\u0307\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f1\u0005\u00cf\u0000\u0000\u02f1\u02f2\u0003\u009aM\u0000\u02f2\u02f3"+
		"\u0005.\u0000\u0000\u02f3\u02f9\u0003\u009cN\u0000\u02f4\u02f6\u0005\u009f"+
		"\u0000\u0000\u02f5\u02f7\u0005\u00c1\u0000\u0000\u02f6\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f8\u02fa\u0003\u00dcn\u0000\u02f9\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0005\u00d0\u0000\u0000\u02fc\u0307\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0005\u00cf\u0000\u0000\u02fe\u02ff\u0003\u00dcn\u0000"+
		"\u02ff\u0300\u0005.\u0000\u0000\u0300\u0301\u0005a\u0000\u0000\u0301\u0302"+
		"\u0005\u00cf\u0000\u0000\u0302\u0303\u0003\u00f2y\u0000\u0303\u0304\u0005"+
		"\u00d0\u0000\u0000\u0304\u0305\u0005\u00d0\u0000\u0000\u0305\u0307\u0001"+
		"\u0000\u0000\u0000\u0306\u02e0\u0001\u0000\u0000\u0000\u0306\u02f0\u0001"+
		"\u0000\u0000\u0000\u0306\u02fd\u0001\u0000\u0000\u0000\u0307\u030e\u0001"+
		"\u0000\u0000\u0000\u0308\u030f\u00034\u001a\u0000\u0309\u030a\u0005\u00d6"+
		"\u0000\u0000\u030a\u030b\u00030\u0018\u0000\u030b\u030c\u0005E\u0000\u0000"+
		"\u030c\u030d\u0005\u00d7\u0000\u0000\u030d\u030f\u0001\u0000\u0000\u0000"+
		"\u030e\u0308\u0001\u0000\u0000\u0000\u030e\u0309\u0001\u0000\u0000\u0000"+
		"\u030f]\u0001\u0000\u0000\u0000\u0310\u0311\u0005y\u0000\u0000\u0311\u0321"+
		"\u00038\u001c\u0000\u0312\u0314\u0003`0\u0000\u0313\u0312\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0318\u0001\u0000"+
		"\u0000\u0000\u0317\u0319\u0003b1\u0000\u0318\u0317\u0001\u0000\u0000\u0000"+
		"\u0318\u0319\u0001\u0000\u0000\u0000\u0319\u0322\u0001\u0000\u0000\u0000"+
		"\u031a\u031c\u0003`0\u0000\u031b\u031a\u0001\u0000\u0000\u0000\u031c\u031f"+
		"\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000\u0000\u0000\u031f\u031d"+
		"\u0001\u0000\u0000\u0000\u0320\u0322\u0003b1\u0000\u0321\u0313\u0001\u0000"+
		"\u0000\u0000\u0321\u031d\u0001\u0000\u0000\u0000\u0322_\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u00055\u0000\u0000\u0324\u0325\u0005\u00cf\u0000\u0000"+
		"\u0325\u032a\u0003\u00b4Z\u0000\u0326\u0327\u0005\u00c2\u0000\u0000\u0327"+
		"\u0329\u0003\u00b4Z\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0329\u032c"+
		"\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0001\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u032a"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\u0005\u00db\u0000\u0000\u032e\u032f"+
		"\u0005\u00d0\u0000\u0000\u032f\u0330\u00038\u001c\u0000\u0330a\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0005M\u0000\u0000\u0332\u0333\u00038\u001c\u0000"+
		"\u0333c\u0001\u0000\u0000\u0000\u0334\u0335\u0005w\u0000\u0000\u0335\u0336"+
		"\u0003\u009aM\u0000\u0336\u0337\u0005\u00d7\u0000\u0000\u0337e\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0005S\u0000\u0000\u0339\u033a\u0003\u00f8|\u0000"+
		"\u033a\u033b\u0005\u00d7\u0000\u0000\u033bg\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0005:\u0000\u0000\u033d\u033e\u0005\u00cf\u0000\u0000\u033e\u033f"+
		"\u0003l6\u0000\u033f\u0346\u0005\u00d0\u0000\u0000\u0340\u0347\u00034"+
		"\u001a\u0000\u0341\u0342\u0005\u00d6\u0000\u0000\u0342\u0343\u00030\u0018"+
		"\u0000\u0343\u0344\u0005C\u0000\u0000\u0344\u0345\u0005\u00d7\u0000\u0000"+
		"\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0340\u0001\u0000\u0000\u0000"+
		"\u0346\u0341\u0001\u0000\u0000\u0000\u0347i\u0001\u0000\u0000\u0000\u0348"+
		"\u034a\u0003\u0002\u0001\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u034b\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b"+
		"\u034c\u0001\u0000\u0000\u0000\u034ck\u0001\u0000\u0000\u0000\u034d\u0352"+
		"\u0003\u0092I\u0000\u034e\u034f\u0005\u00d5\u0000\u0000\u034f\u0351\u0003"+
		"\u0092I\u0000\u0350\u034e\u0001\u0000\u0000\u0000\u0351\u0354\u0001\u0000"+
		"\u0000\u0000\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000"+
		"\u0000\u0000\u0353m\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000"+
		"\u0000\u0355\u0357\u0003p8\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356"+
		"\u0357\u0001\u0000\u0000\u0000\u0357\u035c\u0001\u0000\u0000\u0000\u0358"+
		"\u0359\u0005\u00d5\u0000\u0000\u0359\u035b\u0003p8\u0000\u035a\u0358\u0001"+
		"\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0360\u0001"+
		"\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0361\u0005"+
		"\u00d5\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361\u0001"+
		"\u0000\u0000\u0000\u0361o\u0001\u0000\u0000\u0000\u0362\u0364\u0003*\u0015"+
		"\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365\u0367\u0003\u00fa}\u0000"+
		"\u0366\u0365\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000"+
		"\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u036a\u0005\u00ce\u0000\u0000"+
		"\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000"+
		"\u036a\u036c\u0001\u0000\u0000\u0000\u036b\u036d\u0003r9\u0000\u036c\u036b"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f"+
		"\u0001\u0000\u0000\u0000\u036e\u0370\u0005\u00c1\u0000\u0000\u036f\u036e"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0372"+
		"\u0001\u0000\u0000\u0000\u0371\u0373\u0005\u00be\u0000\u0000\u0372\u0371"+
		"\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0374"+
		"\u0001\u0000\u0000\u0000\u0374\u0375\u0003\u0090H\u0000\u0375q\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u00069\uffff\uffff\u0000\u0377\u037b\u0003\u00b4"+
		"Z\u0000\u0378\u037b\u00053\u0000\u0000\u0379\u037b\u0003\u0100\u0080\u0000"+
		"\u037a\u0376\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000"+
		"\u037a\u0379\u0001\u0000\u0000\u0000\u037b\u0381\u0001\u0000\u0000\u0000"+
		"\u037c\u037d\n\u0001\u0000\u0000\u037d\u037e\u0005\u00c2\u0000\u0000\u037e"+
		"\u0380\u0003r9\u0002\u037f\u037c\u0001\u0000\u0000\u0000\u0380\u0383\u0001"+
		"\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0381\u0382\u0001"+
		"\u0000\u0000\u0000\u0382s\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u0005R\u0000\u0000\u0385\u038a\u0003v;\u0000"+
		"\u0386\u0387\u0005\u00d5\u0000\u0000\u0387\u0389\u0003v;\u0000\u0388\u0386"+
		"\u0001\u0000\u0000\u0000\u0389\u038c\u0001\u0000\u0000\u0000\u038a\u0388"+
		"\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038d"+
		"\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0005\u00d7\u0000\u0000\u038eu\u0001\u0000\u0000\u0000\u038f\u0398\u0005"+
		"\u00db\u0000\u0000\u0390\u0391\u0005\u00cc\u0000\u0000\u0391\u0398\u0003"+
		"\u00dcn\u0000\u0392\u0393\u0005\u00cc\u0000\u0000\u0393\u0394\u0005\u00d3"+
		"\u0000\u0000\u0394\u0395\u0003\u009aM\u0000\u0395\u0396\u0005\u00d4\u0000"+
		"\u0000\u0396\u0398\u0001\u0000\u0000\u0000\u0397\u038f\u0001\u0000\u0000"+
		"\u0000\u0397\u0390\u0001\u0000\u0000\u0000\u0397\u0392\u0001\u0000\u0000"+
		"\u0000\u0398w\u0001\u0000\u0000\u0000\u0399\u039a\u0005?\u0000\u0000\u039a"+
		"\u039b\u0003\u0096K\u0000\u039b\u039c\u0005\u00d7\u0000\u0000\u039cy\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0005t\u0000\u0000\u039e\u03a3\u0003\u0090"+
		"H\u0000\u039f\u03a0\u0005\u00d5\u0000\u0000\u03a0\u03a2\u0003\u0090H\u0000"+
		"\u03a1\u039f\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a7\u0005\u00d7\u0000\u0000\u03a7{\u0001\u0000\u0000\u0000\u03a8"+
		"\u03aa\u0003*\u0015\u0000\u03a9\u03a8\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0001\u0000\u0000\u0000\u03aa\u03dc\u0001\u0000\u0000\u0000\u03ab\u03ad"+
		"\u0003\u008cF\u0000\u03ac\u03ae\u0003r9\u0000\u03ad\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000"+
		"\u0000\u0000\u03af\u03b4\u0003\u0090H\u0000\u03b0\u03b1\u0005\u00d5\u0000"+
		"\u0000\u03b1\u03b3\u0003\u0090H\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b3\u03b6\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5\u03b7\u0001\u0000\u0000\u0000"+
		"\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005\u00d7\u0000\u0000"+
		"\u03b8\u03dd\u0001\u0000\u0000\u0000\u03b9\u03bb\u0003\u008eG\u0000\u03ba"+
		"\u03b9\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb"+
		"\u03da\u0001\u0000\u0000\u0000\u03bc\u03be\u00058\u0000\u0000\u03bd\u03bf"+
		"\u0003r9\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c5\u0003\u0092"+
		"I\u0000\u03c1\u03c2\u0005\u00d5\u0000\u0000\u03c2\u03c4\u0003\u0092I\u0000"+
		"\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c4\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c8\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0005\u00d7\u0000\u0000\u03c9\u03db\u0001\u0000\u0000\u0000"+
		"\u03ca\u03cc\u0005Q\u0000\u0000\u03cb\u03cd\u0005\u00c1\u0000\u0000\u03cc"+
		"\u03cb\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd"+
		"\u03ce\u0001\u0000\u0000\u0000\u03ce\u03d0\u0003\u00f8|\u0000\u03cf\u03d1"+
		"\u0003\u001e\u000f\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d3"+
		"\u0005\u00cf\u0000\u0000\u03d3\u03d4\u0003n7\u0000\u03d4\u03d6\u0005\u00d0"+
		"\u0000\u0000\u03d5\u03d7\u0003\u0088D\u0000\u03d6\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000"+
		"\u0000\u03d8\u03d9\u0003\u008aE\u0000\u03d9\u03db\u0001\u0000\u0000\u0000"+
		"\u03da\u03bc\u0001\u0000\u0000\u0000\u03da\u03ca\u0001\u0000\u0000\u0000"+
		"\u03db\u03dd\u0001\u0000\u0000\u0000\u03dc\u03ab\u0001\u0000\u0000\u0000"+
		"\u03dc\u03ba\u0001\u0000\u0000\u0000\u03dd\u03e3\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0005~\u0000\u0000\u03df\u03e0\u0003\u00c2a\u0000\u03e0\u03e1"+
		"\u0003~?\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03a9\u0001\u0000"+
		"\u0000\u0000\u03e2\u03de\u0001\u0000\u0000\u0000\u03e3}\u0001\u0000\u0000"+
		"\u0000\u03e4\u03ee\u0005\u00d7\u0000\u0000\u03e5\u03e9\u0005\u00d3\u0000"+
		"\u0000\u03e6\u03e8\u0003\u0080@\u0000\u03e7\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e8\u03eb\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e9\u03ea\u0001\u0000\u0000\u0000\u03ea\u03ec\u0001\u0000\u0000\u0000"+
		"\u03eb\u03e9\u0001\u0000\u0000\u0000\u03ec\u03ee\u0005\u00d4\u0000\u0000"+
		"\u03ed\u03e4\u0001\u0000\u0000\u0000\u03ed\u03e5\u0001\u0000\u0000\u0000"+
		"\u03ee\u007f\u0001\u0000\u0000\u0000\u03ef\u03f2\u0003\u0082A\u0000\u03f0"+
		"\u03f2\u0003\u0084B\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f0"+
		"\u0001\u0000\u0000\u0000\u03f2\u0081\u0001\u0000\u0000\u0000\u03f3\u03f4"+
		"\u0003\u00bc^\u0000\u03f4\u03f5\u0005\u00bb\u0000\u0000\u03f5\u03f6\u0003"+
		"\u00f8|\u0000\u03f6\u03f7\u0005Z\u0000\u0000\u03f7\u03f8\u0003\u00c2a"+
		"\u0000\u03f8\u03f9\u0005\u00d7\u0000\u0000\u03f9\u0083\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fb\u0003\u0086C\u0000\u03fb\u0401\u0005.\u0000\u0000\u03fc"+
		"\u0402\u0003\u00fa}\u0000\u03fd\u03ff\u0003\u00fa}\u0000\u03fe\u03fd\u0001"+
		"\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0001"+
		"\u0000\u0000\u0000\u0400\u0402\u0003\u00f8|\u0000\u0401\u03fc\u0001\u0000"+
		"\u0000\u0000\u0401\u03fe\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000"+
		"\u0000\u0000\u0403\u0404\u0005\u00d7\u0000\u0000\u0404\u0085\u0001\u0000"+
		"\u0000\u0000\u0405\u0406\u0003\u00bc^\u0000\u0406\u0407\u0005\u00bb\u0000"+
		"\u0000\u0407\u0409\u0001\u0000\u0000\u0000\u0408\u0405\u0001\u0000\u0000"+
		"\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000"+
		"\u0000\u040a\u040b\u0003\u00f8|\u0000\u040b\u0087\u0001\u0000\u0000\u0000"+
		"\u040c\u040d\u0005\u00d6\u0000\u0000\u040d\u040f\u0003r9\u0000\u040e\u0410"+
		"\u0003\u00c4b\u0000\u040f\u040e\u0001\u0000\u0000\u0000\u040f\u0410\u0001"+
		"\u0000\u0000\u0000\u0410\u0089\u0001\u0000\u0000\u0000\u0411\u0414\u0005"+
		"\u00d7\u0000\u0000\u0412\u0414\u00038\u001c\u0000\u0413\u0411\u0001\u0000"+
		"\u0000\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u008b\u0001\u0000"+
		"\u0000\u0000\u0415\u0418\u0003\u008eG\u0000\u0416\u0418\u0005\u007f\u0000"+
		"\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417\u0416\u0001\u0000\u0000"+
		"\u0000\u0418\u008d\u0001\u0000\u0000\u0000\u0419\u041b\u0003\u00fa}\u0000"+
		"\u041a\u0419\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000"+
		"\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000"+
		"\u041d\u008f\u0001\u0000\u0000\u0000\u041e\u0421\u0005\u00db\u0000\u0000"+
		"\u041f\u0420\u0005\u00d8\u0000\u0000\u0420\u0422\u0003\u00cae\u0000\u0421"+
		"\u041f\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422"+
		"\u0091\u0001\u0000\u0000\u0000\u0423\u0424\u0003\u00f8|\u0000\u0424\u0425"+
		"\u0005\u00d8\u0000\u0000\u0425\u0426\u0003\u00cae\u0000\u0426\u0093\u0001"+
		"\u0000\u0000\u0000\u0427\u0429\u0003*\u0015\u0000\u0428\u0427\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000"+
		"\u0000\u0000\u042a\u042b\u00058\u0000\u0000\u042b\u0430\u0003\u0092I\u0000"+
		"\u042c\u042d\u0005\u00d5\u0000\u0000\u042d\u042f\u0003\u0092I\u0000\u042e"+
		"\u042c\u0001\u0000\u0000\u0000\u042f\u0432\u0001\u0000\u0000\u0000\u0430"+
		"\u042e\u0001\u0000\u0000\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431"+
		"\u0433\u0001\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0433"+
		"\u0434\u0005\u00d7\u0000\u0000\u0434\u0095\u0001\u0000\u0000\u0000\u0435"+
		"\u043a\u0003\u009aM\u0000\u0436\u0437\u0005\u00d5\u0000\u0000\u0437\u0439"+
		"\u0003\u009aM\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0439\u043c\u0001"+
		"\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001"+
		"\u0000\u0000\u0000\u043b\u0097\u0001\u0000\u0000\u0000\u043c\u043a\u0001"+
		"\u0000\u0000\u0000\u043d\u0440\u0005\u00cf\u0000\u0000\u043e\u0441\u0003"+
		"\u009aM\u0000\u043f\u0441\u0003\u00aaU\u0000\u0440\u043e\u0001\u0000\u0000"+
		"\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"+
		"\u0000\u0442\u0443\u0005\u00d0\u0000\u0000\u0443\u0099\u0001\u0000\u0000"+
		"\u0000\u0444\u0445\u0006M\uffff\uffff\u0000\u0445\u0446\u00057\u0000\u0000"+
		"\u0446\u049b\u0003\u009aM/\u0447\u049b\u0003\u00a6S\u0000\u0448\u0449"+
		"\u0003\u00d4j\u0000\u0449\u044a\u0005\u00d1\u0000\u0000\u044a\u044b\u0003"+
		"\u009aM\u0000\u044b\u044c\u0005\u00d2\u0000\u0000\u044c\u049b\u0001\u0000"+
		"\u0000\u0000\u044d\u044e\u0005\u00cf\u0000\u0000\u044e\u044f\u0003\u0102"+
		"\u0081\u0000\u044f\u0450\u0005\u00d0\u0000\u0000\u0450\u0451\u0003\u009a"+
		"M,\u0451\u049b\u0001\u0000\u0000\u0000\u0452\u0453\u0007\u0003\u0000\u0000"+
		"\u0453\u049b\u0003\u009aM+\u0454\u0455\u0007\u0004\u0000\u0000\u0455\u049b"+
		"\u0003\u009aM*\u0456\u0457\u0007\u0005\u0000\u0000\u0457\u049b\u0003\u00dc"+
		"n\u0000\u0458\u0459\u0003\u00dcn\u0000\u0459\u045a\u0007\u0005\u0000\u0000"+
		"\u045a\u049b\u0001\u0000\u0000\u0000\u045b\u045c\u0005l\u0000\u0000\u045c"+
		"\u049b\u0003\u009aM\'\u045d\u049b\u0003\u00dcn\u0000\u045e\u049b\u0003"+
		"\u00ccf\u0000\u045f\u049b\u0003\u00d6k\u0000\u0460\u049b\u0005\u00dc\u0000"+
		"\u0000\u0461\u049b\u0005\u00e2\u0000\u0000\u0462\u049b\u0003\u0098L\u0000"+
		"\u0463\u049b\u0003\u009eO\u0000\u0464\u049b\u0005\u0081\u0000\u0000\u0465"+
		"\u0466\u0005a\u0000\u0000\u0466\u0467\u0005\u00cf\u0000\u0000\u0467\u0468"+
		"\u0003\u00f2y\u0000\u0468\u0469\u0005\u00d0\u0000\u0000\u0469\u046a\u0005"+
		"\u00d8\u0000\u0000\u046a\u046b\u0003\u009aM\u001e\u046b\u049b\u0001\u0000"+
		"\u0000\u0000\u046c\u046d\u0005`\u0000\u0000\u046d\u046e\u0005\u00cf\u0000"+
		"\u0000\u046e\u046f\u0003\u00dam\u0000\u046f\u0470\u0005\u00d0\u0000\u0000"+
		"\u0470\u049b\u0001\u0000\u0000\u0000\u0471\u0472\u0005B\u0000\u0000\u0472"+
		"\u0473\u0005\u00cf\u0000\u0000\u0473\u0474\u0003\u00dcn\u0000\u0474\u0475"+
		"\u0005\u00d0\u0000\u0000\u0475\u049b\u0001\u0000\u0000\u0000\u0476\u0477"+
		"\u0005I\u0000\u0000\u0477\u0478\u0005\u00cf\u0000\u0000\u0478\u0479\u0003"+
		"\u009aM\u0000\u0479\u047a\u0005\u00d0\u0000\u0000\u047a\u049b\u0001\u0000"+
		"\u0000\u0000\u047b\u047f\u0005J\u0000\u0000\u047c\u047d\u0005\u00cf\u0000"+
		"\u0000\u047d\u0480\u0005\u00d0\u0000\u0000\u047e\u0480\u0003\u0098L\u0000"+
		"\u047f\u047c\u0001\u0000\u0000\u0000\u047f\u047e\u0001\u0000\u0000\u0000"+
		"\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u049b\u0001\u0000\u0000\u0000"+
		"\u0481\u0482\u0007\u0006\u0000\u0000\u0482\u049b\u0003\u009aM\u0019\u0483"+
		"\u0484\u0007\u0007\u0000\u0000\u0484\u049b\u0003\u009aM\u0018\u0485\u049b"+
		"\u0003\u00a0P\u0000\u0486\u049b\u0003\u00a2Q\u0000\u0487\u0488\u0005w"+
		"\u0000\u0000\u0488\u049b\u0003\u009aM\u0006\u0489\u048a\u0003\u009cN\u0000"+
		"\u048a\u048c\u0003\u00a8T\u0000\u048b\u048d\u0003*\u0015\u0000\u048c\u048b"+
		"\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d\u048e"+
		"\u0001\u0000\u0000\u0000\u048e\u048f\u0003\u009aM\u0005\u048f\u049b\u0001"+
		"\u0000\u0000\u0000\u0490\u0491\u0003\u009cN\u0000\u0491\u0493\u0005\u00d8"+
		"\u0000\u0000\u0492\u0494\u0003*\u0015\u0000\u0493\u0492\u0001\u0000\u0000"+
		"\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000"+
		"\u0000\u0495\u0498\u0005\u00c1\u0000\u0000\u0496\u0499\u0003\u00dcn\u0000"+
		"\u0497\u0499\u0003\u00a6S\u0000\u0498\u0496\u0001\u0000\u0000\u0000\u0498"+
		"\u0497\u0001\u0000\u0000\u0000\u0499\u049b\u0001\u0000\u0000\u0000\u049a"+
		"\u0444\u0001\u0000\u0000\u0000\u049a\u0447\u0001\u0000\u0000\u0000\u049a"+
		"\u0448\u0001\u0000\u0000\u0000\u049a\u044d\u0001\u0000\u0000\u0000\u049a"+
		"\u0452\u0001\u0000\u0000\u0000\u049a\u0454\u0001\u0000\u0000\u0000\u049a"+
		"\u0456\u0001\u0000\u0000\u0000\u049a\u0458\u0001\u0000\u0000\u0000\u049a"+
		"\u045b\u0001\u0000\u0000\u0000\u049a\u045d\u0001\u0000\u0000\u0000\u049a"+
		"\u045e\u0001\u0000\u0000\u0000\u049a\u045f\u0001\u0000\u0000\u0000\u049a"+
		"\u0460\u0001\u0000\u0000\u0000\u049a\u0461\u0001\u0000\u0000\u0000\u049a"+
		"\u0462\u0001\u0000\u0000\u0000\u049a\u0463\u0001\u0000\u0000\u0000\u049a"+
		"\u0464\u0001\u0000\u0000\u0000\u049a\u0465\u0001\u0000\u0000\u0000\u049a"+
		"\u046c\u0001\u0000\u0000\u0000\u049a\u0471\u0001\u0000\u0000\u0000\u049a"+
		"\u0476\u0001\u0000\u0000\u0000\u049a\u047b\u0001\u0000\u0000\u0000\u049a"+
		"\u0481\u0001\u0000\u0000\u0000\u049a\u0483\u0001\u0000\u0000\u0000\u049a"+
		"\u0485\u0001\u0000\u0000\u0000\u049a\u0486\u0001\u0000\u0000\u0000\u049a"+
		"\u0487\u0001\u0000\u0000\u0000\u049a\u0489\u0001\u0000\u0000\u0000\u049a"+
		"\u0490\u0001\u0000\u0000\u0000\u049b\u04d8\u0001\u0000\u0000\u0000\u049c"+
		"\u049d\n\u0015\u0000\u0000\u049d\u049e\u0005\u00ab\u0000\u0000\u049e\u04d7"+
		"\u0003\u009aM\u0015\u049f\u04a0\n\u0013\u0000\u0000\u04a0\u04a1\u0007"+
		"\b\u0000\u0000\u04a1\u04d7\u0003\u009aM\u0014\u04a2\u04a3\n\u0012\u0000"+
		"\u0000\u04a3\u04a4\u0007\t\u0000\u0000\u04a4\u04d7\u0003\u009aM\u0013"+
		"\u04a5\u04a6\n\u0011\u0000\u0000\u04a6\u04a7\u0007\n\u0000\u0000\u04a7"+
		"\u04d7\u0003\u009aM\u0012\u04a8\u04a9\n\u0010\u0000\u0000\u04a9\u04aa"+
		"\u0007\u000b\u0000\u0000\u04aa\u04d7\u0003\u009aM\u0011\u04ab\u04ac\n"+
		"\u000f\u0000\u0000\u04ac\u04ad\u0007\f\u0000\u0000\u04ad\u04d7\u0003\u009a"+
		"M\u0010\u04ae\u04af\n\u000e\u0000\u0000\u04af\u04b0\u0005\u00c1\u0000"+
		"\u0000\u04b0\u04d7\u0003\u009aM\u000f\u04b1\u04b2\n\r\u0000\u0000\u04b2"+
		"\u04b3\u0005\u00c4\u0000\u0000\u04b3\u04d7\u0003\u009aM\u000e\u04b4\u04b5"+
		"\n\f\u0000\u0000\u04b5\u04b6\u0005\u00c2\u0000\u0000\u04b6\u04d7\u0003"+
		"\u009aM\r\u04b7\u04b8\n\u000b\u0000\u0000\u04b8\u04b9\u0005\u00b6\u0000"+
		"\u0000\u04b9\u04d7\u0003\u009aM\f\u04ba\u04bb\n\n\u0000\u0000\u04bb\u04bc"+
		"\u0005\u00b5\u0000\u0000\u04bc\u04d7\u0003\u009aM\u000b\u04bd\u04be\n"+
		"\t\u0000\u0000\u04be\u04c0\u0005\u00ce\u0000\u0000\u04bf\u04c1\u0003\u009a"+
		"M\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000"+
		"\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c3\u0005\u00d6\u0000"+
		"\u0000\u04c3\u04d7\u0003\u009aM\n\u04c4\u04c5\n\b\u0000\u0000\u04c5\u04c6"+
		"\u0005\u00b7\u0000\u0000\u04c6\u04d7\u0003\u009aM\t\u04c7\u04c8\n\u0007"+
		"\u0000\u0000\u04c8\u04c9\u0005\u009c\u0000\u0000\u04c9\u04d7\u0003\u009a"+
		"M\b\u04ca\u04cb\n\u0003\u0000\u0000\u04cb\u04cc\u0005b\u0000\u0000\u04cc"+
		"\u04d7\u0003\u009aM\u0004\u04cd\u04ce\n\u0002\u0000\u0000\u04ce\u04cf"+
		"\u0005d\u0000\u0000\u04cf\u04d7\u0003\u009aM\u0003\u04d0\u04d1\n\u0001"+
		"\u0000\u0000\u04d1\u04d2\u0005c\u0000\u0000\u04d2\u04d7\u0003\u009aM\u0002"+
		"\u04d3\u04d4\n\u0014\u0000\u0000\u04d4\u04d5\u0005Y\u0000\u0000\u04d5"+
		"\u04d7\u0003\u00b6[\u0000\u04d6\u049c\u0001\u0000\u0000\u0000\u04d6\u049f"+
		"\u0001\u0000\u0000\u0000\u04d6\u04a2\u0001\u0000\u0000\u0000\u04d6\u04a5"+
		"\u0001\u0000\u0000\u0000\u04d6\u04a8\u0001\u0000\u0000\u0000\u04d6\u04ab"+
		"\u0001\u0000\u0000\u0000\u04d6\u04ae\u0001\u0000\u0000\u0000\u04d6\u04b1"+
		"\u0001\u0000\u0000\u0000\u04d6\u04b4\u0001\u0000\u0000\u0000\u04d6\u04b7"+
		"\u0001\u0000\u0000\u0000\u04d6\u04ba\u0001\u0000\u0000\u0000\u04d6\u04bd"+
		"\u0001\u0000\u0000\u0000\u04d6\u04c4\u0001\u0000\u0000\u0000\u04d6\u04c7"+
		"\u0001\u0000\u0000\u0000\u04d6\u04ca\u0001\u0000\u0000\u0000\u04d6\u04cd"+
		"\u0001\u0000\u0000\u0000\u04d6\u04d0\u0001\u0000\u0000\u0000\u04d6\u04d3"+
		"\u0001\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000\u0000\u04d8\u04d6"+
		"\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9\u009b"+
		"\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04db\u04de"+
		"\u0003\u00dcn\u0000\u04dc\u04de\u0003\u009eO\u0000\u04dd\u04db\u0001\u0000"+
		"\u0000\u0000\u04dd\u04dc\u0001\u0000\u0000\u0000\u04de\u009d\u0001\u0000"+
		"\u0000\u0000\u04df\u04e0\u0005-\u0000\u0000\u04e0\u04e2\u0005\u00cf\u0000"+
		"\u0000\u04e1\u04e3\u0003\u00acV\u0000\u04e2\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e2\u04e3\u0001\u0000\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000"+
		"\u04e4\u04eb\u0005\u00d0\u0000\u0000\u04e5\u04e7\u0005\u00d1\u0000\u0000"+
		"\u04e6\u04e8\u0003\u00acV\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000\u0000\u04e9"+
		"\u04eb\u0005\u00d2\u0000\u0000\u04ea\u04df\u0001\u0000\u0000\u0000\u04ea"+
		"\u04e5\u0001\u0000\u0000\u0000\u04eb\u04f0\u0001\u0000\u0000\u0000\u04ec"+
		"\u04ed\u0005\u00d1\u0000\u0000\u04ed\u04ee\u0003\u009aM\u0000\u04ee\u04ef"+
		"\u0005\u00d2\u0000\u0000\u04ef\u04f1\u0001\u0000\u0000\u0000\u04f0\u04ec"+
		"\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u009f"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f4\u0005t\u0000\u0000\u04f3\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f7\u0005Q\u0000\u0000\u04f6\u04f8\u0005\u00c1"+
		"\u0000\u0000\u04f7\u04f6\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000"+
		"\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fa\u0005\u00cf"+
		"\u0000\u0000\u04fa\u04fb\u0003n7\u0000\u04fb\u04fd\u0005\u00d0\u0000\u0000"+
		"\u04fc\u04fe\u0003\u00b0X\u0000\u04fd\u04fc\u0001\u0000\u0000\u0000\u04fd"+
		"\u04fe\u0001\u0000\u0000\u0000\u04fe\u0501\u0001\u0000\u0000\u0000\u04ff"+
		"\u0500\u0005\u00d6\u0000\u0000\u0500\u0502\u0003r9\u0000\u0501\u04ff\u0001"+
		"\u0000\u0000\u0000\u0501\u0502\u0001\u0000\u0000\u0000\u0502\u0503\u0001"+
		"\u0000\u0000\u0000\u0503\u0504\u00038\u001c\u0000\u0504\u050d\u0001\u0000"+
		"\u0000\u0000\u0505\u0506\u0005\u0083\u0000\u0000\u0506\u0507\u0005\u00cf"+
		"\u0000\u0000\u0507\u0508\u0003n7\u0000\u0508\u0509\u0005\u00d0\u0000\u0000"+
		"\u0509\u050a\u0005\u009f\u0000\u0000\u050a\u050b\u0003\u009aM\u0000\u050b"+
		"\u050d\u0001\u0000\u0000\u0000\u050c\u04f3\u0001\u0000\u0000\u0000\u050c"+
		"\u0505\u0001\u0000\u0000\u0000\u050d\u00a1\u0001\u0000\u0000\u0000\u050e"+
		"\u050f\u0005e\u0000\u0000\u050f\u0510\u0005\u00cf\u0000\u0000\u0510\u0511"+
		"\u0003\u009aM\u0000\u0511\u0512\u0005\u00d0\u0000\u0000\u0512\u0513\u0005"+
		"\u00d3\u0000\u0000\u0513\u0518\u0003\u00a4R\u0000\u0514\u0515\u0005\u00d5"+
		"\u0000\u0000\u0515\u0517\u0003\u00a4R\u0000\u0516\u0514\u0001\u0000\u0000"+
		"\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518\u0516\u0001\u0000\u0000"+
		"\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051c\u0001\u0000\u0000"+
		"\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051b\u051d\u0005\u00d5\u0000"+
		"\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000"+
		"\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u051f\u0005\u00d4\u0000"+
		"\u0000\u051f\u00a3\u0001\u0000\u0000\u0000\u0520\u0525\u0003\u009aM\u0000"+
		"\u0521\u0522\u0005\u00d5\u0000\u0000\u0522\u0524\u0003\u009aM\u0000\u0523"+
		"\u0521\u0001\u0000\u0000\u0000\u0524\u0527\u0001\u0000\u0000\u0000\u0525"+
		"\u0523\u0001\u0000\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526"+
		"\u0528\u0001\u0000\u0000\u0000\u0527\u0525\u0001\u0000\u0000\u0000\u0528"+
		"\u0529\u0005\u009f\u0000\u0000\u0529\u052a\u0003\u009aM\u0000\u052a\u00a5"+
		"\u0001\u0000\u0000\u0000\u052b\u052c\u0005g\u0000\u0000\u052c\u052e\u0003"+
		"\u00b6[\u0000\u052d\u052f\u0003\u00c4b\u0000\u052e\u052d\u0001\u0000\u0000"+
		"\u0000\u052e\u052f\u0001\u0000\u0000\u0000\u052f\u00a7\u0001\u0000\u0000"+
		"\u0000\u0530\u0531\u0007\r\u0000\u0000\u0531\u00a9\u0001\u0000\u0000\u0000"+
		"\u0532\u053a\u0005\u0081\u0000\u0000\u0533\u0536\u0003\u009aM\u0000\u0534"+
		"\u0535\u0005\u009f\u0000\u0000\u0535\u0537\u0003\u009aM\u0000\u0536\u0534"+
		"\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537\u053b"+
		"\u0001\u0000\u0000\u0000\u0538\u0539\u0005\u0082\u0000\u0000\u0539\u053b"+
		"\u0003\u009aM\u0000\u053a\u0533\u0001\u0000\u0000\u0000\u053a\u0538\u0001"+
		"\u0000\u0000\u0000\u053b\u00ab\u0001\u0000\u0000\u0000\u053c\u0541\u0003"+
		"\u00aeW\u0000\u053d\u053e\u0005\u00d5\u0000\u0000\u053e\u0540\u0003\u00ae"+
		"W\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u0540\u0543\u0001\u0000\u0000"+
		"\u0000\u0541\u053f\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000"+
		"\u0000\u0542\u0545\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000"+
		"\u0000\u0544\u0546\u0005\u00d5\u0000\u0000\u0545\u0544\u0001\u0000\u0000"+
		"\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u00ad\u0001\u0000\u0000"+
		"\u0000\u0547\u054a\u0003\u009aM\u0000\u0548\u0549\u0005\u009f\u0000\u0000"+
		"\u0549\u054b\u0003\u009aM\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a"+
		"\u054b\u0001\u0000\u0000\u0000\u054b\u0554\u0001\u0000\u0000\u0000\u054c"+
		"\u054d\u0003\u009aM\u0000\u054d\u054e\u0005\u009f\u0000\u0000\u054e\u0550"+
		"\u0001\u0000\u0000\u0000\u054f\u054c\u0001\u0000\u0000\u0000\u054f\u0550"+
		"\u0001\u0000\u0000\u0000\u0550\u0551\u0001\u0000\u0000\u0000\u0551\u0552"+
		"\u0005\u00c1\u0000\u0000\u0552\u0554\u0003\u00dcn\u0000\u0553\u0547\u0001"+
		"\u0000\u0000\u0000\u0553\u054f\u0001\u0000\u0000\u0000\u0554\u00af\u0001"+
		"\u0000\u0000\u0000\u0555\u0556\u0005~\u0000\u0000\u0556\u0557\u0005\u00cf"+
		"\u0000\u0000\u0557\u055c\u0003\u00b2Y\u0000\u0558\u0559\u0005\u00d5\u0000"+
		"\u0000\u0559\u055b\u0003\u00b2Y\u0000\u055a\u0558\u0001\u0000\u0000\u0000"+
		"\u055b\u055e\u0001\u0000\u0000\u0000\u055c\u055a\u0001\u0000\u0000\u0000"+
		"\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055f\u0001\u0000\u0000\u0000"+
		"\u055e\u055c\u0001\u0000\u0000\u0000\u055f\u0560\u0005\u00d0\u0000\u0000"+
		"\u0560\u00b1\u0001\u0000\u0000\u0000\u0561\u0563\u0005\u00c1\u0000\u0000"+
		"\u0562\u0561\u0001\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000\u0000"+
		"\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0565\u0005\u00db\u0000\u0000"+
		"\u0565\u00b3\u0001\u0000\u0000\u0000\u0566\u0568\u0003\u00bc^\u0000\u0567"+
		"\u0569\u0003(\u0014\u0000\u0568\u0567\u0001\u0000\u0000\u0000\u0568\u0569"+
		"\u0001\u0000\u0000\u0000\u0569\u056c\u0001\u0000\u0000\u0000\u056a\u056c"+
		"\u0005t\u0000\u0000\u056b\u0566\u0001\u0000\u0000\u0000\u056b\u056a\u0001"+
		"\u0000\u0000\u0000\u056c\u00b5\u0001\u0000\u0000\u0000\u056d\u0570\u0003"+
		"\u00bc^\u0000\u056e\u0570\u0003\u00ba]\u0000\u056f\u056d\u0001\u0000\u0000"+
		"\u0000\u056f\u056e\u0001\u0000\u0000\u0000\u0570\u0572\u0001\u0000\u0000"+
		"\u0000\u0571\u0573\u0003(\u0014\u0000\u0572\u0571\u0001\u0000\u0000\u0000"+
		"\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0578\u0001\u0000\u0000\u0000"+
		"\u0574\u0578\u0003\u0100\u0080\u0000\u0575\u0578\u0005t\u0000\u0000\u0576"+
		"\u0578\u0003\u00b8\\\u0000\u0577\u056f\u0001\u0000\u0000\u0000\u0577\u0574"+
		"\u0001\u0000\u0000\u0000\u0577\u0575\u0001\u0000\u0000\u0000\u0577\u0576"+
		"\u0001\u0000\u0000\u0000\u0578\u00b7\u0001\u0000\u0000\u0000\u0579\u057b"+
		"\u0003*\u0015\u0000\u057a\u0579\u0001\u0000\u0000\u0000\u057a\u057b\u0001"+
		"\u0000\u0000\u0000\u057b\u057d\u0001\u0000\u0000\u0000\u057c\u057e\u0005"+
		"m\u0000\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057d\u057e\u0001\u0000"+
		"\u0000\u0000\u057e\u0580\u0001\u0000\u0000\u0000\u057f\u0581\u0003\u00f6"+
		"{\u0000\u0580\u057f\u0001\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000"+
		"\u0000\u0581\u0583\u0001\u0000\u0000\u0000\u0582\u0584\u0005k\u0000\u0000"+
		"\u0583\u0582\u0001\u0000\u0000\u0000\u0583\u0584\u0001\u0000\u0000\u0000"+
		"\u0584\u059a\u0001\u0000\u0000\u0000\u0585\u0587\u0003\u001a\r\u0000\u0586"+
		"\u0588\u0003\u001e\u000f\u0000\u0587\u0586\u0001\u0000\u0000\u0000\u0587"+
		"\u0588\u0001\u0000\u0000\u0000\u0588\u058b\u0001\u0000\u0000\u0000\u0589"+
		"\u058a\u0005K\u0000\u0000\u058a\u058c\u0003\u00b4Z\u0000\u058b\u0589\u0001"+
		"\u0000\u0000\u0000\u058b\u058c\u0001\u0000\u0000\u0000\u058c\u058f\u0001"+
		"\u0000\u0000\u0000\u058d\u058e\u0005U\u0000\u0000\u058e\u0590\u0003\u001c"+
		"\u000e\u0000\u058f\u058d\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000"+
		"\u0000\u0000\u0590\u059b\u0001\u0000\u0000\u0000\u0591\u0592\u0005_\u0000"+
		"\u0000\u0592\u0594\u0003\u00f8|\u0000\u0593\u0595\u0003\u001e\u000f\u0000"+
		"\u0594\u0593\u0001\u0000\u0000\u0000\u0594\u0595\u0001\u0000\u0000\u0000"+
		"\u0595\u0598\u0001\u0000\u0000\u0000\u0596\u0597\u0005K\u0000\u0000\u0597"+
		"\u0599\u0003\u001c\u000e\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598"+
		"\u0599\u0001\u0000\u0000\u0000\u0599\u059b\u0001\u0000\u0000\u0000\u059a"+
		"\u0585\u0001\u0000\u0000\u0000\u059a\u0591\u0001\u0000\u0000\u0000\u059b"+
		"\u059c\u0001\u0000\u0000\u0000\u059c\u05a0\u0005\u00d3\u0000\u0000\u059d"+
		"\u059f\u0003|>\u0000\u059e\u059d\u0001\u0000\u0000\u0000\u059f\u05a2\u0001"+
		"\u0000\u0000\u0000\u05a0\u059e\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001"+
		"\u0000\u0000\u0000\u05a1\u05a3\u0001\u0000\u0000\u0000\u05a2\u05a0\u0001"+
		"\u0000\u0000\u0000\u05a3\u05a4\u0005\u00d4\u0000\u0000\u05a4\u00b9\u0001"+
		"\u0000\u0000\u0000\u05a5\u05aa\u0003\u00e8t\u0000\u05a6\u05a7\u0005\u00bc"+
		"\u0000\u0000\u05a7\u05a9\u0003\u00eau\u0000\u05a8\u05a6\u0001\u0000\u0000"+
		"\u0000\u05a9\u05ac\u0001\u0000\u0000\u0000\u05aa\u05a8\u0001\u0000\u0000"+
		"\u0000\u05aa\u05ab\u0001\u0000\u0000\u0000\u05ab\u00bb\u0001\u0000\u0000"+
		"\u0000\u05ac\u05aa\u0001\u0000\u0000\u0000\u05ad\u05af\u0005f\u0000\u0000"+
		"\u05ae\u05ad\u0001\u0000\u0000\u0000\u05ae\u05af\u0001\u0000\u0000\u0000"+
		"\u05af\u05b1\u0001\u0000\u0000\u0000\u05b0\u05b2\u0005\u00bd\u0000\u0000"+
		"\u05b1\u05b0\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b4\u0003\u00be_\u0000\u05b4"+
		"\u00bd\u0001\u0000\u0000\u0000\u05b5\u05c3\u0003\u00f8|\u0000\u05b6\u05bb"+
		"\u0003\u00f8|\u0000\u05b7\u05b8\u0005\u00bd\u0000\u0000\u05b8\u05ba\u0003"+
		"\u00f8|\u0000\u05b9\u05b7\u0001\u0000\u0000\u0000\u05ba\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bb\u05b9\u0001\u0000\u0000\u0000\u05bb\u05bc\u0001\u0000"+
		"\u0000\u0000\u05bc\u05c0\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000"+
		"\u0000\u0000\u05be\u05bf\u0005\u00bd\u0000\u0000\u05bf\u05c1\u0003\u00c0"+
		"`\u0000\u05c0\u05be\u0001\u0000\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000"+
		"\u0000\u05c1\u05c3\u0001\u0000\u0000\u0000\u05c2\u05b5\u0001\u0000\u0000"+
		"\u0000\u05c2\u05b6\u0001\u0000\u0000\u0000\u05c3\u00bf\u0001\u0000\u0000"+
		"\u0000\u05c4\u05c7\u0003\u00f8|\u0000\u05c5\u05c6\u0005.\u0000\u0000\u05c6"+
		"\u05c8\u0003\u00f8|\u0000\u05c7\u05c5\u0001\u0000\u0000\u0000\u05c7\u05c8"+
		"\u0001\u0000\u0000\u0000\u05c8\u05d8\u0001\u0000\u0000\u0000\u05c9\u05ca"+
		"\u0005\u00d3\u0000\u0000\u05ca\u05cf\u0003\u00c0`\u0000\u05cb\u05cc\u0005"+
		"\u00d5\u0000\u0000\u05cc\u05ce\u0003\u00c0`\u0000\u05cd\u05cb\u0001\u0000"+
		"\u0000\u0000\u05ce\u05d1\u0001\u0000\u0000\u0000\u05cf\u05cd\u0001\u0000"+
		"\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000\u05d0\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000\u05d2\u05d4\u0005\u00d5"+
		"\u0000\u0000\u05d3\u05d2\u0001\u0000\u0000\u0000\u05d3\u05d4\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d5\u0001\u0000\u0000\u0000\u05d5\u05d6\u0005\u00d4"+
		"\u0000\u0000\u05d6\u05d8\u0001\u0000\u0000\u0000\u05d7\u05c4\u0001\u0000"+
		"\u0000\u0000\u05d7\u05c9\u0001\u0000\u0000\u0000\u05d8\u00c1\u0001\u0000"+
		"\u0000\u0000\u05d9\u05de\u0003\u00bc^\u0000\u05da\u05db\u0005\u00d5\u0000"+
		"\u0000\u05db\u05dd\u0003\u00bc^\u0000\u05dc\u05da\u0001\u0000\u0000\u0000"+
		"\u05dd\u05e0\u0001\u0000\u0000\u0000\u05de\u05dc\u0001\u0000\u0000\u0000"+
		"\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u00c3\u0001\u0000\u0000\u0000"+
		"\u05e0\u05de\u0001\u0000\u0000\u0000\u05e1\u05eb\u0005\u00cf\u0000\u0000"+
		"\u05e2\u05e7\u0003\u00c6c\u0000\u05e3\u05e4\u0005\u00d5\u0000\u0000\u05e4"+
		"\u05e6\u0003\u00c6c\u0000\u05e5\u05e3\u0001\u0000\u0000\u0000\u05e6\u05e9"+
		"\u0001\u0000\u0000\u0000\u05e7\u05e5\u0001\u0000\u0000\u0000\u05e7\u05e8"+
		"\u0001\u0000\u0000\u0000\u05e8\u05ec\u0001\u0000\u0000\u0000\u05e9\u05e7"+
		"\u0001\u0000\u0000\u0000\u05ea\u05ec\u0003\u00aaU\u0000\u05eb\u05e2\u0001"+
		"\u0000\u0000\u0000\u05eb\u05ea\u0001\u0000\u0000\u0000\u05eb\u05ec\u0001"+
		"\u0000\u0000\u0000\u05ec\u05ee\u0001\u0000\u0000\u0000\u05ed\u05ef\u0005"+
		"\u00d5\u0000\u0000\u05ee\u05ed\u0001\u0000\u0000\u0000\u05ee\u05ef\u0001"+
		"\u0000\u0000\u0000\u05ef\u05f0\u0001\u0000\u0000\u0000\u05f0\u05f1\u0005"+
		"\u00d0\u0000\u0000\u05f1\u00c5\u0001\u0000\u0000\u0000\u05f2\u05f4\u0003"+
		"\u00c8d\u0000\u05f3\u05f2\u0001\u0000\u0000\u0000\u05f3\u05f4\u0001\u0000"+
		"\u0000\u0000\u05f4\u05f6\u0001\u0000\u0000\u0000\u05f5\u05f7\u0005\u00be"+
		"\u0000\u0000\u05f6\u05f5\u0001\u0000\u0000\u0000\u05f6\u05f7\u0001\u0000"+
		"\u0000\u0000\u05f7\u05f8\u0001\u0000\u0000\u0000\u05f8\u05fc\u0003\u009a"+
		"M\u0000\u05f9\u05fa\u0005\u00c1\u0000\u0000\u05fa\u05fc\u0003\u00dcn\u0000"+
		"\u05fb\u05f3\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000"+
		"\u05fc\u00c7\u0001\u0000\u0000\u0000\u05fd\u05fe\u0003\u00f8|\u0000\u05fe"+
		"\u05ff\u0005\u00d6\u0000\u0000\u05ff\u00c9\u0001\u0000\u0000\u0000\u0600"+
		"\u0616\u0003\u00ccf\u0000\u0601\u0616\u0003\u00d6k\u0000\u0602\u0603\u0005"+
		"-\u0000\u0000\u0603\u0608\u0005\u00cf\u0000\u0000\u0604\u0606\u0003\u00ac"+
		"V\u0000\u0605\u0607\u0005\u00d5\u0000\u0000\u0606\u0605\u0001\u0000\u0000"+
		"\u0000\u0606\u0607\u0001\u0000\u0000\u0000\u0607\u0609\u0001\u0000\u0000"+
		"\u0000\u0608\u0604\u0001\u0000\u0000\u0000\u0608\u0609\u0001\u0000\u0000"+
		"\u0000\u0609\u060a\u0001\u0000\u0000\u0000\u060a\u0616\u0005\u00d0\u0000"+
		"\u0000\u060b\u0610\u0005\u00d1\u0000\u0000\u060c\u060e\u0003\u00acV\u0000"+
		"\u060d\u060f\u0005\u00d5\u0000\u0000\u060e\u060d\u0001\u0000\u0000\u0000"+
		"\u060e\u060f\u0001\u0000\u0000\u0000\u060f\u0611\u0001\u0000\u0000\u0000"+
		"\u0610\u060c\u0001\u0000\u0000\u0000\u0610\u0611\u0001\u0000\u0000\u0000"+
		"\u0611\u0612\u0001\u0000\u0000\u0000\u0612\u0616\u0005\u00d2\u0000\u0000"+
		"\u0613\u0614\u0007\u000e\u0000\u0000\u0614\u0616\u0003\u00cae\u0000\u0615"+
		"\u0600\u0001\u0000\u0000\u0000\u0615\u0601\u0001\u0000\u0000\u0000\u0615"+
		"\u0602\u0001\u0000\u0000\u0000\u0615\u060b\u0001\u0000\u0000\u0000\u0615"+
		"\u0613\u0001\u0000\u0000\u0000\u0616\u00cb\u0001\u0000\u0000\u0000\u0617"+
		"\u061d\u0005h\u0000\u0000\u0618\u061d\u0003\u00ceg\u0000\u0619\u061d\u0003"+
		"\u00fc~\u0000\u061a\u061d\u0003\u00d2i\u0000\u061b\u061d\u0003\u00bc^"+
		"\u0000\u061c\u0617\u0001\u0000\u0000\u0000\u061c\u0618\u0001\u0000\u0000"+
		"\u0000\u061c\u0619\u0001\u0000\u0000\u0000\u061c\u061a\u0001\u0000\u0000"+
		"\u0000\u061c\u061b\u0001\u0000\u0000\u0000\u061d\u00cd\u0001\u0000\u0000"+
		"\u0000\u061e\u0623\u0005\u00df\u0000\u0000\u061f\u0623\u00051\u0000\u0000"+
		"\u0620\u0623\u0003\u00d0h\u0000\u0621\u0623\u0003\u00d4j\u0000\u0622\u061e"+
		"\u0001\u0000\u0000\u0000\u0622\u061f\u0001\u0000\u0000\u0000\u0622\u0620"+
		"\u0001\u0000\u0000\u0000\u0622\u0621\u0001\u0000\u0000\u0000\u0623\u00cf"+
		"\u0001\u0000\u0000\u0000\u0624\u0625\u0007\u000f\u0000\u0000\u0625\u00d1"+
		"\u0001\u0000\u0000\u0000\u0626\u0627\u0007\u0010\u0000\u0000\u0627\u062c"+
		"\u0005\u00bb\u0000\u0000\u0628\u062d\u0003\u00f8|\u0000\u0629\u062d\u0005"+
		"\u0088\u0000\u0000\u062a\u062d\u0005\u0084\u0000\u0000\u062b\u062d\u0005"+
		"\u0085\u0000\u0000\u062c\u0628\u0001\u0000\u0000\u0000\u062c\u0629\u0001"+
		"\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c\u062b\u0001"+
		"\u0000\u0000\u0000\u062d\u0639\u0001\u0000\u0000\u0000\u062e\u0632\u0003"+
		"\u00b4Z\u0000\u062f\u0632\u0003\u00eew\u0000\u0630\u0632\u0003\u00d6k"+
		"\u0000\u0631\u062e\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000"+
		"\u0000\u0631\u0630\u0001\u0000\u0000\u0000\u0632\u0633\u0001\u0000\u0000"+
		"\u0000\u0633\u0636\u0005\u00bb\u0000\u0000\u0634\u0637\u0003\u00f8|\u0000"+
		"\u0635\u0637\u0003\u00eew\u0000\u0636\u0634\u0001\u0000\u0000\u0000\u0636"+
		"\u0635\u0001\u0000\u0000\u0000\u0637\u0639\u0001\u0000\u0000\u0000\u0638"+
		"\u0626\u0001\u0000\u0000\u0000\u0638\u0631\u0001\u0000\u0000\u0000\u0639"+
		"\u00d3\u0001\u0000\u0000\u0000\u063a\u063b\u0005\u00dc\u0000\u0000\u063b"+
		"\u00d5\u0001\u0000\u0000\u0000\u063c\u063e\u0005\u00e6\u0000\u0000\u063d"+
		"\u063f\u0005\u00ee\u0000\u0000\u063e\u063d\u0001\u0000\u0000\u0000\u063f"+
		"\u0640\u0001\u0000\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0640"+
		"\u0641\u0001\u0000\u0000\u0000\u0641\u0652\u0001\u0000\u0000\u0000\u0642"+
		"\u0644\u0005\u00e5\u0000\u0000\u0643\u0645\u0005\u00ee\u0000\u0000\u0644"+
		"\u0643\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646"+
		"\u0644\u0001\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647"+
		"\u0652\u0001\u0000\u0000\u0000\u0648\u0652\u0005\u00e3\u0000\u0000\u0649"+
		"\u064d\u0005\u00e4\u0000\u0000\u064a\u064c\u0003\u00d8l\u0000\u064b\u064a"+
		"\u0001\u0000\u0000\u0000\u064c\u064f\u0001\u0000\u0000\u0000\u064d\u064b"+
		"\u0001\u0000\u0000\u0000\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u0650"+
		"\u0001\u0000\u0000\u0000\u064f\u064d\u0001\u0000\u0000\u0000\u0650\u0652"+
		"\u0005\u00e4\u0000\u0000\u0651\u063c\u0001\u0000\u0000\u0000\u0651\u0642"+
		"\u0001\u0000\u0000\u0000\u0651\u0648\u0001\u0000\u0000\u0000\u0651\u0649"+
		"\u0001\u0000\u0000\u0000\u0652\u00d7\u0001\u0000\u0000\u0000\u0653\u0657"+
		"\u0005\u00ea\u0000\u0000\u0654\u0657\u0005\u00e9\u0000\u0000\u0655\u0657"+
		"\u0003\u00dcn\u0000\u0656\u0653\u0001\u0000\u0000\u0000\u0656\u0654\u0001"+
		"\u0000\u0000\u0000\u0656\u0655\u0001\u0000\u0000\u0000\u0657\u00d9\u0001"+
		"\u0000\u0000\u0000\u0658\u065d\u0003\u00dcn\u0000\u0659\u065a\u0005\u00d5"+
		"\u0000\u0000\u065a\u065c\u0003\u00dcn\u0000\u065b\u0659\u0001\u0000\u0000"+
		"\u0000\u065c\u065f\u0001\u0000\u0000\u0000\u065d\u065b\u0001\u0000\u0000"+
		"\u0000\u065d\u065e\u0001\u0000\u0000\u0000\u065e\u00db\u0001\u0000\u0000"+
		"\u0000\u065f\u065d\u0001\u0000\u0000\u0000\u0660\u0664\u0003\u00deo\u0000"+
		"\u0661\u0663\u0003\u00e0p\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0663"+
		"\u0666\u0001\u0000\u0000\u0000\u0664\u0662\u0001\u0000\u0000\u0000\u0664"+
		"\u0665\u0001\u0000\u0000\u0000\u0665\u00dd\u0001\u0000\u0000\u0000\u0666"+
		"\u0664\u0001\u0000\u0000\u0000\u0667\u066e\u0003\u00e8t\u0000\u0668\u066e"+
		"\u0003\u00e2q\u0000\u0669\u066a\u0005\u00cf\u0000\u0000\u066a\u066b\u0003"+
		"\u00a6S\u0000\u066b\u066c\u0005\u00d0\u0000\u0000\u066c\u066e\u0001\u0000"+
		"\u0000\u0000\u066d\u0667\u0001\u0000\u0000\u0000\u066d\u0668\u0001\u0000"+
		"\u0000\u0000\u066d\u0669\u0001\u0000\u0000\u0000\u066e\u00df\u0001\u0000"+
		"\u0000\u0000\u066f\u0670\u0005\u00bc\u0000\u0000\u0670\u0672\u0003\u00ea"+
		"u\u0000\u0671\u0673\u0003\u00e6s\u0000\u0672\u0671\u0001\u0000\u0000\u0000"+
		"\u0672\u0673\u0001\u0000\u0000\u0000\u0673\u00e1\u0001\u0000\u0000\u0000"+
		"\u0674\u0675\u0003\u00e4r\u0000\u0675\u0676\u0003\u00e6s\u0000\u0676\u00e3"+
		"\u0001\u0000\u0000\u0000\u0677\u067c\u0003\u00bc^\u0000\u0678\u067c\u0003"+
		"\u00d2i\u0000\u0679\u067c\u0003\u00e8t\u0000\u067a\u067c\u0003\u0098L"+
		"\u0000\u067b\u0677\u0001\u0000\u0000\u0000\u067b\u0678\u0001\u0000\u0000"+
		"\u0000\u067b\u0679\u0001\u0000\u0000\u0000\u067b\u067a\u0001\u0000\u0000"+
		"\u0000\u067c\u00e5\u0001\u0000\u0000\u0000\u067d\u067f\u0003(\u0014\u0000"+
		"\u067e\u067d\u0001\u0000\u0000\u0000\u067e\u067f\u0001\u0000\u0000\u0000"+
		"\u067f\u0680\u0001\u0000\u0000\u0000\u0680\u0684\u0003\u00c4b\u0000\u0681"+
		"\u0683\u0003\u00f0x\u0000\u0682\u0681\u0001\u0000\u0000\u0000\u0683\u0686"+
		"\u0001\u0000\u0000\u0000\u0684\u0682\u0001\u0000\u0000\u0000\u0684\u0685"+
		"\u0001\u0000\u0000\u0000\u0685\u00e7\u0001\u0000\u0000\u0000\u0686\u0684"+
		"\u0001\u0000\u0000\u0000\u0687\u068a\u0003\u00eew\u0000\u0688\u0689\u0005"+
		"\u00bb\u0000\u0000\u0689\u068b\u0003\u00eew\u0000\u068a\u0688\u0001\u0000"+
		"\u0000\u0000\u068a\u068b\u0001\u0000\u0000\u0000\u068b\u0691\u0001\u0000"+
		"\u0000\u0000\u068c\u068d\u0003\u00b4Z\u0000\u068d\u068e\u0005\u00bb\u0000"+
		"\u0000\u068e\u068f\u0003\u00eew\u0000\u068f\u0691\u0001\u0000\u0000\u0000"+
		"\u0690\u0687\u0001\u0000\u0000\u0000\u0690\u068c\u0001\u0000\u0000\u0000"+
		"\u0691\u00e9\u0001\u0000\u0000\u0000\u0692\u0695\u0003\u00ecv\u0000\u0693"+
		"\u0695\u0003\u00eew\u0000\u0694\u0692\u0001\u0000\u0000\u0000\u0694\u0693"+
		"\u0001\u0000\u0000\u0000\u0695\u00eb\u0001\u0000\u0000\u0000\u0696\u069c"+
		"\u0003\u00f8|\u0000\u0697\u0698\u0005\u00d3\u0000\u0000\u0698\u0699\u0003"+
		"\u009aM\u0000\u0699\u069a\u0005\u00d4\u0000\u0000\u069a\u069c\u0001\u0000"+
		"\u0000\u0000\u069b\u0696\u0001\u0000\u0000\u0000\u069b\u0697\u0001\u0000"+
		"\u0000\u0000\u069c\u06a0\u0001\u0000\u0000\u0000\u069d\u069f\u0003\u00f0"+
		"x\u0000\u069e\u069d\u0001\u0000\u0000\u0000\u069f\u06a2\u0001\u0000\u0000"+
		"\u0000\u06a0\u069e\u0001\u0000\u0000\u0000\u06a0\u06a1\u0001\u0000\u0000"+
		"\u0000\u06a1\u00ed\u0001\u0000\u0000\u0000\u06a2\u06a0\u0001\u0000\u0000"+
		"\u0000\u06a3\u06a5\u0005\u00cc\u0000\u0000\u06a4\u06a3\u0001\u0000\u0000"+
		"\u0000\u06a5\u06a8\u0001\u0000\u0000\u0000\u06a6\u06a4\u0001\u0000\u0000"+
		"\u0000\u06a6\u06a7\u0001\u0000\u0000\u0000\u06a7\u06af\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a6\u0001\u0000\u0000\u0000\u06a9\u06b0\u0005\u00db\u0000"+
		"\u0000\u06aa\u06ab\u0005\u00cc\u0000\u0000\u06ab\u06ac\u0005\u00d3\u0000"+
		"\u0000\u06ac\u06ad\u0003\u009aM\u0000\u06ad\u06ae\u0005\u00d4\u0000\u0000"+
		"\u06ae\u06b0\u0001\u0000\u0000\u0000\u06af\u06a9\u0001\u0000\u0000\u0000"+
		"\u06af\u06aa\u0001\u0000\u0000\u0000\u06b0\u06b4\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b3\u0003\u00f0x\u0000\u06b2\u06b1\u0001\u0000\u0000\u0000\u06b3"+
		"\u06b6\u0001\u0000\u0000\u0000\u06b4\u06b2\u0001\u0000\u0000\u0000\u06b4"+
		"\u06b5\u0001\u0000\u0000\u0000\u06b5\u00ef\u0001\u0000\u0000\u0000\u06b6"+
		"\u06b4\u0001\u0000\u0000\u0000\u06b7\u06b9\u0005\u00d1\u0000\u0000\u06b8"+
		"\u06ba\u0003\u009aM\u0000\u06b9\u06b8\u0001\u0000\u0000\u0000\u06b9\u06ba"+
		"\u0001\u0000\u0000\u0000\u06ba\u06bb\u0001\u0000\u0000\u0000\u06bb\u06c1"+
		"\u0005\u00d2\u0000\u0000\u06bc\u06bd\u0005\u00d3\u0000\u0000\u06bd\u06be"+
		"\u0003\u009aM\u0000\u06be\u06bf\u0005\u00d4\u0000\u0000\u06bf\u06c1\u0001"+
		"\u0000\u0000\u0000\u06c0\u06b7\u0001\u0000\u0000\u0000\u06c0\u06bc\u0001"+
		"\u0000\u0000\u0000\u06c1\u00f1\u0001\u0000\u0000\u0000\u06c2\u06c4\u0003"+
		"\u00f4z\u0000\u06c3\u06c2\u0001\u0000\u0000\u0000\u06c3\u06c4\u0001\u0000"+
		"\u0000\u0000\u06c4\u06cb\u0001\u0000\u0000\u0000\u06c5\u06c7\u0005\u00d5"+
		"\u0000\u0000\u06c6\u06c8\u0003\u00f4z\u0000\u06c7\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u06ca\u0001\u0000\u0000"+
		"\u0000\u06c9\u06c5\u0001\u0000\u0000\u0000\u06ca\u06cd\u0001\u0000\u0000"+
		"\u0000\u06cb\u06c9\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000"+
		"\u0000\u06cc\u00f3\u0001\u0000\u0000\u0000\u06cd\u06cb\u0001\u0000\u0000"+
		"\u0000\u06ce\u06d6\u0003\u00dcn\u0000\u06cf\u06d0\u0005a\u0000\u0000\u06d0"+
		"\u06d1\u0005\u00cf\u0000\u0000\u06d1\u06d2\u0003\u00f2y\u0000\u06d2\u06d3"+
		"\u0005\u00d0\u0000\u0000\u06d3\u06d6\u0001\u0000\u0000\u0000\u06d4\u06d6"+
		"\u0003\u00aeW\u0000\u06d5\u06ce\u0001\u0000\u0000\u0000\u06d5\u06cf\u0001"+
		"\u0000\u0000\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000\u06d6\u00f5\u0001"+
		"\u0000\u0000\u0000\u06d7\u06d8\u0007\u0011\u0000\u0000\u06d8\u00f7\u0001"+
		"\u0000\u0000\u0000\u06d9\u06da\u0007\u0012\u0000\u0000\u06da\u00f9\u0001"+
		"\u0000\u0000\u0000\u06db\u06dc\u0007\u0013\u0000\u0000\u06dc\u00fb\u0001"+
		"\u0000\u0000\u0000\u06dd\u06de\u0007\u0014\u0000\u0000\u06de\u00fd\u0001"+
		"\u0000\u0000\u0000\u06df\u06e0\u0007\u0015\u0000\u0000\u06e0\u00ff\u0001"+
		"\u0000\u0000\u0000\u06e1\u06e2\u0007\u0016\u0000\u0000\u06e2\u0101\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e4\u0007\u0017\u0000\u0000\u06e4\u0103\u0001"+
		"\u0000\u0000\u0000\u00e2\u0105\u0109\u010b\u0113\u0116\u0130\u0134\u0139"+
		"\u013e\u0146\u014a\u0150\u0155\u015a\u0161\u0167\u016e\u0175\u0178\u017c"+
		"\u0180\u0187\u018a\u018f\u0192\u0195\u0198\u019d\u01a1\u01a5\u01aa\u01ae"+
		"\u01b0\u01b6\u01c2\u01d3\u01da\u01e2\u01e6\u01eb\u01f1\u01f9\u0201\u0207"+
		"\u020e\u0215\u021a\u0220\u023d\u024b\u024f\u0258\u025c\u0261\u027b\u0286"+
		"\u028a\u028e\u0297\u02a1\u02a6\u02ac\u02b1\u02b6\u02bb\u02c0\u02c6\u02cc"+
		"\u02d2\u02e4\u02e9\u02ec\u02f6\u02f9\u0306\u030e\u0315\u0318\u031d\u0321"+
		"\u032a\u0346\u034b\u0352\u0356\u035c\u0360\u0363\u0366\u0369\u036c\u036f"+
		"\u0372\u037a\u0381\u038a\u0397\u03a3\u03a9\u03ad\u03b4\u03ba\u03be\u03c5"+
		"\u03cc\u03d0\u03d6\u03da\u03dc\u03e2\u03e9\u03ed\u03f1\u03fe\u0401\u0408"+
		"\u040f\u0413\u0417\u041c\u0421\u0428\u0430\u043a\u0440\u047f\u048c\u0493"+
		"\u0498\u049a\u04c0\u04d6\u04d8\u04dd\u04e2\u04e7\u04ea\u04f0\u04f3\u04f7"+
		"\u04fd\u0501\u050c\u0518\u051c\u0525\u052e\u0536\u053a\u0541\u0545\u054a"+
		"\u054f\u0553\u055c\u0562\u0568\u056b\u056f\u0572\u0577\u057a\u057d\u0580"+
		"\u0583\u0587\u058b\u058f\u0594\u0598\u059a\u05a0\u05aa\u05ae\u05b1\u05bb"+
		"\u05c0\u05c2\u05c7\u05cf\u05d3\u05d7\u05de\u05e7\u05eb\u05ee\u05f3\u05f6"+
		"\u05fb\u0606\u0608\u060e\u0610\u0615\u061c\u0622\u062c\u0631\u0636\u0638"+
		"\u0640\u0646\u064d\u0651\u0656\u065d\u0664\u066d\u0672\u067b\u067e\u0684"+
		"\u068a\u0690\u0694\u069b\u06a0\u06a6\u06af\u06b4\u06b9\u06c0\u06c3\u06c7"+
		"\u06cb\u06d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}