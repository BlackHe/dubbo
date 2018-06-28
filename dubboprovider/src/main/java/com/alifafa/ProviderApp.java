package com.alifafa;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApp {
    public static void main(String[] args)throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"./dubbo-provider.xml"});
        context.start();
        System.in.read();
    }
}
