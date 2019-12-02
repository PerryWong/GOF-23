package com.perry.pattern.principle.a_seven;

/**
 * LKP: Least Knowledge Principle
 * 迪米特法则（Law of Demeter）
 *
 *  一个类，对于其他类，保持最少的了解。尽量降低类与类之间的耦合。
 *  只和朋友通信，不和陌生人说话。（对朋友怎么操作都不为过）
 *     什么是朋友：
 *      a. 类中的字段
 *      b. 方法的参数
 *      c. 方法的返回值
 *      d. 方法中实例化出来的对象
 *     什么不是朋友：
 *      通过方法中的参数get到的对象就不是朋友（方法内部的类）
 *
 * 优点：降低类之间的耦合
 */
public class LKP {
    static class Computer {
        private void saveData() {
            System.out.println("保存数据");
        }

        private void killProcess() {
            System.out.println("关闭程序");
        }

        private void closeScreen() {
            System.out.println("关闭屏幕");
        }

        private void powerOff() {
            System.out.println("断电");
        }

        public void shutdown() {
            saveData();
            killProcess();
            closeScreen();
            powerOff();
        }
    }

    static class Person {
        private Computer c = new Computer();

        public void shutdownComputer() {
            c.shutdown();
        }
    }
}
