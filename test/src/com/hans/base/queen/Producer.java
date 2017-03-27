package com.hans.base.queen;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
* 生产者线程
*
* @author song
*/
public class Producer implements Runnable{
	
	public static boolean isRunning = true;
	private static AtomicInteger count = new AtomicInteger();
	
	private BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue){
		this.queue = queue;
	}
	
	public void run(){
		String data  = null;
		Random r = new Random();
		System.out.println("生产者线程启动");
		
		try{
			while(isRunning){
				System.out.println("正在生产数据...");
				Thread.sleep(r.nextInt(500));
				
				data = "data:" + count.incrementAndGet();
				System.out.println("将数据：" + data + "放入队列...");
				
				if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
					System.out.println("队列已满，放入数据失败：" + data);
					isRunning = false;
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			System.out.println("退出生产者线程！");
		}
	}
	public void stop() {
		isRunning = false;
		}
}
