import java.util.*;
public class Fact {
    public static void main(String[] args) {
        int fact=1;
        int l=0;
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the number");
        l=sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
    
}
