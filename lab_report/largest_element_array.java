//to find the largest element in an array
public class largest_element_array {
    public static void main(String args[]){
        int arr[] = {5,6,7,8,1,2,0,88};
        for(int i=0;i<1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int swap;
                    swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
