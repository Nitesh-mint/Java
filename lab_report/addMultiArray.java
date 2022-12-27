public class addMultiArray{
    public static void main(String args[]){
        int arr [][] = {{3,2},{9,5},{1,6}};
        int arr1 [][] = {{5,2},{1,5},{1,4}};
        for(int i=0;i<arr.length;i++){
            for(int j=0 ; j<2;j++){
                System.out.print(arr[i][j] + arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
