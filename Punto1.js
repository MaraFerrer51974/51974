import fs from 'fs';
import antlr4 from 'antlr4';
import AnalizadorLexer from './generated/AnalizadorLexer.js';
import AnalizadorParser from './generated/AnalizadorParser.js';

// Leer contenido del archivo input.txt (asegurate que esté en UTF-8)
const inputText = fs.readFileSync('input.txt', 'utf8');

// Crear flujo de entrada
const chars = new antlr4.InputStream(inputText);

// Crear lexer
const lexer = new AnalizadorLexer(chars);

// Crear buffer de tokens
const tokens = new antlr4.CommonTokenStream(lexer);

// Crear parser
const parser = new AnalizadorParser(tokens);

// Contenedor para errores
let errores = [];

// Sobrescribir manejador de errores para capturarlos
parser.removeErrorListeners();
parser.addErrorListener({
syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
    errores.push(`Error en línea ${line}, columna ${column}: ${msg}`);  }
});

parser.buildParseTrees = true;
parser.program();

if (errores.length === 0) {
console.log("Código válido");
} else {
console.log("Errores encontrados:");
errores.forEach(e => console.log(e));
}

