package com.hans.utils.httprequest;

public class test {

	public static void main(String[] args){
		UrlRequestUtil url = new UrlRequestUtil();
		String result = url.doHttpRequest("www.baidu.com");
		System.out.println(result);
	}
}
