package com.von.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
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
    private RibbonZipkinService ribbonZipkinService;

    @GetMapping(value = "/hello")
    public String hello(String name){
        return helloService.hiService(name);
    }

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam("name") String name){
        return ribbonZipkinService.sayHello(name);
    }
}
