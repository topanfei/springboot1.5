package com.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.pf.listener.SecondListener;

/**
 * SpringBoot整合Listener
 * 方式2：通过@Bean注入自定义的Listener对象
 * @author PF
 *
 */
@SpringBootApplication
public class App2 {

	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
		return bean;
	}
}
