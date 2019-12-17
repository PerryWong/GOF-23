package com.perry.pattern.pattern.creational.singleton;

/**
 * 基于类初始化的延迟加载解决方案
 * 静态内部类单例模式
 * 延时加载，节省资源
 *
 * JVM在类的初始化阶段，class加载后被线程使用之前都是类的初始化阶段，在该阶段会执行类的初始化，
 * 在执行类的初始化期间，JVM会获取锁，该锁用以同步多个线程对一个类的初始化，
 * 基于此特性，我们可以实现基于静态内部类的，并且是线程安全的延迟初始化方案
 */
public class StaticInnerClassSingleton {
    // inner class 的初始化锁是该方案的关键
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
