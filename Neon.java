import java.util.*;
public class Neon {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int num=0;
      int sum=0;
      System.out.println("enter a num");
      int n=sc.nextInt();

      int temp=n;

      int a=n*n;
      while(a>0)
      {
        num=a%10;
        sum=sum+ num;
        a=a/10;

      }

      if(temp==sum)
      System.out.println("the no is neon number");

      else
      System.out.println("the no is not neon num");
    }
}
