package base;

import com.hans.utils.time.DateUtils;

public class test {
	public static void main(String[] args){

		String time = DateUtils.getCurrentTimestamp().substring(2);
		String yy = time.substring( 0, 2);
		String MM = time.substring( 2, 4);
		String dd = time.substring( 4, 6);
		String hh = time.substring( 6, 8);
		String mm = time.substring( 8, 10);
		String ss = time.substring(10, 12);

		System.out.println(yy);
		System.out.println(MM);
		System.out.println(dd);
		System.out.println(hh);
		System.out.println(mm);
		System.out.println(ss);
	}

}  
