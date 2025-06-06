// Generated from c:/Users/franq/Escritorio/MARAAA/Analizador.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import AnalizadorListener from './AnalizadorListener.js';
import AnalizadorVisitor from './AnalizadorVisitor.js';

const serializedATN = [4,1,22,86,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,5,0,22,8,0,10,0,12,0,25,9,0,
1,1,1,1,1,1,3,1,30,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,4,1,
4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,5,5,53,8,5,10,5,12,5,56,9,5,1,5,1,5,1,
6,1,6,1,6,1,6,5,6,64,8,6,10,6,12,6,67,9,6,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,
8,3,8,77,8,8,1,9,1,9,5,9,81,8,9,10,9,12,9,84,9,9,1,9,0,0,10,0,2,4,6,8,10,
12,14,16,18,0,2,1,0,15,18,1,0,19,21,83,0,23,1,0,0,0,2,29,1,0,0,0,4,31,1,
0,0,0,6,37,1,0,0,0,8,42,1,0,0,0,10,50,1,0,0,0,12,59,1,0,0,0,14,68,1,0,0,
0,16,76,1,0,0,0,18,78,1,0,0,0,20,22,3,2,1,0,21,20,1,0,0,0,22,25,1,0,0,0,
23,21,1,0,0,0,23,24,1,0,0,0,24,1,1,0,0,0,25,23,1,0,0,0,26,30,3,4,2,0,27,
30,3,6,3,0,28,30,3,8,4,0,29,26,1,0,0,0,29,27,1,0,0,0,29,28,1,0,0,0,30,3,
1,0,0,0,31,32,5,13,0,0,32,33,5,7,0,0,33,34,3,12,6,0,34,35,5,8,0,0,35,36,
3,10,5,0,36,5,1,0,0,0,37,38,3,18,9,0,38,39,5,4,0,0,39,40,3,12,6,0,40,41,
5,6,0,0,41,7,1,0,0,0,42,43,5,12,0,0,43,44,5,14,0,0,44,45,5,11,0,0,45,46,
5,7,0,0,46,47,3,12,6,0,47,48,5,8,0,0,48,49,5,6,0,0,49,9,1,0,0,0,50,54,5,
9,0,0,51,53,3,2,1,0,52,51,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,
0,0,55,57,1,0,0,0,56,54,1,0,0,0,57,58,5,10,0,0,58,11,1,0,0,0,59,65,3,16,
8,0,60,61,3,14,7,0,61,62,3,16,8,0,62,64,1,0,0,0,63,60,1,0,0,0,64,67,1,0,
0,0,65,63,1,0,0,0,65,66,1,0,0,0,66,13,1,0,0,0,67,65,1,0,0,0,68,69,7,0,0,
0,69,15,1,0,0,0,70,77,3,18,9,0,71,77,5,20,0,0,72,73,5,7,0,0,73,74,3,12,6,
0,74,75,5,8,0,0,75,77,1,0,0,0,76,70,1,0,0,0,76,71,1,0,0,0,76,72,1,0,0,0,
77,17,1,0,0,0,78,82,5,21,0,0,79,81,7,1,0,0,80,79,1,0,0,0,81,84,1,0,0,0,82,
80,1,0,0,0,82,83,1,0,0,0,83,19,1,0,0,0,84,82,1,0,0,0,6,23,29,54,65,76,82];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class AnalizadorParser extends antlr4.Parser {

    static grammarFileName = "Analizador.g4";
    static literalNames = [ null, "'and'", "'or'", "'not'", "'='", "','", 
                            "';'", "'('", "')'", "'{'", "'}'", "'log'", 
                            "'console'", "'while'", "'.'", "'+'", "'-'", 
                            "'*'", "'/'", "'_'" ];
    static symbolicNames = [ null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", 
                             "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LOG", 
                             "CONSOLE", "WHILE", "Point", "ADD", "RES", 
                             "MULT", "DIV", "BAJO", "INT", "ID", "WS" ];
    static ruleNames = [ "program", "statement", "whileStatment", "assignmentStatement", 
                         "consoleStatement", "block", "expression", "simb", 
                         "term", "identifier" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = AnalizadorParser.ruleNames;
        this.literalNames = AnalizadorParser.literalNames;
        this.symbolicNames = AnalizadorParser.symbolicNames;
    }



	program() {
	    let localctx = new ProgramContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, AnalizadorParser.RULE_program);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 23;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2109440) !== 0)) {
	            this.state = 20;
	            this.statement();
	            this.state = 25;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	statement() {
	    let localctx = new StatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, AnalizadorParser.RULE_statement);
	    try {
	        this.state = 29;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 13:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 26;
	            this.whileStatment();
	            break;
	        case 21:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 27;
	            this.assignmentStatement();
	            break;
	        case 12:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 28;
	            this.consoleStatement();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	whileStatment() {
	    let localctx = new WhileStatmentContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, AnalizadorParser.RULE_whileStatment);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 31;
	        this.match(AnalizadorParser.WHILE);
	        this.state = 32;
	        this.match(AnalizadorParser.LPAREN);
	        this.state = 33;
	        this.expression();
	        this.state = 34;
	        this.match(AnalizadorParser.RPAREN);
	        this.state = 35;
	        this.block();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	assignmentStatement() {
	    let localctx = new AssignmentStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, AnalizadorParser.RULE_assignmentStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 37;
	        this.identifier();
	        this.state = 38;
	        this.match(AnalizadorParser.EQ);
	        this.state = 39;
	        this.expression();
	        this.state = 40;
	        this.match(AnalizadorParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	consoleStatement() {
	    let localctx = new ConsoleStatementContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, AnalizadorParser.RULE_consoleStatement);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 42;
	        this.match(AnalizadorParser.CONSOLE);
	        this.state = 43;
	        this.match(AnalizadorParser.Point);
	        this.state = 44;
	        this.match(AnalizadorParser.LOG);
	        this.state = 45;
	        this.match(AnalizadorParser.LPAREN);
	        this.state = 46;
	        this.expression();
	        this.state = 47;
	        this.match(AnalizadorParser.RPAREN);
	        this.state = 48;
	        this.match(AnalizadorParser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	block() {
	    let localctx = new BlockContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, AnalizadorParser.RULE_block);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 50;
	        this.match(AnalizadorParser.LCURLY);
	        this.state = 54;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 2109440) !== 0)) {
	            this.state = 51;
	            this.statement();
	            this.state = 56;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 57;
	        this.match(AnalizadorParser.RCURLY);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	expression() {
	    let localctx = new ExpressionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, AnalizadorParser.RULE_expression);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 59;
	        this.term();
	        this.state = 65;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 491520) !== 0)) {
	            this.state = 60;
	            this.simb();
	            this.state = 61;
	            this.term();
	            this.state = 67;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	simb() {
	    let localctx = new SimbContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, AnalizadorParser.RULE_simb);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 68;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 491520) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	term() {
	    let localctx = new TermContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, AnalizadorParser.RULE_term);
	    try {
	        this.state = 76;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 21:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 70;
	            this.identifier();
	            break;
	        case 20:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 71;
	            this.match(AnalizadorParser.INT);
	            break;
	        case 7:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 72;
	            this.match(AnalizadorParser.LPAREN);
	            this.state = 73;
	            this.expression();
	            this.state = 74;
	            this.match(AnalizadorParser.RPAREN);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	identifier() {
	    let localctx = new IdentifierContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, AnalizadorParser.RULE_identifier);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 78;
	        this.match(AnalizadorParser.ID);
	        this.state = 82;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 3670016) !== 0)) {
	            this.state = 79;
	            _la = this._input.LA(1);
	            if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 3670016) !== 0))) {
	            this._errHandler.recoverInline(this);
	            }
	            else {
	            	this._errHandler.reportMatch(this);
	                this.consume();
	            }
	            this.state = 84;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

AnalizadorParser.EOF = antlr4.Token.EOF;
AnalizadorParser.AND = 1;
AnalizadorParser.OR = 2;
AnalizadorParser.NOT = 3;
AnalizadorParser.EQ = 4;
AnalizadorParser.COMMA = 5;
AnalizadorParser.SEMI = 6;
AnalizadorParser.LPAREN = 7;
AnalizadorParser.RPAREN = 8;
AnalizadorParser.LCURLY = 9;
AnalizadorParser.RCURLY = 10;
AnalizadorParser.LOG = 11;
AnalizadorParser.CONSOLE = 12;
AnalizadorParser.WHILE = 13;
AnalizadorParser.Point = 14;
AnalizadorParser.ADD = 15;
AnalizadorParser.RES = 16;
AnalizadorParser.MULT = 17;
AnalizadorParser.DIV = 18;
AnalizadorParser.BAJO = 19;
AnalizadorParser.INT = 20;
AnalizadorParser.ID = 21;
AnalizadorParser.WS = 22;

AnalizadorParser.RULE_program = 0;
AnalizadorParser.RULE_statement = 1;
AnalizadorParser.RULE_whileStatment = 2;
AnalizadorParser.RULE_assignmentStatement = 3;
AnalizadorParser.RULE_consoleStatement = 4;
AnalizadorParser.RULE_block = 5;
AnalizadorParser.RULE_expression = 6;
AnalizadorParser.RULE_simb = 7;
AnalizadorParser.RULE_term = 8;
AnalizadorParser.RULE_identifier = 9;

class ProgramContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_program;
    }

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterProgram(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitProgram(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitProgram(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class StatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_statement;
    }

	whileStatment() {
	    return this.getTypedRuleContext(WhileStatmentContext,0);
	};

	assignmentStatement() {
	    return this.getTypedRuleContext(AssignmentStatementContext,0);
	};

	consoleStatement() {
	    return this.getTypedRuleContext(ConsoleStatementContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class WhileStatmentContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_whileStatment;
    }

	WHILE() {
	    return this.getToken(AnalizadorParser.WHILE, 0);
	};

	LPAREN() {
	    return this.getToken(AnalizadorParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(AnalizadorParser.RPAREN, 0);
	};

	block() {
	    return this.getTypedRuleContext(BlockContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterWhileStatment(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitWhileStatment(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitWhileStatment(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class AssignmentStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_assignmentStatement;
    }

	identifier() {
	    return this.getTypedRuleContext(IdentifierContext,0);
	};

	EQ() {
	    return this.getToken(AnalizadorParser.EQ, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	SEMI() {
	    return this.getToken(AnalizadorParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterAssignmentStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitAssignmentStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitAssignmentStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ConsoleStatementContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_consoleStatement;
    }

	CONSOLE() {
	    return this.getToken(AnalizadorParser.CONSOLE, 0);
	};

	Point() {
	    return this.getToken(AnalizadorParser.Point, 0);
	};

	LOG() {
	    return this.getToken(AnalizadorParser.LOG, 0);
	};

	LPAREN() {
	    return this.getToken(AnalizadorParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(AnalizadorParser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(AnalizadorParser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterConsoleStatement(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitConsoleStatement(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitConsoleStatement(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class BlockContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_block;
    }

	LCURLY() {
	    return this.getToken(AnalizadorParser.LCURLY, 0);
	};

	RCURLY() {
	    return this.getToken(AnalizadorParser.RCURLY, 0);
	};

	statement = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(StatementContext);
	    } else {
	        return this.getTypedRuleContext(StatementContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterBlock(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitBlock(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitBlock(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ExpressionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_expression;
    }

	term = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(TermContext);
	    } else {
	        return this.getTypedRuleContext(TermContext,i);
	    }
	};

	simb = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SimbContext);
	    } else {
	        return this.getTypedRuleContext(SimbContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterExpression(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitExpression(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitExpression(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SimbContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_simb;
    }

	ADD() {
	    return this.getToken(AnalizadorParser.ADD, 0);
	};

	RES() {
	    return this.getToken(AnalizadorParser.RES, 0);
	};

	MULT() {
	    return this.getToken(AnalizadorParser.MULT, 0);
	};

	DIV() {
	    return this.getToken(AnalizadorParser.DIV, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterSimb(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitSimb(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitSimb(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TermContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_term;
    }

	identifier() {
	    return this.getTypedRuleContext(IdentifierContext,0);
	};

	INT() {
	    return this.getToken(AnalizadorParser.INT, 0);
	};

	LPAREN() {
	    return this.getToken(AnalizadorParser.LPAREN, 0);
	};

	expression() {
	    return this.getTypedRuleContext(ExpressionContext,0);
	};

	RPAREN() {
	    return this.getToken(AnalizadorParser.RPAREN, 0);
	};

	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterTerm(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitTerm(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitTerm(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class IdentifierContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = AnalizadorParser.RULE_identifier;
    }

	ID = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.ID);
	    } else {
	        return this.getToken(AnalizadorParser.ID, i);
	    }
	};


	INT = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.INT);
	    } else {
	        return this.getToken(AnalizadorParser.INT, i);
	    }
	};


	BAJO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(AnalizadorParser.BAJO);
	    } else {
	        return this.getToken(AnalizadorParser.BAJO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.enterIdentifier(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof AnalizadorListener ) {
	        listener.exitIdentifier(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof AnalizadorVisitor ) {
	        return visitor.visitIdentifier(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




AnalizadorParser.ProgramContext = ProgramContext; 
AnalizadorParser.StatementContext = StatementContext; 
AnalizadorParser.WhileStatmentContext = WhileStatmentContext; 
AnalizadorParser.AssignmentStatementContext = AssignmentStatementContext; 
AnalizadorParser.ConsoleStatementContext = ConsoleStatementContext; 
AnalizadorParser.BlockContext = BlockContext; 
AnalizadorParser.ExpressionContext = ExpressionContext; 
AnalizadorParser.SimbContext = SimbContext; 
AnalizadorParser.TermContext = TermContext; 
AnalizadorParser.IdentifierContext = IdentifierContext; 

export { AnalizadorParser };
