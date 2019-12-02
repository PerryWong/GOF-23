package com.perry.pattern.pattern.behavioral.strategy;

/**
 * 策略模式：
 *      1.定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户。
 *      2.解决if...else..
 *
 * 类型：行为型
 *
 * 适用场景：
 *      1.系统有很多类，而他们的区别仅仅在于他们的行为不同
 *      2.一个系统需要动态地在集中算法中选择一种
 *
 * 优点：
 *      1.开闭原则
 *      2.避免是用哪个多重条件转移语句
 *      3.提高算法的保密性和安全性
 *
 * 缺点：
 *      1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 *      2.产生很多策略类
 *
 * 相关设计模式：
 *      1.策略模式（接受创建好的对象从而实现不同的行为）和工厂模式（接收指令创建出符合要求的对象）
 *      2.策略模式（客户端需要知道选择哪个模式）和状态模式（客户端不需要关心具体的状态，状态会自动转换）
 */
public class Test {
    /*public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }*/

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = null;

        String promotionKey = "LIJIAN";

        if (StringUtils.equals(promotionKey,"LIJIAN")){
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        }else if (StringUtils.equals(promotionKey,"FANXIAN")){
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }//......
        promotionActivity.executePromotionStrategy();
    }*/

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
