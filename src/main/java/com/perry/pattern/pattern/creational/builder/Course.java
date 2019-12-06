package com.perry.pattern.pattern.creational.builder;

/**
 * 课程
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private Video courseVideo;
    private String courseArticle;

    //question & answer
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public Video getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(Video courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    public void playVideo() {
        if (courseVideo != null) {
            System.out.println("video " + courseVideo.getPath() + " 正在播放");
        } else {
            System.out.println("video为空 无法播放");
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
