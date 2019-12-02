package com.perry.pattern.pattern.behavioral.interpreter;

/**
 * 解释器模式：
 *      给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 *      为了解释一种语言，而为语言创造的解释器
 * 类型：行为型
 *
 * 适用场景：
 *      某个特定类型问题发生频率足够高
 * 优点：
 *      语法由很多类表示，容易改变及扩展此"语言"
 * 缺点：
 *      当语法规则数目太多时，增加了系统复杂度
 * 相关设计模式：
 *      解释器模式和适配器模式（不需要预先知道规则）
 *
 * jdk源码案例：Pattern
 */
public class Test {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        PerryExpressionParser expressionParser = new PerryExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println(String.format("解释器计算结果: %d", result));
    }
}
