package com.perry.pattern.pattern.behavioral.state;

/**
 * 状态模式：
 *      允许一个对象在其内部状态改变时，改变它的行为
 * 类型：行为型
 *
 * 适用场景：
 *      一个对象存在多个状态（不同状态下行为不同），且状态可相互转换
 *
 * 优点：
 *      1.将不同的状态隔离
 *      2.把各种状态的转换逻辑，分布到State的子类中，减少相互间依赖
 *      3.增加新的状态非常简单
 *
 * 缺点：
 *      状态多的业务场景导致类数目增加，系统变复杂
 *
 * 相关设计模式：
 *      状态模式和享元模式组合使用
 *
 * 案例：视频播放状态扭转
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();

        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

    }
}
