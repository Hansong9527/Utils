package suanfa;

import java.util.Scanner;

/*【程序7】
题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。*/
public class SeventhCharacterStatistics {

	static int digital = 0;
	static int character = 0;
	static int other = 0;
	static int blank = 0;

	public static void main(String[] args){
		System.out.println("请输入要计算的字符：");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char c[] = input.toCharArray();
		for(int i =0; i < c.length; i++ ){
			if(c[i] >= '0' && c[i] <= '9' ){
				digital++;
			}else if((c[i] >= 'a' && c[i] <= 'z') || c[i] > 'A' && c[i] <= 'Z'){
				character++;
			}else if(c[i] == ' '){
				blank++;
			}else{
				other++;
			}
		}
		sc.close();
		System.out.println("数字个数: " + digital);
		System.out.println("英文字母个数: " + character);
		System.out.println("空格个数: " + blank);
		System.out.println("其他字符个数:" + other );
	}

}
