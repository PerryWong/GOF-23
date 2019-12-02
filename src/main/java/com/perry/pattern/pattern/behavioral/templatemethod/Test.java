package com.perry.pattern.pattern.behavioral.templatemethod;

/**
 * 模板方法模式：
 *      定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现
 *      模板方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
 * 类型：行为型
 *
 * 适用场景：
 *      1.一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
 *      2.各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
 * 优点：
 *      1.提高复用性
 *      2.提高扩展性
 *      3.符合开闭原则
 * 缺点：
 *      1.类数目增加
 *      2.增加了系统实现的复杂度
 *      3.继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要改一遍
 *
 *  扩展：
 *      钩子方法（提供了缺省的行为，子类可以在必要时进行扩展）
 *
 *  相关设计模式：
 *      1.模板方法模式和工厂方法模式（是模板的一种特殊实现）
 *      2.模板方法模式（是针对定义一个算法的流程，而将一些不太一样的具体实现步骤交给子类实现，是不改变算法的流程的）
 *          和策略模式（目的使不同算法相互替换，且不影响应用层使用，可以改变算法流程）都有封装算法
 *
 *  jdk案例：
 *      AbstractList/Set/Map、HttpServlet、MyBatis-BaseExecutor
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式课程start---");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程end---");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


    }
}
