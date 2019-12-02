package com.perry.pattern.pattern.structural.composite;

/**
 * 组合模式：
 *      将对象组合成树形结构以表示"部分-整体"的层次结构
 *      组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * 类型：结构型
 *        node
 *     /    |    \
 *    |     |    |
 *  leaf  leaf  leaf
 *
 *  适用场景：
 *      1.希望客户可以忽略组合对象与单个对象的差异时
 *      2.处理一个树形结构时
 *
 *  优点：
 *      1.清楚地定义分层次的复杂对象，表示对象全部或部分层次
 *      2.让客户端忽略了层次的差异，方便对整个层次结构进行控制
 *      3.简化客户端代码
 *      4.符合开闭原则
 *
 *  缺点：
 *      1.限制类型时会较为复杂
 *      2.使设计变得更加抽象
 *
 *  相关设计模式：组合模式和访问者模式
 *
 *  案例：课程与课程目录
 *
 *  jdk案例：java.awt.Component、HashMap、ArrayList,MyBatis-SqlNode
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent javaCourse1 = new Course("Java一期",55);
        CatalogComponent javaCourse2 = new Course("Java二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(javaCourse1);
        javaCourseCatalog.add(javaCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();



    }
}
