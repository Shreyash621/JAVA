import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
    int n1=0;
    int n2=1;
    int l=0;

    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of digits in fabonacci series");
    l=sc.nextInt();

    System.out.println(n1+" "+n2+" ");
    for(int i=2;i<l;i++)
    {
        int n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
    }
}
}
