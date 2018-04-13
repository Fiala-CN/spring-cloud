package com.von.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: fengyao
 * @date: 2018-04-03
 * @ver: 1.0
 * @desc:
 */
@FeignClient(value = "ZUUL-GATEWAY", fallback = HystrixServiceImpl.class)
@Component
public interface HelloServiceFeignClient {

    /**
     * 打招呼
     * @param name
     * @return
     */
    @GetMapping(value = "/hi-service/hi")
    String sayHello(@RequestParam("name") String name);
}
