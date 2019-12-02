package com.perry.pattern.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：
 *      封装作用于某数据结构（如List/Set/Map等）中的各元素的操作
 *      可以再不改变个元素的类的前提下，定义作用于这些元素的操作
 *      根据不同的visitor产生不同的操作行为
 * 类型：行为型
 * 适用场景：
 *      1.一个数据结构如（List/Set/Map等）包含很多类型对象
 *      2.数据结构（加载）与数据操作分离
 *
 * 优点：
 *      1.增加新的操作很容易，即增加一个新的访问者
 * 缺点：
 *      1.增加新的数据结构困难
 *      2.具体元素变更比较麻烦
 *
 * 相关设计模式：
 *      1.访问者模式（对保存在数据结构当中的数据进行某种特定的处理）和迭代器模式（逐个遍历保存在数据结构中的一些元素，重点是遍历）
 *
 * 案例：不同身份用户访问数据
 *
 * jdk案例：java.nio.FileVisitor、SimpleFileVisitor 文件访问者
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("七大基本原则");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("访问者模式");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList){
            course.accept(new Visitor());
        }
    }
}
