package com.pf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入SecondFilter过滤器...");
		System.out.println("执行SecondFilter过滤器....");
		
		chain.doFilter(request, response);
		
		System.out.println("离开SecondFilter过滤器");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
