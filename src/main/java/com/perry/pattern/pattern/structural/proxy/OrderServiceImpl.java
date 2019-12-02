package com.perry.pattern.pattern.structural.proxy;

/**
 * Service实现
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;


    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，这里就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
