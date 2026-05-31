package Array;

import java.util.Scanner;

public class JaggedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] jArr=new int[4][];
        jArr[0]=new int[3];
        jArr[1]=new int[2];
        jArr[2]=new int[4];
        jArr[3]=new int[1];
        int count=0;

        for (int i = 0; i < jArr.length; i++) {
            for (int j = 0; j < jArr[i].length; j++) {
                jArr[i][j]=count++;
            }
        }

        for (int i = 0; i < jArr.length; i++) {
            for (int j = 0; j < jArr[i].length; j++) {
                System.out.print(jArr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
