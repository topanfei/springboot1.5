package com.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.pf.servlet.SecondServlet;

/**
 * springBoot整合servlet方式2
 * 通过方法完成servlet组件的注册
 * @author PF
 *
 */
@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		//创建自定义的SecondServlet类
		ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
		//添加自定义servlet的访问url。该参数可以传入字符串数组
		bean.addUrlMappings("/second");
		return bean;
	}
}
