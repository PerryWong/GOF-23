package com.perry.pattern.pattern.behavioral.strategy;

/**
 * 满减促销策略
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
