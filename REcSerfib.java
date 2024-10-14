import java.util.*;
public class REcSerfib {
    static int a=0,b=1,tem=0;
    public static void fibo(int m){
        
            if((m)>0){
               tem=a+b;
               a=b;
               b=tem;
               System.out.print(" "+ tem);
               fibo(m-1);

    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("0 1");
        fibo(n-2);
    }
}
