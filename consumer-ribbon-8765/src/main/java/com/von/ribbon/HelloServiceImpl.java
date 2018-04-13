package com.von.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: fengyao
 * @date: 2018-04-03
 * @ver: 1.0
 * @desc:
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Autowired
    RestTemplate restTemplate;


    /**
     * 必须放在实现类上面
     * @param name
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-PRODUCER-HELLO/hello?name="+name,String.class);
    }

    @Override
    public String hiError(String name) {
        return "Hello " + name + ", there is an error.";
    }
}
