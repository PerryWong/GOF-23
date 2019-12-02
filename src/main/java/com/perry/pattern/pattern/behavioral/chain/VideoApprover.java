package com.perry.pattern.pattern.behavioral.chain;

import org.apache.commons.lang.StringUtils;

/**
 * 视频批准者
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不包含有视频，不批准，流程结束");
            return;
        }
    }
}
