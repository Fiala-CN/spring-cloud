package com.von.servicefeign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: fengyao
 * @date: 2018/1/17
 * @ver: 1.0
 * @desc:
 */
@FeignClient(value = "service-ribbon")
public interface FeignZipkinService {

    /**
     * 打招呼
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    String sayHello(@RequestParam("name") String name);
}
