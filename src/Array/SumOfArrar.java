package Array;

public class SumOfArrar {
    static void main() {
        int[] arr=new int[]{23,45,6,7,89,90};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println("Sum of array : "+sum);
    }
}
