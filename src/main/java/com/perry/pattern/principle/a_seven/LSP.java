package com.perry.pattern.principle.a_seven;

/**
 * LSP: Liskov Substitution Principle
 * 里氏替换原则
 *
 * 任何能使用父类对象的地方，都应该能透明地替换为子类对象。防止了继承泛滥。
 *     也就是说，子类对象可以随时随地地替换父类的对象，且替换完以后，语法不会报错，业务逻辑也不会出现问题！
 *     < 方法重写：在子类和父类中，出现了返回类型相同、方法名相同、方法参数相同的方法时、构成方法重写。
 *        方法重写的两个限制：
 *          1. 子类重写父类的方法时，子类方法的访问修饰符不能比父类的更严格
 *          2. 子类重写父类的方法时，子类方法不能抛出比父类更多的异常
 *     为什么要有以上这2个限制，就是为了保证，在子类对象替换父类对象后，语法不会报错！代码符合里氏替换原则 >
 *     < 继承的作用：
 *             1. 提高代码的重用性。
 *             2. 多态的前提。
 *         两个类能不能发生继承关系的依据是什么？
 *             a. 主要看有没有“is a”关系
 *             b. 在两个类有了“is a”关系之后，还要考虑子类对象在替换了父类对象之后，业务逻辑是否变化！如果变化，则不能发生继承关系。（正方形与长方形示例）>
 */
public class LSP {
    static class Square {
        private double sideLength;

        public double getSideLength() {
            return sideLength;
        }

        public void setSideLength(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public String toString() {
            return "Square{" +
                    "sideLength=" + sideLength +
                    '}';
        }
    }

    static class Rectangle {
        private double length;
        private double width;

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return "Rquare{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }
    }

    static class Utils {
        public static void transform(Rectangle r) {
            while (r.getWidth() <= r.getLength()) {
                r.setWidth(r.getWidth() + 1);
                System.out.println("width = " + r.getWidth() + " length = " + r.getLength());
            }
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(12);
        r.setLength(20);
        Utils.transform(r);
    }
}
