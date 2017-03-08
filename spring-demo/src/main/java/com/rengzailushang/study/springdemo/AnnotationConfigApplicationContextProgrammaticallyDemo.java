package com.rengzailushang.study.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Building the container programmatically
 */
public class AnnotationConfigApplicationContextProgrammaticallyDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.register(AbstractService.class);
		ctx.refresh();
		
		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
	}
}
