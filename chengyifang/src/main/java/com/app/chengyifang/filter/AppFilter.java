package com.app.chengyifang.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.chengyifang.service.UserService;

public class AppFilter implements Filter {

	@Autowired
	UserService userService;
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String userName = "";
		String password = "";
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		if("admin".equals(userName) && "admin".equals(password)){
			chain.doFilter(request, response);
			return;
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
