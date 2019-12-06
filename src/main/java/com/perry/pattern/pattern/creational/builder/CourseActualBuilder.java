package com.perry.pattern.pattern.creational.builder;

/**
 * 课程真实建造者
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();


    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    /**
     * 此处传入地址为序列图地址
     * 该方法需要将序列图转化为视频
     *
     * @param courseVideoPath 序列图地址
     */
    @Override
    public void buildCourseVideo(String courseVideoPath) {
        // 序列图经过处理，生成视频地址(如使用FFmpeg框架进行命令行操作生成)
        String videoPath = courseVideoPath + ".mp4";
        // 将生成的地址传入video
        Video video = new Video(videoPath);
        course.setCourseVideo(video);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
