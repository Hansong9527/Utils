package base;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class tableAndMap {

	public static void main(String[] args){
		
		tableAndMap t = new tableAndMap();
		t.write();
		t.read();
		
	}
	
	public void write(){
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
        Date date1= new Date();  
        for (int i = 0; i < 1000000; i++) {  
            map.put(i, i);  
        }  
        Date date2 = new Date();  
        System.out.println("HashMap的插入时间：");  
        System.out.println(date2.getTime()-date1.getTime());  
          
        Map<Integer, Integer> map1 = new Hashtable<Integer, Integer>();  
        Date date3= new Date();  
        for (int i = 0; i < 1000000; i++) {  
            map1.put(i, i);  
        }  
        Date date4 = new Date();  
        System.out.println("HashTable的插入时间：");  
        System.out.println(date4.getTime()-date3.getTime());  
	}
	
	public void read(){
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();  
        for (int i = 0; i < 10000000; i++) {  
            map.put(i, i);  
        }  
        Date date1= new Date();  
        for (Integer key : map.keySet()) {  
            map.get(key);  
        }  
        Date date2 = new Date();  
        System.out.println("HashMap的读取时间：");  
        System.out.println(date2.getTime()-date1.getTime());  
          
        Map<Integer, Integer> map1 = new Hashtable<Integer, Integer>();  
        for (int i = 0; i < 10000000; i++) {  
            map1.put(i, i);  
        }  
        Date date3= new Date();  
        for (Integer key : map1.keySet()) {  
            map1.get(key);  
        }  
        Date date4 = new Date();  
        System.out.println("HashTable的读取时间：");  
        System.out.println(date4.getTime()-date3.getTime());  
	}
}
