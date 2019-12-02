package com.perry.pattern.pattern.behavioral.observer;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");

        /*Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("Perry");
        question.setQuestionContent("那撸多");

        eventBus.register(teacher);
        eventBus.post(question);*/
    }
}
