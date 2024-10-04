import java.util.*;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a= sc.nextLine();
        String copy="";
        int b=a.length();
        for(int i=b-1;i>=0;i--){
            copy = copy + a.charAt(i);
    }
    System.out.println(copy);
    }
}