import java.util.Scanner;

public class ArrayTest {
    static void main() {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
