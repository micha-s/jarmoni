/*
 * Copyright (c) 2013. All rights reserved.
 * Original Author: ms
 * Creation Date: Nov 16, 2013
 */
package org.jarmoni.jobqueue.impl;

import org.jarmoni.jobqueue.api.IJob;
import org.jarmoni.jobqueue.api.IQueueService;
import org.jarmoni.util.Asserts;

public class JobQueueServiceAccess {

	private final IQueueService queueService;

	public JobQueueServiceAccess(final IQueueService queueService) {
		this.queueService = Asserts.notNullSimple(queueService, "queueService");
	}

	void update(final IJob job) throws JobQueueException {
		this.queueService.update(job);
	}

	boolean isPaused(final IJob job) throws JobQueueException {
		return this.queueService.isPaused(job);
	}

	boolean isCanceled(final IJob job) throws JobQueueException {
		return this.queueService.isCanceled(job);
	}

	void setFinished(final IJob job) throws JobQueueException {
		this.queueService.setFinished(job);
	}
}
