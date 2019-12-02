package com.perry.pattern.pattern.structural.proxy.staticproxy;

import com.perry.pattern.pattern.structural.proxy.IOrderService;
import com.perry.pattern.pattern.structural.proxy.Order;
import com.perry.pattern.pattern.structural.proxy.OrderServiceImpl;
import com.perry.pattern.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * 静态代理
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    // 被增强的方法
    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    // save之前执行
    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    // save之后执行
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
