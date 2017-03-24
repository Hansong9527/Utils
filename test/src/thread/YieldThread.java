package thread;

public class YieldThread extends Thread{

	
	public YieldThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println(Thread.currentThread().getName() + "----" + i);
		if(i == 3){
			System.out.println("线程让步");
			Thread.yield();
			}
		}
	}
	public static void main(String[] args) {
		Thread thread1 = new YieldThread("线程1");
		Thread thread2 = new YieldThread("线程2");

		thread1.start();
		thread2.start();
	}
	

}
