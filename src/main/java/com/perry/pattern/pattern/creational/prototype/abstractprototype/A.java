package com.perry.pattern.pattern.creational.prototype.abstractprototype;

/**
 * 抽象原型，实现Cloneable接口
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
