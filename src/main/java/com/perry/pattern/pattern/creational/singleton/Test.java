package com.perry.pattern.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 *      保证一个类仅有一个实例，并提供一个全局访问点
 * 类型：创建型
 *
 * 适用场景：想确保任何情况下都绝对只有一个实例
 *
 * 优点：
 *      1.在内存里只有一个实例，减少了内存开销
 *      2.可以避免对资源的多重占用
 *      3.设置全局访问点，严格控制访问
 *
 * 缺点：
 *      没有接口扩展困难
 *
 * 重点：
 *      1.私有构造器
 *      2.线程安全
 *      3.延迟加载
 *      4.序列化和反序列化安全
 *      5.反射
 *
 * 实用技能：
 *      1.反编译 https://varaneckas.com/jad/
 *          找到想要编译的class文件路径直接执行 [jad 类名.class] 具体参数查看文档
 *          生成反编译文件 类名.jad
 *      2.内存原理
 *      3.多线程Debug
 *
 * 相关设计模式：
 *      1.单例模式和工厂模式
 *      2.单例模式和享元模式
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        /*System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());
        System.out.println("main thread" + ThreadLocalInstance.getInstance());*/

        /**
         * 测试单例模式线程安全
         */
        /*Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");*/

        /**
         * 序列化与反序列化，反射攻击破坏单例模式
         */
        // 饿汉式
        /*HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) startSerializeAttacks(instance);
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        // 枚举式
        /*EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        EnumInstance newInstance = (EnumInstance) startSerializeAttacks(instance);

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());*/

        /**
         * 序列化与反序列化，反射攻击破坏单例模式
         * 解决方案
         */
//        Class objectClass = HungrySingleton.class;

//        Class objectClass = StaticInnerClassSingleton.class;

//        Class objectClass = LazySingleton.class;

//        Class objectClass = EnumInstance.class;

        // 反射攻击
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();

//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();

//        EnumInstance instance = (EnumInstance) constructor.newInstance("Geely",666);

//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        /**
         * 枚举类方法调用
         */
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();


    }

    /**
     * 开启反射攻击
     * 序列化与反序列化单例对象
     *
     * @param instance
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object startSerializeAttacks(Object instance) throws IOException, ClassNotFoundException {
        // 输入流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        // 流写入对象
        oos.writeObject(instance);

        File file = new File("singleton_file");
        // 输出流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 反序列化 读取流 read时对单例对象进行破坏，通过反射产生对象实例
        return ois.readObject();
    }

    /**
     * 开启反射攻击
     * 通过构造器方法打开权限获取实例
     *
     * @param objectClass
     * @return
     */
    public static Object startReflectorAttacks(Class objectClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获得构造器
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 打开私有构造器权限
        constructor.setAccessible(true);

        // 构造器产生对象返回
        return constructor.newInstance();
    }


}
