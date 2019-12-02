package com.perry.pattern.pattern.behavioral.interpreter;

/**
 * 加法解释器
 */
public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter() + this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
