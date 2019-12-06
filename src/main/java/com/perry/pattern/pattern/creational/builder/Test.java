package com.perry.pattern.pattern.creational.builder;

/**
 * Builder
 * 建造者模式
 *      1.将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 *      2.用户只需指定需要构造的类型就可以得到他们，建造过程及细节不需要知道
 *
 * 类型：创建型
 *
 * 适用场景：
 *      1.如果一个对象有非常复杂的内部结构（很多属性）
 *      2.想把复杂对象的创建和使用分离（对象的创建比较复杂）
 *
 * 优点：
 *      1.封装性好，创建和使用分离
 *      2.扩展性好、建造类之间独立、一定程度上解耦
 *
 * 缺点：
 *      1.产生多余的builder对象
 *      2.产品内部发生变化，建造者都要修改，成本较大
 *
 * 案例：创建课程及属性赋值
 *
 * jdk案例：StringBuilder线程不安全，StringBuffer线程安全，ImmutableSet,CacheBuilder,SqlSessionFactory
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
