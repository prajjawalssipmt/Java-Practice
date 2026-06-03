package TwoDimensionArray;

public class MatrixMultiplication {
    static void main() {
        int[][] matrix1=new int[][]{{1,2,3},
                                    {4,5,6},
                                    {7,8,9},
                                    {10,11,12}};
        int[][] matrix2=new int[][]{{1,3,5,10},
                                    {7,9,2,11},
                                    {4,6,8,12}};
        int r1 =4,c1=3,r2=3,c2=4;

        matrixMultiplication(matrix1,r1,c1,matrix2,r2,c2);
    }

    static void printMatrix(int[][] matrix,int row,int col){
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void matrixMultiplication(int[][] mat1,int r1,int c1,int[][] mat2,int r2,int c2){

        System.out.println("First Matrix");
        printMatrix(mat1,r1,c1);
        System.out.println("\nSecond Matrix");
        printMatrix(mat2,r2,c2);

        int[][] prodcut=new int[r1][c2];
        if (r1==c2){
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        prodcut[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }

            System.out.println("\nProduct Matrix");
            printMatrix(prodcut,r1,c2);

        }

    }
}
