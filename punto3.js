import antlr4 from 'antlr4';
import fs from 'fs';
import AnalizadorLexer from './generated/AnalizadorLexer.js';
import AnalizadorParser from './generated/AnalizadorParser.js';

const TerminalNode = antlr4.tree.TerminalNode;

// Leer archivo de entrada
const input = fs.readFileSync('input.txt', 'utf-8');
const chars = new antlr4.InputStream(input);
const lexer = new AnalizadorLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new AnalizadorParser(tokens);
parser.buildParseTrees = true;

// Obtener árbol desde la regla inicial
const tree = parser.program();

// Función para imprimir el árbol
function printTree(node, indent = '') {
    const ruleNames = parser.ruleNames;
    const nodeText = getNodeText(node, ruleNames);
    console.log(indent + nodeText);

    if (node.children) {
        for (const child of node.children) {
            printTree(child, indent + '  ');
        }
    }
}

function getNodeText(node, ruleNames) {
    if (node instanceof TerminalNode) {
        return `'${node.getText()}'`;
    } else {
        const ruleIndex = node.ruleIndex;
        const ruleName = ruleNames[ruleIndex] || `rule_${ruleIndex}`;
        return ruleName;
    }
}

// Imprimir árbol sintáctico
console.log('Árbol de análisis sintáctico:\n');
printTree(tree);
