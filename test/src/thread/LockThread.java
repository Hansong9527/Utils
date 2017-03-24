package thread;

public class LockThread {

	static class Ticekt implements Runnable{
		private int ticket = 100;
		Object lock = new Object();
		
		public void run(){
			while(true){
				synchronized (lock) {
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					if(ticket > 0){
						System.out.println(Thread.currentThread().getName() + "卖出的票" + ticket--);
					}else{
						System.out.println("结束");
						break;
					}
				}
			}
			
		}
	}

	
	public static void main(String[] args) {
		Ticekt t = new Ticekt();
		new Thread(t, "线程1").start();
		new Thread(t, "线程2").start();
		new Thread(t, "线程3").start();
	}

}
