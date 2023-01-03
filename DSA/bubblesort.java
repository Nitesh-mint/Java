public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {5,7,8,1,2,0};
        for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[i+1]){
                    int swap;
                    swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
