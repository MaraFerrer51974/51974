import fs from 'fs';
import antlr4 from 'antlr4';

import { AnalizadorLexer } from './generated/AnalizadorLexer.js';
import { AnalizadorParser } from './generated/AnalizadorParser.js';
import { AnalizadorVisitor } from './generated/AnalizadorVisitor.js';

// Leer el archivo input.txt
const inputCode = fs.readFileSync('input.txt', 'utf8');
console.log("Código fuente:\n-----------------");
console.log(inputCode);
console.log("\nSalida del intérprete:\n-----------------");

// Intérprete
class Interpreter extends AnalizadorVisitor {
    constructor() {
        super();
        this.variables = {};
    }

    visitProgram(ctx) {
        return this.visitChildren(ctx);
    }

    visitStatement(ctx) {
        return this.visitChildren(ctx);
    }

    visitWhileStatment(ctx) {
    let condition = () => {
        const result = this.visit(ctx.expression());
        // Consideramos 0, false, null, undefined como falso
        return !!result;
    };
    while (condition()) {
        this.visit(ctx.block());
    }
}

    visitBlock(ctx) {
        for (let stmt of ctx.statement()) {
            this.visit(stmt);
        }
    }

    visitAssignmentStatement(ctx) {
        const varName = ctx.identifier().getText();
        const value = this.visit(ctx.expression());
        this.variables[varName] = value;
    }

    visitConsoleStatement(ctx) {
        const value = this.visit(ctx.expression());
        console.log(value);
    }

    visitExpression(ctx) {
        let result = this.visit(ctx.term(0));
        for (let i = 1; i < ctx.term().length; i++) {
            const op = ctx.simb(i - 1).getText();
            const right = this.visit(ctx.term(i));
            switch (op) {
                case '+': result += right; break;
                case '-': result -= right; break;
                case '*': result *= right; break;
                case '/': result /= right; break;
            }
        }
        return result;
    }

    visitTerm(ctx) {
    if (ctx.INT()) {
        return parseInt(ctx.INT().getText());
    } else if (ctx.identifier()) {
        const name = ctx.identifier().getText();
        if (!(name in this.variables)) {
            throw new Error(`Variable "${name}" no definida`);
        }
        return this.variables[name];
    } else if (ctx.expression()) {
        return this.visit(ctx.expression());
    }
}

}

// Procesar el input
const chars = new antlr4.InputStream(inputCode);
const lexer = new AnalizadorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new AnalizadorParser(tokens);
parser.buildParseTrees = true;

const tree = parser.program();
const interpreter = new Interpreter();
interpreter.visit(tree);
