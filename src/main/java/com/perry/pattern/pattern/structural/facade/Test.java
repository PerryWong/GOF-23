package com.perry.pattern.pattern.structural.facade;

/**
 * 外观模式：
 *      又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口
 *      外观模式定义了一个高层接口，让子系统更容易使用
 * 类型：结构型
 *
 * 适用场景：
 *      1.子系统越来越复杂，增加外观模式提供简单调用接口
 *      2.构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 *
 * 优点：
 *      1.简化了调用过程，无需了解深入子系统，防止带来风险
 *      2.减少系统依赖、松散耦合
 *      3.更好的划分访问层次
 *      4.符合迪米特法则，即最少知道原则
 *
 * 缺点：
 *      1.增加子系统、扩展子系统行为容易引入风险
 *      2.增加扩展时-不符合开闭原则
 *      （根据业务场景选择使用抽象外观类-经常变动，还是实体外观类-不常变动）
 *
 * 相关设计模式：
 *      1.外观模式（外界与子系统的交互）和中介者模式（子系统内部之间的交互）
 *      2.外观模式和单例模式常结合使用（将外观对象做成单例模式）
 *      3.外观模式和抽象工厂模式常结合使用（外观类通过抽象工厂获得子系统实例，这样子系统可以将内部对外观类进行屏蔽）
 *
 * 案例：积分兑换礼物
 *
 * 源码案例：SpringMVC-JdbcUtil,MyBatis-Configuration,Tomcat源码-RequestFacade
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
