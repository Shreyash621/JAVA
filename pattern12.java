public class pattern12 {
    public static void main(String[] args) {
        int a='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print((char)(a+i+j-2)+" ");
            }
            System.out.println();
        }
    }
}
/*
A B C D 
B C D E
C D E F
D E F G
 */