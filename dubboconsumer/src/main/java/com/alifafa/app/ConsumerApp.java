package com.alifafa.app;

import com.alifafa.remoteService.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"./dubbo-consumer.xml"});
        context.start();
        OrderService orderService = (OrderService) context.getBean("orderService");
        String audited = orderService.queryOrderStatu("hello dubbo");
        System.out.println(audited);
    }
}
