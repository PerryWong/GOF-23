package com.perry.pattern.pattern.creational.builder;

/**
 * 视频
 */
public class Video {
    private String path;

    public Video(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Video{" +
                "path='" + path + '\'' +
                '}';
    }
}
