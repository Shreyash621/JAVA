import java.util.*;
public class VCcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String a=sc.nextLine();
        int l=a.length();
        int cv=0,cc=0;
        for(int i=0;i<l;i++){
            if(a.charAt(i)== 'a' || a.charAt(i)== 'e' || a.charAt(i)== 'i'||  a.charAt(i)== 'o' || a.charAt(i)== 'u'){
                cv++;
            }
            else{
                cc++;
            }
        }
        System.out.println("The number of vowels are:"+ cv);
        System.out.println("The number of consonants are:"+ cc);
    }
}
