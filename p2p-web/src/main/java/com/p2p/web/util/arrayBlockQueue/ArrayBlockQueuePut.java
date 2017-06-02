package com.p2p.web.util.arrayBlockQueue;

import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayBlockQueuePut implements Runnable {

	private final Logger logger = LoggerFactory.getLogger(ArrayBlockQueuePut.class);
	private BlockingQueue<Integer> queue;

	public ArrayBlockQueuePut(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// int i=0;
		for (int j = 0; j < 3; j++) {

			try {
				boolean result = queue.offer(j);
				System.out.println("往queue里put:" + j + "结果=" + result);
				logger.info("往queue里put:" + j + "结果=" + result);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
