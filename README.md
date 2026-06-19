# Arithmetic Expression Stack Analyzer

Java project that uses a custom stack with nodes to validate parentheses in arithmetic expressions.

## Structure

- Nodo.java
- Pila.java
- AnalizadorExpresiones.java
- Main.java

## How it works

The program checks if the parentheses in an arithmetic expression are balanced.

When it finds `(`, it adds it to the stack with `push()`.

When it finds `)`, it removes the last open parenthesis with `pop()`.

If the stack is empty at the end, the expression is valid.

## Examples

Valid:

(A+B)

((A+B)*C)

Invalid:

(A+B

A+B)

## Classes

- `Nodo`: represents a node in the stack.
- `Pila`: manages stack operations.
- `AnalizadorExpresiones`: validates the expression.
- `Main`: contains the menu.

## Author

Sebastián Salas Hernández
