package com.perry.pattern.pattern.behavioral.interpreter;

/**
 * 乘法解释器
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter() * this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }

}
