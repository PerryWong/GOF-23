package com.perry.pattern.pattern.structural.decorator.v1;

/**
 * 装饰者模式：
 *      在不改变原有对象的基础之上，将功能附加到对象身上
 *      提供了比继承更优弹性的替代方案（扩展原有对象功能）
 * 类型：结构型
 *
 * 适用场景：
 *      1.扩展一个类的功能或给一个类添加附加职责
 *      2.动态的给一个对象添加功能，这些功能可以再动态的撤销
 *
 * 优点：
 *      1.继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能（动态的）
 *      2.通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
 *      3.符合开闭原则
 *
 * 缺点：
 *      1.会出现更多的代码，更多的类，增加程序复杂性
 *      2.动态装饰时，多层装饰时会更复杂
 *
 * 相关设计模式：
 *      1.装饰者模式（一个对象上动态的添加方法）和代理模式（控制对对象的访问）
 *      2.装饰者模式和适配器模式
 *
 * 案例：煎饼+蛋+肠
 *
 * jdk案例：BufferedReader,BufferedInputStream
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格:"+battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格:"+battercakeWithEggSausage.cost());


    }
}
