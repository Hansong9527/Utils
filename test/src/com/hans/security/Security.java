package com.hans.security;

public interface Security {
	
	/**
	 * 加密
	 * @param content 需要加密的内容 
	 * @return
	 */
	String encrypt(String content);
	
	/**
	 * 解密
	 * @param content 待解密内容 
	 * @return
	 */
	String decrypt(String content);

}
