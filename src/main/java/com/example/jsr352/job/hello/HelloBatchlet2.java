package com.example.jsr352.job.hello;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloBatchlet2 extends AbstractBatchlet {
	@Inject
	HelloService helloService;

	@Override
	public String process() throws Exception {
		System.out.println(helloService.hello("world"));
		return null;
	}

}
