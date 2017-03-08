package com.rengzailushang.study.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Simple construction
 * 
 * And {@link AbstractService} use Spring dependency injection annotations such as @Autowired.
 */
public class AnnotationConfigApplicationContextDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, AbstractService.class);
		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
		
	}
}
