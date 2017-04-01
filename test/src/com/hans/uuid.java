package com.hans;

import java.util.UUID;

public class uuid {
	
	
	public static void main(String[] args){
			for(int i = 0; i < 578; i ++){
				String a = UUID.randomUUID().toString().replaceAll("-", "");
				System.out.println(a);
		}

	}
}
