package com.example.jsr352.job.hello;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Named;

@Named
public class HelloBatchlet extends AbstractBatchlet {

	@Override
	public String process() throws Exception {
		System.out.println("hello world");
		return null;
	}

}
