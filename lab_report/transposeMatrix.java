public class transposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{3,4,5},{4,5,7},{8,9,10}};
        int transpose[][] = new int[3][3];
        System.out.println("The matrix before transpose is");

        //printing before transposing
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+  " ");
            }
            System.out.println();
        }
        //transposing
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        //printing after transposing
        System.out.println("The matrxi after transpose is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
