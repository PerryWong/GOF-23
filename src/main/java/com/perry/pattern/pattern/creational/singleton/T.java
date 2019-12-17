package com.perry.pattern.pattern.creational.singleton;

/**
 * Created by geely
 */
public class T implements Runnable {
    @Override
    public void run() {
        HungrySingleton instance = HungrySingleton.getInstance();
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");

//        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread().getName()+"  "+instance);

    }
}
