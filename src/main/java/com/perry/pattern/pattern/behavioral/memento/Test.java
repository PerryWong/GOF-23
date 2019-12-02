package com.perry.pattern.pattern.behavioral.memento;

/**
 * 备忘录模式：
 *      保存一个对象的某个状态，以便在适当的时候恢复对象----"后悔药"
 * 类型：行为型
 *
 * 适用场景：
 *      1.保存及恢复数据相关业务场景
 *      2.后悔的时候，即想恢复到之前的状态
 * 优点：
 *      1.为用户提供一种可恢复机制
 *      2.存档信息的封装
 * 缺点：
 *      1.资源占用
 *
 * 相关设计模式：
 *      1.备忘录模式（是用实例来表示状态的，存档是一个对象的实例）和状态模式（只是用类来表示状态）
 *
 * Coding案例：网站手记暂存功能
 *
 * jdk案例：Spring-WebFlow-StateManageableManageableMessageContext
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("如影随形的设计模式A","手记内容B","手记图片B");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题：" + article.getTitle() + " 内容：" + article.getContent() + " 图片：" + article.getImgs());
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");
        article.setTitle("如影随形的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");
        System.out.println("修改手记end");
        System.out.println("手记完整信息：" + article);
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("暂存回退start");
        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息：" + article);
    }
}
