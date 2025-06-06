import antlr4 from 'antlr4';
import fs from 'fs';
import AnalizadorLexer from './generated/AnalizadorLexer.js';

// Leer el archivo de entrada
const input = fs.readFileSync('input.txt', 'utf-8');

// Crear el input stream y el lexer
const chars = new antlr4.InputStream(input);
const lexer = new AnalizadorLexer(chars);

// Obtener todos los tokens
const tokens = lexer.getAllTokens();
lexer.reset();

// Preparar los datos para la tabla
const rows = tokens.map(token => {
    const lexema = token.text;
    const tipo = AnalizadorLexer.symbolicNames[token.type];
    return { lexema, tipo };
});

// Calcular el ancho máximo de cada columna
const maxLexema = Math.max(...rows.map(r => r.lexema.length), 'Lexema'.length);
const maxTipo = Math.max(...rows.map(r => r.tipo.length), 'Token'.length);

// Funciones de ayuda
function center(text, width) {
    const padding = width - text.length;
    const left = Math.floor(padding / 2);
    const right = padding - left;
    return ' '.repeat(left) + text + ' '.repeat(right);
}

function padRight(text, width) {
    return text + ' '.repeat(width - text.length);
}

function drawLine() {
    return '+' + '-'.repeat(maxLexema + 2) + '+' + '-'.repeat(maxTipo + 2) + '+';
}

// Imprimir tabla
console.log(drawLine());
console.log(`| ${center('Lexema', maxLexema)} | ${center('Token', maxTipo)} |`);
console.log(drawLine());

rows.forEach(row => {
    console.log(`| ${padRight(row.lexema, maxLexema)} | ${padRight(row.tipo, maxTipo)} |`);
});

console.log(drawLine());
