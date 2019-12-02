package com.perry.pattern.pattern.behavioral.visitor;

/**
 * 访问者
 */
public interface IVisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
