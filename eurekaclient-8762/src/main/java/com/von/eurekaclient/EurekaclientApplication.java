package com.von.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@GetMapping(value = "/hello")
	public String hello(@RequestParam String name) throws Exception{

		int sleepTime = new Random().nextInt(3000);
		String str = "Hi, This is " + name + " ! And the port is " + port;

		Thread.sleep(sleepTime);
		System.out.println(sleepTime);

		return str;
	}
}
