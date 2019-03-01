package com.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springBoot整合filter方式1
 * 通过@WebFilter注解整合Filter
 * @author PF
 *
 */
@SpringBootApplication
@ServletComponentScan //项目启动时，扫描Servlet和Filter对象
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
