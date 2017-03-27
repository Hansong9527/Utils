package com.hans.base.thread;

public class JoinThread {

	public static void main(String[] args) throws Exception{
		Thread t = new Thread(new EmergenceThread(), "线程1");
		t.start();
		for(int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + "输入" + i);
			if(i == 2){
				System.out.println("111111111111111111");
				t.join();
			}
//			Thread.sleep(500);
		}
	}
	
	public static class EmergenceThread implements Runnable{

		@Override
		public void run() {
			for(int i = 0; i <5; i++){
				System.out.println(Thread.currentThread().getName() + "输入" + i);
			}try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		
	}

}
