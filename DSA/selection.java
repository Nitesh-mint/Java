public class selection {
    public static void main(String[] args) {
        int arr[] = {5,7,8,1,2,0};
        for(int min=0;min<arr.length;min++){
            for(int i=min+1;i<arr.length;i++){
                if(arr[min]>arr[i]){
                    int swap;
                    swap = arr[min];
                    arr[min] = arr[i];
                    arr[i] = swap;
                }
            }   
        }
        for( int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
