import java.util.*;
public class RecFib {
    public static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s= fibo(n);
        System.out.println(s);
    }
    
}
