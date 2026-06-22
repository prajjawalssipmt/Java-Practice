package Array;

public class MultiplyExceptOneElement {
    static void main() {
        int[] arr=new int[]{1,3,5,7,9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==3){
                continue;
            }else {
                arr[i]=arr[i]*2;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
