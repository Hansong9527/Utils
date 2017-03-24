package base;

import singleton.Singleton;

//线程安全的单例模式
public class Singal {

	private static Singal instance = null;
	private Singal(){}
	public static Singal getInstance(){
		if(instance == null){
			synchronized (Singleton.class) {
				instance = new Singal();
			}
		}
		return instance;
	}
	
	public static void main(String[] args){
		Singal s1 = Singal.getInstance();
		Singal s2 = Singal.getInstance();

		System.out.println(s1 == s2);
	}
}
