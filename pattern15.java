import java.util.*;
    public class pattern15 {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i+1);j++){
                    System.out.print(j+" ");
                }
                for(int k=1;k<=(i-1);k++){
                    System.out.print("*"+" ");
                }
                for(int h=1;h<=(i-1);h++){
                    System.out.print("*"+" ");
                }
                for(int l=(n-i+1);l>=1;l--){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
        }
    }
    /*
    5
1 2 3 4 5 5 4 3 2 1 
1 2 3 4 * * 4 3 2 1 
1 2 3 * * * * 3 2 1 
1 2 * * * * * * 2 1 
1 * * * * * * * * 1 
     */
