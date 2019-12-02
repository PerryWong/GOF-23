package com.perry.pattern.pattern.behavioral.interpreter;

/**
 * 符号操作工具
 */
public class OperatorUtil {

    /**
     * 判断是否可操作
     *
     * @param symbol
     * @return
     */
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("*"));
    }

    /**
     * 获得解释对象
     *
     * @param firstExpression
     * @param secondExpression
     * @param symbol
     * @return
     */
    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
