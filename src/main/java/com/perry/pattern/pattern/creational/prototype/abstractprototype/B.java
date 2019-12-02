package com.perry.pattern.pattern.creational.prototype.abstractprototype;

/**
 * 通过抽象类，来实现原型模式
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
