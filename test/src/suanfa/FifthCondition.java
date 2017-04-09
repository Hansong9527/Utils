package suanfa;

import java.util.Scanner;

/*【程序5】
题目：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
1.程序分析：(a>b)?a:b这是条件运算符的基本例子。 */
public class FifthCondition {

	public static int g;
	
	public static void main(String[] args){
		System.out.println("请输入成绩：");
		Scanner s = new Scanner(System.in);
		int grade = s.nextInt();
		
		FifthCondition condition = new FifthCondition();
		g = condition.compare(grade);
		if(g == 1){
			System.out.println("A");
		}else if(g == 2){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		s.close();
	}
	
	public int compare(int a){
		return a >  90 ? 1 : a > 60 ? 2 :3;
	}
}
