import java.util.*;
public class reverseno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int n=a;
        int h=a;
        int c=0,cnt=0;
        while(n>0){
            int d=n%10;
            c=c*10+d;
            n=n/10;
        }
        System.out.println(c);
        while(h>0){
            int d=h%10;
            if(d==0){
                cnt++;
            }
            h=h/10;
        }
        System.out.println("Number of zeroes are"+ cnt);
    }
}
