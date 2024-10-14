public class pattern16 {
    public static void main(String[] args) {
        int b='A';
        for(int i=1;i<5;i++)
        {
            for(int k=1;k<5-i;k++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(b+3-i+j));

            }
        System.out.println();
        }
    }
}
/*
***D
**CD
*BCD
ABCD
 */