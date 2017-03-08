package com.rengzailushang.study.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class MyService {

	@Autowired
	private AbstractService abstractService;

	public void doStuff() {
		abstractService.doAbstractStuff();
		System.out.println("doStuff");
	}
}
