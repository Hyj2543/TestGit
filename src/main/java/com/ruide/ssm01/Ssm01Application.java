package com.ruide.ssm01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ruide.ssm01.mapper")
public class Ssm01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ssm01Application.class, args);
	}
}
