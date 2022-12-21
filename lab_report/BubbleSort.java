public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,88,9,3,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        for(int z =0;z<arr.length;z++){
            System.out.print(arr[z] + " ");
        }
    }
}
