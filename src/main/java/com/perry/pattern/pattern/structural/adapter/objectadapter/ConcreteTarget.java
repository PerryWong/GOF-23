package com.perry.pattern.pattern.structural.adapter.objectadapter;


/**
 * 目标实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
