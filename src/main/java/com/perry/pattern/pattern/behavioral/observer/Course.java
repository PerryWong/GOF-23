package com.perry.pattern.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 课程
 * 被观察者
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个问题");
        setChanged(); // 设置发生变化
        notifyObservers(question); // 提醒观察者
    }
}
