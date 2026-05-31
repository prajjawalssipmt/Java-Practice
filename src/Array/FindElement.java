package Array;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={23,45,67,89,76,54,32};
        System.out.println("array size : "+arr.length);
        System.out.print("Enter element to search : ");
        int n=sc.nextInt();
        System.out.println("Element found : "+findElement(arr,n));
        }


    public static boolean findElement(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                System.out.print("At position : "+i+" ");
                return true;

            }
        }
        return false;

    }

}


