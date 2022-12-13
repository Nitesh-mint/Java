class sor {
    public static void main(String args[]){
        int[] arr={1,2,4,6,8,9,0,3};
        for(int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;  
                }
                
            }
            System.out.println(arr[i]);
        }  
    }
}
