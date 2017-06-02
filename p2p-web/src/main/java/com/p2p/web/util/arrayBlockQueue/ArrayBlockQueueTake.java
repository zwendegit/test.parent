package com.p2p.web.util.arrayBlockQueue;

import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayBlockQueueTake implements Runnable {

	private final Logger logger = LoggerFactory.getLogger(ArrayBlockQueueTake.class);
	private BlockingQueue<Integer> queue;

	public ArrayBlockQueueTake(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Integer result = queue.poll();
				Thread.sleep(1000);
				// System.out.println("从queue里poll数据结果：" + result);
				logger.info("从queue里poll数据结果：" + result);
				System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
				System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
				if (result != null && result == 4) {
					Thread.sleep(5000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
