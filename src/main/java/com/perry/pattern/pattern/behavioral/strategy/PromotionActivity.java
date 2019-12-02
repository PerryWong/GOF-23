package com.perry.pattern.pattern.behavioral.strategy;

/**
 * 促销活动
 * 可以作为课程的一个成员变量
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
