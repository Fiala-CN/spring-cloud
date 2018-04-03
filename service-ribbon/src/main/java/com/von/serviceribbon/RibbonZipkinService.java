package com.von.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: fengyao
 * @date: 2018/1/17
 * @ver: 1.0
 * @desc:
 */
@Service
public class RibbonZipkinService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name){
        return restTemplate.getForObject("http://SERVICE-FEIGN/sayHello?name="+name,String.class);
    }
}
