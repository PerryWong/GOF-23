package com.perry.pattern.pattern.behavioral.command;

/**
 * 命令模式：
 *      将"请求"封装成对象，以便使用不同的请求
 *      命令模式解决了应用程序中对象的职责以及他们之间的通信方式
 * 类型：行为型
 * 适用场景：
 *      1.请求调用者和请求接收者需要解耦，使得调用者和接收者不直接交互
 *      2.需要抽象出等待执行的行为
 *
 * 优点：
 *      1.降低耦合
 *      2.容易扩展新命令或一组命令
 * 缺点：
 *      1.命令的无限扩展会增加类的数量，提高系统实现复杂度
 * 相关设计模式：
 *      命令模式和备忘录模式结合使用
 * 案例：员工执行视频打开关闭命令
 *
 * jdk案例：Runnable、junit.FrameWork.Test & TestCase
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("命令模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
