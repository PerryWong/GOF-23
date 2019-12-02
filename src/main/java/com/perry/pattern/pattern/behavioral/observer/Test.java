package com.perry.pattern.pattern.behavioral.observer;

/**
 * 观察者模式：
 *      定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，
 * 当主题对象发生变化时，它的所有依赖者（观察者）都会收到通知并更新。
 *
 * 类型：行为型
 *
 * 适用场景：
 *      关联行为场景，建立一套触发机制
 * 优点：
 *      1.观察者和被观察者之间建立一个抽象的耦合
 *      2.观察者模式支持广播通信
 * 缺点：
 *      1.观察者之间有过多的细节依赖，提高时间消耗及程序复杂度
 *      2.使用要得当，要避免循环调用
 *
 * jdk案例：java.awt.Event
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("Perry");
        question.setQuestionContent("啥是gay");

        course.produceQuestion(course, question);
    }
}
