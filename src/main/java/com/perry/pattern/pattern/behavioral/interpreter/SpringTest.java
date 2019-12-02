package com.perry.pattern.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring中的解释器功能案例
 */
public class SpringTest {
    public static void main(String[] args) {
        // 生成spring解释语言解释器
        org.springframework.expression.ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 66");
        int result = (Integer) expression.getValue();
        System.out.println(result);
    }
}
