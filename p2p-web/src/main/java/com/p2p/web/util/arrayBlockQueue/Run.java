package com.p2p.web.util.arrayBlockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class Run {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
		new Thread(new ArrayBlockQueuePut(queue)).start();
		new Thread(new ArrayBlockQueueTake(queue)).start();
	}
}
