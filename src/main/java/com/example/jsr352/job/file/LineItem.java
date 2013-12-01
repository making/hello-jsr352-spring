package com.example.jsr352.job.file;

public class LineItem {

	private int lineNumber;
	private String content;

	public LineItem(int lineNumber, String content) {
		this.lineNumber = lineNumber;
		this.content = content;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "LineItem [lineNumber=" + lineNumber + ", content=" + content
				+ "]";
	}
}
