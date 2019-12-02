package com.perry.pattern.pattern.behavioral.chain;

/**
 * 批准者
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
