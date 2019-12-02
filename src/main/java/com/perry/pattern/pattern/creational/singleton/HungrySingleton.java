package com.perry.pattern.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式
 * 线程不安全
 */
public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 该方法通过源码反射方法调用
     * 解决序列化与反序列化时返回对象非单例对象
     * 但该模式下仍会创建对象，只是返回了单例对象
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
