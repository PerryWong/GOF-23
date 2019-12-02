package com.perry.pattern.pattern.creational.prototype;

/**
 * 原型模式：
 *      1.指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 *      2.不需要知道任何创建的细节，不调用构造函数
 * 类型：创建型
 *
 * 适用场景：
 *      1.类初始化消耗较多资源
 *      2.new产生的一个对象需要非常繁琐的过程（数据真被、访问权限等）
 *      3.构造函数比较复杂
 *      4.循环体中产生大量对象时
 *
 * 优点：
 *      1.原型模式性能比直接new一个对象性能高
 *      2.简化创建过程
 *
 * 缺点：
 *      1.必须配备克隆方法
 *      2.对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
 *      3.深拷贝、浅拷贝要运用得当
 *
 * 原型-扩展： 深克隆 & 浅克隆
 *
 * 案例：用户活动构建，发送活动消息给各个用户
 *
 * jdk案例：ArrayList，HashMap
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for(int i = 0;i < 10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@163.com");
            mailTemp.setContent("恭喜您，此次活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
