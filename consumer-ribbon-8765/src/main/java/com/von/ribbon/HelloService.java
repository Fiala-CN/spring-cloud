package com.von.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author: fengyao
 * @date: 2018-04-08
 * @ver: 1.0
 * @desc:
 */
public interface HelloService {

    String hiService(String name);

    String hiError(String name);
}
