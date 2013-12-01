package com.example.jsr352.job.file;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Named;

@Named
public class FileItemWriter extends AbstractItemWriter {
	@Override
	public void writeItems(List<Object> items) throws Exception {
		for (Object item : items) {
			System.out.println(item);
		}
	}
}
