package com.example.jsr352.job.hello;

import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

@Named
public class HelloService {
	@Transactional
	public String hello(String name) {
		return "hello " + name + "!";
	}
}
