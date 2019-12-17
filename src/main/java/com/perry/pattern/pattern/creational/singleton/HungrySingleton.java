package com.perry.pattern.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉式
 * 提前消耗内存
 * 线程安全，类加载时已初始化好单例
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
