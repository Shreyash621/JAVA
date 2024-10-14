import java.util.*;
public class RecRev {
    public static int rever(int n){
            if(n<10){
                System.out.println(n);
            }
            else{
                System.out.print(n%10);
                rever(n/10);
            }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rever(n);
    }
}
