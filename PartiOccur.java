import java.util.*;
public class PartiOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        System.out.println("Enter the character for the occurance to be checked");
        char ch=sc.next().charAt(0);
        int l=a.length();
        int cnt=0;
        for(int i=0;i<l;i++){
            if(a.charAt(i)==ch){
                cnt++;
            }
        }
        System.out.println("The number of ocurrance of "+ ch + " is "+ cnt);
    }
}
