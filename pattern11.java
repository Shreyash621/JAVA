import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(a+n-i+j-1)+" ");
            }
            System.out.println();
        }
    }
}
/* 
D 
C D
B C D
A B C D */