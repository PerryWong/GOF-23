package com.perry.pattern.pattern.behavioral.chain;

/**
 * 责任链模式：
 *      为请求创建一个接收此次请求对象的链
 *
 * 类型：行为型
 *
 * 适用场景：
 *      1.一个请求的处理需要多个对象当中的一个或几个协作处理
 * 优点：
 *      1.请求的发送者和接收者（请求的处理）解耦
 *      2.责任链可以动态组合
 * 缺点：
 *      1.责任链太长或者处理时间过长，影响性能
 *      2.责任链有可能过多
 *
 * 相关设计模式：
 *      责任链模式（各个对象并不指定下一个处理的对象者是谁，只有在客户端来设定链条的顺序以及元素，直到被某个责任链元素处理或者整个链条结束）和
 *      状态模式（让每个状态对象直到自己下一个处理的对象是谁，在编译时就设定好了）
 *
 * 案例：课程批准上线流程
 *
 * jdk案例：javax.servlet.Filter & FilterChain
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("责任链模式");
        course.setArticle("责任链模式手记");
        course.setVideo("责任链模式视频");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
