package com.wj.dubbo;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "hello: "+ name;
    }
}
