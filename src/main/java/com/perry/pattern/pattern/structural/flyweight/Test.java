package com.perry.pattern.pattern.structural.flyweight;

/**
 * 享元模式：
 *      提供了减少对象数量，从而改善应用所需的对象结构的方式
 *      运用共享技术有效地支持大量细粒度的对象
 * 类型：结构型
 *
 * 适用场景：
 *      1.常常应用于系统底层的开发，以便解决系统的性能问题（如String类）
 *      2.系统有大量相似对象、需要缓冲池的场景
 *
 * 优点：
 *      1.减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 *      2.减少内存之外的其他资源占用
 *
 * 缺点：
 *      1.关注内/外部状态、关注线程安全问题
 *      2.使系统、程序的逻辑复杂化
 *
 * 扩展：
 *      1.内部状态---指在享元对象的内部并且不会随着环境改变而改变的共享部分（类似属性）
 *      2.外部状态---不可共享的状态，记录在享元对象的外部，会随着环境改变而改变（类似调用方法传参）
 *
 * 相关设计模式：
 *      1.享元模式和代理模式
 *      2.享元模式和单例模式
 *
 * 案例：年底总结报告
 *
 * jdk源码案例：Integer、Tomcat-GenericObjectPool
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        // 年底报告案例
        for(int i=0; i<10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }

        // jdk案例
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));

        System.out.println("c==d:"+(c==d));

    }
}
