package base;

public class test{

 public static void main(String ag[]){
      String s = "12345.3232";
      try{
          double d = (new Double(s)).doubleValue(); 
          System.out.println("d: "+d);
      }
      catch(NumberFormatException e){
         System.out.println("s is not a number");
      }
 }
}