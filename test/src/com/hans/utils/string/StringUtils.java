package com.hans.utils.string;

/**
 * <p>Description: [StringUtils] </p>
 * 功能描述： 字符串工具类<br> 
 * @version 1.0
 */
public class StringUtils {
	
    /**
     * 将null转换为"";
     * @param param
     * @return ""或param
     */
    public static String null2Blank (String param) {
        if (null == param) {
            param = "";
        }
        return param;
    }
    
    /**
     * 将""转换为null;
     * @param param
     * @return null或param
     */
    public static String Blank2Null (String param) {
        if (null != param && "".equals(param)) {
            param = null;
        } 
        return param;
    }
    
    /**
     * 截取指定长度的字符串;
     * @param param
     * @param length
     * @return subParam
     */
    public static String subString (String param, int length) {
        String subParam = null;
        if (null == param) {
            subParam = null;
        }
        if (param.length() < length) {
            subParam = param;
        } else {
            subParam = param.substring(0, length);
        }
        return subParam;
    }
    
}
