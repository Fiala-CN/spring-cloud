package com.von.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author: fengyao
 * @date: 2018/1/15
 * @ver: 1.0
 * @desc:
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Sorry " + name + ". There is an error.";
    }
}
