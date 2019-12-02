package com.perry.pattern.pattern.behavioral.visitor;

/**
 * 免费课程
 */
public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        // 可以在此处限制权限
        visitor.visit(this);
    }
}
