package Array;

public class FindMaxMinElement {
    static void main() {
        int[] arr =new int[]{12,34,45,56,78,90,9,87,65,43,21,23,45,67,89};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Max Value : "+max);
        System.out.println("Min Value : "+min);
    }
}
