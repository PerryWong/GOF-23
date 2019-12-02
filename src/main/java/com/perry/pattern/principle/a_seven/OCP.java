package com.perry.pattern.principle.a_seven;

/**
 * OCP: Open Closed Principle
 * 开闭原则：面向抽象编程
 *    用抽象构建框架，用实现扩展细节
 *    优点：提高软件系统的课复用性及可维护性
 *  a. 对扩展新功能是开放的
 *  b. 对修改原有功能是关闭的
 *     比如：
 *         有一个刮胡刀，刮胡刀的作用就是刮胡子，现在想让刮胡刀具备吹分机能力。
 *         违反开闭原则的做法就是：把吹风功能加上了，可能不能刮胡子了。
 *         符合开闭原则的做法就是：吧吹风功能加上了，且没有影响以前的刮胡子功能。
 *     补充：
 *         如果，一个类，从头到尾，都是你自己创建编写的，那么你可以随时随地的修改源代码，因为作者就是你！
 *         如果，一个类，不是你写的，而是别人写的，就不能修改别人的代码了，而要符合开闭原则。
 *  案例：汽车价格打折
 */
public class OCP {
    public static void main(String[] args) {
        Car car = new DiscountCar();
        car.setPrice(111213.33);
        System.out.println(car.getPrice());
    }

    static class Car {
        private String name;
        private String desc;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    static class DiscountCar extends Car {
        public double getPrice() {
            return super.getPrice() * 0.8;
        }
    }
}
