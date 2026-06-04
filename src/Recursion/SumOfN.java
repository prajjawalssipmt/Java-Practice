package Recursion;

import java.util.Scanner;

public class SumOfN {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println(addNumber(n));
    }

    public static int addNumber(int n){
        if (n==0){
            return 0;
        }

        return n+addNumber(n-1);
    }
}
