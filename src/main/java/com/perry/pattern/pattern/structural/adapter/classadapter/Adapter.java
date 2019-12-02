package com.perry.pattern.pattern.structural.adapter.classadapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
