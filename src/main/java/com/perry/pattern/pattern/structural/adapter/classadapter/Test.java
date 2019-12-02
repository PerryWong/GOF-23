package com.perry.pattern.pattern.structural.adapter.classadapter;

/**
 * 类适配器
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
