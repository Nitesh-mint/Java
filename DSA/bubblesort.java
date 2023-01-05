public class bubblesort{
    public static void main(String[] args) {
        int arr[] = {5,9,8,1,2,0};
        for(int i=0;i<arr.length;i++){
                for(int j=1;j<arr.length-i;j++){
                    if(arr[j-1]>arr[j]){
                        int swap = arr[j-1];
                        arr[j-1] =  arr[j];
                        arr[j] = swap;
                    }
                }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
