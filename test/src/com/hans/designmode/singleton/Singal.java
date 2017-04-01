package com.hans.designmode.singleton;

/**
 * 模块名称： 线程安全的单例模式<br>
 * @version v1.0<br>
 */
public class Singal {

	private static Singal instance = null;
	private Singal(){}
	public static Singal getInstance(){
		if(instance == null){
			synchronized (Singal.class) {
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
