import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int k=1;k<n-i;k++){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int h=1;h<i;h++){
                System.out.print(i-h);
            }
            System.out.println();
        }
    }
}
/*
   1
  121
 12321
1234321
 */
