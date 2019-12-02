package com.perry.pattern.pattern.creational.factorymethod;

/**
 * Factory Method
 * 工厂方法
 *      定义一个创建对象的接口，但让实现这个接口的类来做决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 *
 * 类型：创建型
 *
 * 适用场景：
 *      1.创建对象需要大量重复的代码
 *      2.客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
 *      3.一个类通过其子类来指定创建哪个对象
 *
 * 优点：
 *      1.用户只需要关心所需产品对应的工厂，无须关心创建细节
 *      2.加入新产品符合开闭原则，提高可扩展性
 *
 * 缺点：
 *      1.类的个数容易过多，增加复杂度
 *      2.增加了系统的抽象性和理解难度
 *
 * JDK源码案例：
 *      1.Collection的iterator抽象方法由子类ArrayList实现
 *      2.URLStreamHandlerFactory解决url协议扩展使用,由Launcher的Factory私有类实现
 *      3.ILoggerFactory
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}
