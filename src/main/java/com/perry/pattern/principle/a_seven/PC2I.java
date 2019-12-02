package com.perry.pattern.principle.a_seven;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * PC2I: prefer composition to inheritance
 * 组合优于继承原则
 *
 * 继承就是一个类继承另外一个类，
 * 我们已经知道，类和类之间有3种关系：
 *     a. 继承
 *     b. 依赖
 *     c. 关联
 *         “关联”可以细分为：
 *             1. 组合
 *             2. 聚合
 *         所谓的组合，是关系强，聚合是关系弱。
 *
 *     如果父类作者，和子类的作者，不是同一个人。就别继承。
 *     那么父类作者，不知道，未来的子类，会重写自己的哪个方法。
 *     那么子类作者，不知道，未来的父类，会加入什么新方法。
 *     如果父类作者，和子类的作者，就是同一个人，那就可以放开手脚去使用继承了！
 *     自己当然知道，每个方法都是什么作用。作者可以同时控制父类和子类。
 *     我们自己写代码，继承，重写，随便使用。
 *     如果我们仅仅是为了复用代码，而继承别人的类，难免出现“沟通”上的问题。
 *     为了多态使用继承，为了复用使用继承。
 */
public class PC2I {

    /**
     * 计数添加总次数Set
     */
    static class CounterSet {
        private Set set = new HashSet();
        private int count = 0;

        /**
         * 直接修改源码方法，会撼动整个架构
         * jdk修改，产生未知影响
         * 1 直接在add方法中计数 jdk源码中addAll中调用add方法（万一源码更新后更改addAll方法不使用add方法，则代码崩溃）
         * 2 修改addAll方法 必须调用add方法 （万一源码添加了其他addSome方法，则代码崩溃）
         * 3 额外制作2个代替 add与addAll的方法（万一源码添加了同名方法，则代码崩溃，且违反最少知道原则）
         */


        public boolean add(Object o) {
            count++;
            return set.add(o);
        }

        public boolean addAll(Collection c) {
            boolean bb = false;
            for (Object obj : c) {
                if (add(obj)) {
                    bb = true;
                }
            }
            return bb;
        }

        public int getCount() {
            return count;
        }

    }

}
