class ArrRev{
    public static void main(String[] args) {
        int arr[] = {23,34,56,67};
        int i = 0, e= (arr.length);
        for(i=0;i<((arr.length/2));i++){
           int temp=arr[i];
           arr[i]=arr[e-1];
           arr[e-1]=temp;
           e--;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");

        }
    }
}