package com.example.jsr352.job.file;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named
public class FileItemProcessor implements ItemProcessor {
	@Override
	public Object processItem(Object item) throws Exception {
		LineItem lineItem = (LineItem) item;
		String content = lineItem.getContent();
		return (lineItem.getLineNumber() % 2 == 0) ? content.toLowerCase()
				: content.toUpperCase();
	}
}
