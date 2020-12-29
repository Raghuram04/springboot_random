package com.weblearner.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootRandomApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootRandomApplication.class, args);
		RandomGenerator bean = context.getBean(RandomGenerator.class);
		System.out.println("Integer value" + bean.getId());
		System.out.println("Long Value" + bean.getLongId());
		System.out.println("Random UUID" + bean.getUuid());
	}

}
