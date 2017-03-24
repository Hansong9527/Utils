package singleton;


/**
 * 模块名称： 线程安全的单例模式<br>
 * 版权信息: Copyright (c) 2014<br>
 * 
 * @author 宋鹤(songhe@navinfo.com)
 * @date 2017年2月23日 下午1:21:18 
 * @version v1.0<br>
 */
public class Singleton {

	private static Singleton singleton = null; 
	
	public Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				singleton = new Singleton();
			}
		}
		return singleton;
	}
}
