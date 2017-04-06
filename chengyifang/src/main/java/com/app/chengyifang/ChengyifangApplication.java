package com.app.chengyifang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.app.chengyifang.mapper")
@SpringBootApplication
public class ChengyifangApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChengyifangApplication.class, args);
	}
}
