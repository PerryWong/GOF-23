package com.perry.pattern.pattern.behavioral.command;

/**
 * 课程视频
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "视频开放");
    }

    public void close() {
        System.out.println(this.name + "视频关闭");
    }
}
