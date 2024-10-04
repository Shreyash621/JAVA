import java.util.*;
class Stringpallindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a= sc.nextLine();
        String st=a;
        String copy="";
        int b=a.length();
        for(int i=b-1;i>=0;i--){
            copy = copy + a.charAt(i);
    }
    if(st.equals(copy)){
        System.out.println("Pallindrome");
    }
    else{
        System.out.println("Not a pallindrome");
    }
    }
}
