import java.util.*;
import java.math.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int n=0;
        System.out.println("enter a num");
        int a=sc.nextInt();

        System.out.println("enter the no of digits in entered num");
        int b=sc.nextInt();
        int temp=a;

        while(a>0)
        {
            n=a%10;
            sum=sum+(Math.pow(n, b));
            a=a/10;
        }

        if(temp==sum)
        System.out.println("Number is Armstrong");

        else
        System.out.println("Number is not Armstrong");
        
    }
}
