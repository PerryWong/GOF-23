package com.perry.pattern.pattern.behavioral.observer;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * 老师
 * 观察者
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 并发过高时，要通过消息队列或其他异步手段进行处理
     *
     * @param o   被观察的对象
     * @param arg 传递的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答" + question.getQuestionContent());
    }

    // 通过EventBus实现
    @Subscribe
    public void updateEvent(Question arg) {
        Question question = arg;
        System.out.println(teacherName + "老师接收到一个" + question.getUserName() + "提交的问答" + question.getQuestionContent());
    }
}
