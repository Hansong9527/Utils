package suanfa;

/*【程序3】
题目：打印出所有的"水仙花数(narcissus number)"，所谓"水仙花数"是指一个三位数，
其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。 */
public class ThirdNarcissusNum {
	public static int first, second, third;

	public static void main(String[] args){
		for(int i = 100; i < 999; i++){
			ThirdNarcissusNum t = new ThirdNarcissusNum();
			t.findNum(i);
		}
	}
	
	public void findNum(int num){
		first = num/100;
		second = (num % 100) / 10;
		third = num%10;
		if(Math.pow(first, 3) + Math.pow(second, 3) + Math.pow(third, 3) == num){
			System.out.println(num);
		}
//		if(first*first*first + second*second*second + third*third*third == num){
//			System.out.println(num);
//		}
	}
}
