package com.pf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
/**
*SpringBoot 整合Filter 方式一
*<filter>
* <filter-name>FirstFilter</filter-name>
* <filter-class>com.bjsxt.filter.FirstFilter</filter-class>
*</filter>
*<filter-mapping>
* <filter-name>FirstFilter</filter-name>
* <url-pattern>/first</url-pattern>
*</filter-mapping>
*/

/**
 * @WebFilter(filterName="FirstFilter",urlPatterns={"*.do","*.jsp"})中的urlPatterns可以是字符串数组过滤多个url
 * 此案例是过滤first的url链接
 * @author PF
 */
@WebFilter(filterName="FirstFilter",urlPatterns="/first")
public class FirstFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入FirstFilter过滤器...");
		System.out.println("开始执行FirstFilter过滤器....");
		
		chain.doFilter(request, response);
		
		System.out.println("离开FirstFilter过滤器...");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
