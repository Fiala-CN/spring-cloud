package com.von.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name}")
	private String name;

	@Value("${age}")
	private Integer age;

	@Value("${sex}")
	private String sex;

	@RequestMapping(value = "/query/user")
	public String hi(){
		return "Person : name -> " + name + ", age -> " + age + ", sex -> " + sex;
	}
}
