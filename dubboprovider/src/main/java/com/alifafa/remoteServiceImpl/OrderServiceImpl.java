package com.alifafa.remoteServiceImpl;

import com.alifafa.remoteService.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public String queryOrderStatu(String orderId) {
        System.out.println("provider print 【"+orderId+"】");
        return this.getClass().getName()+" > "+orderId;
    }

}
