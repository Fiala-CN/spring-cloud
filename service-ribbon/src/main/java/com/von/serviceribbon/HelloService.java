package com.von.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: fengyao
 * @date: 2018/1/15
 * @ver: 1.0
 * @desc:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-HELLO/hello?name="+name,String.class);
    }

    public String hiError(String name){
        return "Hi, " + name + ". There is an error.";
    }

}