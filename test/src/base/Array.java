package base;

/*实现在一个数组指定位置添加元素和删除元素的功能。 
 *1、数组容量问题？ 
 *2、添加元素前后数组中元素的变化 
 *3、删除元素前后数组中元素的变化  
 *2012年12月26日 
 */  
import java.util.Scanner;  
  
public class Array {  
      
    public void Init()  
    {  
        System.out.println("输入数组元素个数");  
        Scanner input = new Scanner(System.in);  
        n = input.nextInt();  
        a = new int[n];  
        System.out.println("输入"+n+"个整数作为数组元素");  
        for (int i = 0; i < a.length; ++i)  
        {  
            a[i] = input.nextInt();  
        }  
    }  
      
    public void Insert()  
    {  
        System.out.println("请输入要插入元素的位置");  
        Scanner input = new Scanner(System.in);  
        int location = input.nextInt();  //要插入的位置为location  
          
        //数组插入的位置为0~n，超出这个范围无效  
        if (location < 0 || location > a.length)  
        {  
            System.out.println("输入位置有误");  
            return;  
        }  
          
        int b[] = new int[a.length + 1];  
        //先复制前面location个元素到b  
        System.arraycopy(a, 0, b, 0, location);  
        //再复制其余后面的元素到b  
        System.arraycopy(a, location, b, location + 1, a.length - location);  
          
        System.out.println("请输入要插入的整数");  
        int elem = input.nextInt();  
        b[location] = elem;   //插入到location这个位置  
        a = new int[b.length];  
        System.arraycopy(b, 0, a, 0, b.length); //将b复制到a          
    }  
      
    //删除元素  
    public void Delete()  
    {  
        System.out.println("请输入要删除元素的位置");  
        Scanner input = new Scanner(System.in);  
        int location = input.nextInt();  //要删除的位置为location  
          
        //数组删除的位置为0~a.length-1，超出这个范围无效  
        if (location < 0 || location > a.length-1)  
        {  
            System.out.println("输入位置有误");  
            return;  
        }  
          
        int b[] = new int[a.length - 1];  
        //先复制前面location个元素到b  
        System.arraycopy(a, 0, b, 0, location);  
        //再复制其余后面的元素到b  
        System.arraycopy(a, location + 1, b, location, a.length - location -1);  
          
        a = new int[b.length];  
        System.arraycopy(b, 0, a, 0, b.length); //将b复制到a          
    }  
      
    //输出数组  
    public void Print()  
    {  
        System.out.println("输出数组为");  
        for (int i = 0; i < a.length; ++i)  
        {  
            System.out.print(a[i]);  
        }  
        System.out.println();  
    }  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Array x = new Array();  
          
        x.Init();  //初始化数组  
        x.Print();  
        x.Insert();   //插入元素  
        x.Print();  
        x.Delete();   //删除元素  
        x.Print();  
    }  
    private int n;  //数组元素个数  
    private int a[];  
}  
