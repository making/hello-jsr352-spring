package com.example.jsr352.job.db;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Named;

@Named
public class DbWriter extends AbstractItemWriter {
	@Override
	public void writeItems(List<Object> items) throws Exception {
		System.out.println(items);
	}
}
