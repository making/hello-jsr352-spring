package com.example.jsr352.job.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;

import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
public class FileItemReader extends AbstractItemReader {
	private static final Logger logger = LoggerFactory
			.getLogger(FileItemReader.class);

	BufferedReader reader;
	int lineNumber = 0;

	@Override
	public void open(Serializable checkpoint) throws Exception {
		logger.debug("open");
		reader = new BufferedReader(new FileReader("input.txt"));
	}

	@Override
	public Object readItem() throws Exception {
		String content = reader.readLine();
		return content == null ? null : new LineItem(++lineNumber, content);
	}

	@Override
	public void close() throws Exception {
		logger.debug("close");
		if (reader != null) {
			reader.close();
		}
	}

}
