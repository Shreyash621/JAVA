import java.util.*;
public class arrrevsum {
    static int revs(int arr[],int l,int m){
        if(n==0){
            return 0;
        }
        else{
            l=l+arr[n];
        }
        revs(arr,l,m-1);
        return l;
    }
    static void revar(int[] arr){
        int n=arr.length;
        revs(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,7,9,1};
        revar(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

