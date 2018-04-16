package com.von.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@Value("${name}")
	private String name;

	@GetMapping(value = "/hello")
	//@RequestParam String name
	public String hello() throws Exception{

		// --------------  验证hystrix默认超时时间2000毫秒 start  ------------------
//		long start = System.currentTimeMillis();
//
//		int sleepTime = new Random().nextInt(3000);
//		System.out.println("sleepTime: " + sleepTime);
//		Thread.sleep(sleepTime);
//		String str = "Hi, This is " + name + " ! And the port is " + port;
//
//		long end = System.currentTimeMillis();
//
//		System.out.println("time between end and start : " + (end - start));

		// --------------  验证hystrix默认超时时间2000毫秒 end  ------------------

		String str = "Hi, This is " + name + " ! And the port is " + port;
		return str;
	}
}
