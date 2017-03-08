package com.rengzailushang.study.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Enabling component scanning with scan(String...)
 *
 */
public class AnnotationConfigApplicationContextScanDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.rengzailushang.study");
		ctx.refresh();

		MyService myService = ctx.getBean(MyService.class);
		myService.doStuff();
	}
}