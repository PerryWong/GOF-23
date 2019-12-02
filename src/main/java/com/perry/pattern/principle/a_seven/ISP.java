package com.perry.pattern.principle.a_seven;

import java.util.List;
import java.util.Map;

/**
 * ISP: Interface Segregation Principle
 * 接口隔离原则
 *  用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口。
 *
 *      1.避免制造一个总接口，要把他们分成一个个小接口。
 *      2.客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。
 *      3.避免职责耦合，尽量细化接口，接口中的方法尽量少
 *      4.注意适度原则，一定要适度
 *
 *  优点：符合我们常说的高内聚低耦合的设计思想
 *      从而使得类具有很好的可读性、可扩展性和可维护性。
 *
 *  案例：Dao增删改查，对不同对象进行CRUD操作后，导致每一个不同类别的对象在实现接口时，需要实现无用接口
 */
public class ISP {
    public static void main(String[] args) {

    }

    public interface Eatable {
        void eat();

    }

    public interface Flyable {
        void fly();

    }

    public interface Swimable {
        void swim();

    }

    class Dog implements Eatable, Swimable {

        @Override
        public void eat() {
            System.out.println("吃");
        }

        @Override
        public void swim() {
            System.out.println("狗刨");
        }
    }

    class Bird implements Eatable, Flyable {

        @Override
        public void eat() {
            System.out.println("啄");
        }

        @Override
        public void fly() {
            System.out.println("飞就完事了");
        }
    }

    public interface Dao<T>{
        void create(T bean);
        void delete(long id);
        void update(T bean);
        List<T> retrieve(Map<String, Object> params);
    }
}
