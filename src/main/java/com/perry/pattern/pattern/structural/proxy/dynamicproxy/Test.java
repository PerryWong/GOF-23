package com.perry.pattern.pattern.structural.proxy.dynamicproxy;

import com.perry.pattern.pattern.structural.proxy.IOrderService;
import com.perry.pattern.pattern.structural.proxy.Order;
import com.perry.pattern.pattern.structural.proxy.OrderServiceImpl;

/**
 * 动态代理
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
