package com.hans.base.thread;

public class Ticket {

	public static void main(String[] args){
		TicketWindow tk = new TicketWindow();
		new Thread(tk,"a").start();
		new Thread(tk,"b").start();
		new Thread(tk,"c").start();
		new Thread(tk,"d").start();
	}
}
	class TicketWindow implements Runnable{
		private int tickets = 100;
		@Override
		public void run() {
			while(true){
				if(tickets > 0){
					Thread thread = Thread.currentThread();
					String th_name = thread.getName();
					System.out.println(th_name + "正在发售" + tickets-- + "张票");
				}
			}
		}
	}


