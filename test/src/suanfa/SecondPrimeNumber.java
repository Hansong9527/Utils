package suanfa;

/*【程序2】
题目：判断101-200之间有多少个素数，并输出所有素数。
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
则表明此数不是素数，反之是素数。 */
public class SecondPrimeNumber  {
	
	public static int count = 0;
	
	public static void main(String[] args){
		for(int i = 101; i < 200; i++){
			boolean result = true;
			for(int j = 2; j <  Math.sqrt(i); j++){
				if(i%j == 0){
					result = false;
					break;
				}
			}
			if(result){
				count++;
			}
		}
		System.out.println("素数的个数是：" + count);
	}
}
