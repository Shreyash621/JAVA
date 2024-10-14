import java.util.*;
public class Revsum {
    public static int revs(int n){
        if(n==0){
           return 0;
        }
        else
        {
            return (n%10+ revs(n/10));
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int st=revs(n);
        System.out.println(st);
    }
}
