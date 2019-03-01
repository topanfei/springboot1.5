package com.pf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * SpringBoot整合Listener
 * 方式1：通过@WebListener整合Listener
 * @author PF
 *
 */
@SpringBootApplication
@ServletComponentScan   //项目其中时扫描自定义的Listener对象
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
