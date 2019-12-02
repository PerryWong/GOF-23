package com.perry.pattern.pattern.behavioral.mediator;

/**
 * 中介者模式：
 *      定义一个 封装一组对象 如何交互的对象
 *      通过使对象明确地相互引用来促进松散耦合，并允许独立地改变他们的交互
 * 类型：行为型
 *
 * 适用场景：
 *      1.系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
 *      2.交互的公共行为，如果需要改变行为则可以增加新的中介者类
 *
 * 优点：
 *      1.将一对多转化成了一对一、降低程序复杂度
 *      2.类之间的解耦
 * 缺点：
 *      1.中介者过多，导致系统复杂
 *
 * 相关设计模式：
 *      1.中介者模式和观察者模式结合使用
 *
 * 案例：聊天室
 *
 * jdk案例：java.util.Timer-schedule-sched方法
 */
public class Test {
    public static void main(String[] args) {
        User jerry = new User("Jerry");
        User tom = new User("Tom");

        jerry.sendMessage(" Hey! Tom! I'm here! ");
        tom.sendMessage(" Yep, I'll catch U!");
    }
}
