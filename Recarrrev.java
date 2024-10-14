import java.util.*;
public class Recarrrev {
    static void revs(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int tem=arr[l];
        arr[l]=arr[r];
        arr[r]=tem;

        revs(arr, l + 1 , r - 1);

    }
    static void revar(int[] arr){
        int n=arr.length;
        revs(arr,0, n-1);
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
