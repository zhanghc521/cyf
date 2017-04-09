package com.app.chengyifang;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.app.chengyifang.filter.AppFilter;

@MapperScan("com.app.chengyifang.mapper")
@SpringBootApplication
public class ChengyifangApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChengyifangApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		AppFilter httpBasicFilter = new AppFilter();
		registrationBean.setFilter(httpBasicFilter);
		List<String> urlPatterns = new ArrayList<String>();
		urlPatterns.add("/app/*");
		registrationBean.setUrlPatterns(urlPatterns);
		return registrationBean;
	}
}
