package com.hans.utils.base64;

import java.io.UnsupportedEncodingException;


public class Base64 {

	    //base64编码字符串
		public static String encode(String value){
			String _v = null;
			if(null != value){
				try {
					_v =  org.apache.commons.codec.binary.Base64.encodeBase64String(value.getBytes("UTF-8"));
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			} else {
				_v = "";
			}
			return _v;
		}
		
		//base64解码字符串
		public static String decode(String value){
	        byte[] b = null;
	        if(null != value){
	            try {
	                b = org.apache.commons.codec.binary.Base64.decodeBase64(value);
	            } catch (Exception e) {
	                throw new RuntimeException(e);
	            }
	        } else {
	            return  "";
	        }
	        String s = "";
			try {
				s = new String(b, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
	        return s;
	    }
}
