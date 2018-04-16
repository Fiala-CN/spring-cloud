package com.von.feign;

import org.springframework.stereotype.Component;

/**
 * @author: fengyao
 * @date: 2018-04-08
 * @ver: 1.0
 * @desc:
 */
@Component
public class HystrixServiceImpl implements HelloServiceFeignClient {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", there is an error.";
    }
}
