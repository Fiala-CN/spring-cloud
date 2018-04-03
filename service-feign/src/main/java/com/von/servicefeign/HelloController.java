package com.von.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fengyao
 * @date: 2018/1/15
 * @ver: 1.0
 * @desc:
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private FeignZipkinService feignZipkinService;

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return helloService.sayHello(name);
    }

    @GetMapping(value = "/sayHi")
    public String sayHi(@RequestParam("name") String name){
        System.out.println(name);
        System.out.println(name+"123");
        return feignZipkinService.sayHello(name);
    }

}
