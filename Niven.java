import java.util.*;
public class Niven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int sum=0;
        int a=0;
        System.out.println("enter a number");
        int n=sc.nextInt();

        int temp=n;

        while(n>0)
        {
            a=n%10;
            sum=sum+ a;
            n=n/10;

        }

        if(temp%sum==0)
        System.out.println("the number is niven number");

        else
        System.out.println("the number is not niven number");
    }
}
