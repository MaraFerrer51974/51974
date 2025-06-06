grammar Analizador;

program :  (statement)* ;

statement:
        whileStatment
        | assignmentStatement
        | consoleStatement
        ;

whileStatment: WHILE LPAREN expression RPAREN block;

assignmentStatement: identifier EQ expression SEMI ;

consoleStatement: CONSOLE Point LOG LPAREN expression RPAREN SEMI ;

block: LCURLY (statement)* RCURLY ;

expression: term (simb term)* ;

simb : ADD
    | RES
    | MULT
    | DIV
    ;

term: identifier
    | INT
    | LPAREN expression RPAREN
    ;
    
identifier : ID (ID | INT | BAJO)* 
            ;

//LEXER

AND : 'and' ;
OR : 'or' ;
NOT : 'not' ;
EQ : '=' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;

LOG : 'log';
CONSOLE : 'console' ;
WHILE : 'while' ;
Point : '.' ;
ADD : '+';
RES : '-';
MULT : '*' ;
DIV : '/';
BAJO : '_' ;

INT : [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;
