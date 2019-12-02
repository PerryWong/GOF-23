package com.perry.pattern.pattern.creational.simplefactory;

/**
 * Simple Factory
 * 简单工厂：
 *      由一个工厂对象决定创建出哪一种产品类的实例
 * 类型：创建型，但不属于GOF23种设计模式
 *
 * 适用场景：
 *      1.工厂类负责创建的对象比较少
 *      2.客户端（应用层）只知道传入工厂类的参数对于如何创建对象（逻辑）不关心
 *
 * 优点：
 *      只需要传入一个正确的参数，就可以获取你所需要的对象而且无须知道其创建细节(面向接口编程)
 *
 * 缺点：
 *      1.工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则
 *      2.无法形成基于继承的等级结构
 *
 * JDK源码案例：Calendar下的createCalendar方法
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();



    }

}
