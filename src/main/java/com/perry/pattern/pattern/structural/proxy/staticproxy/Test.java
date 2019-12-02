package com.perry.pattern.pattern.structural.proxy.staticproxy;

import com.perry.pattern.pattern.structural.proxy.Order;

/**
 * 静态代理
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
