package com.perry.pattern.principle.a_seven;

/**
 * DIP: Dependence Inversion Principle
 * 依赖倒置原则
 *
 * 上层不能依赖于下层，他们都应该依赖于抽象。
 *  什么是上层？什么是下层？
 *      调用别的方法的，就是上层，被其他方法调用的，就是下层。
 * 抽象不应该依赖于细节，细节应该依赖抽象
 * 针对接口编程，不要针对实现编程
 * 不要依赖于具体，要依赖于抽象。
 *
 * 优点：减少类间的耦合性、提高系统稳定性、提高代码可读性和可维护性，可降低修改程序所造成的风险
 *
 * 案例：人喂动物，无论喂多少种动物，人都只需要知道动物可以吃，而不需要依赖于每一种动物
 */
public class DIP {

    static class Person {
        public void feed(Animal animal) {
            animal.eat();
        }
    }

    interface Animal {
        void eat();
    }

    static class Dog implements Animal {

        @Override
        public void eat() {
            System.out.println("狗吃shi");
        }
    }

    // 上层
    // =================================================
    // 下层
    // 无论有多少种动物出现，只要实现animal接口，上层都不需要知道，可直接使用

    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        person.feed(dog);
    }

}
