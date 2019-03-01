package com.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.pf.filter.SecondFilter;
import com.pf.servlet.SecondServlet;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	/**
	 * 注册自定义的SecondServlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		//添加自定义的servlet对象
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		//设置访问的url
		bean.addUrlMappings("/second");
		return bean;
	}
	
	/**
	 * 注册自定义的SecondFilter过滤器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		//创建自定义的filter对象
		FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
		//设置过滤器过滤的url
		bean.addUrlPatterns("/second");
		return bean;
	}
}
