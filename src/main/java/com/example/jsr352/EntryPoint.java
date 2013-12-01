package com.example.jsr352;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class EntryPoint {

	public static void main(String[] args) {
		String jobId;
		if (args.length > 0) {
			jobId = args[0];
		} else {
			jobId = "hellojob";
		}

		JobOperator jobOperator = BatchRuntime.getJobOperator();
		System.out.println("start jobId=" + jobId);
		long executionId = jobOperator.start(jobId, null);
		System.out.println("executionId=" + executionId);
	}

}
