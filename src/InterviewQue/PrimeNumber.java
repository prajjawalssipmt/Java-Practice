package InterviewQue;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check prime: ");
        int num=sc.nextInt();
        boolean isPrime=true;


        for (int i = 2; i < num/2; i++) {

            if (num==2){
                isPrime=true;
                break;
            }

            if (num%i==0){
                isPrime=false;
            }
        }
        System.out.println("Number is prime :  "+isPrime);

    }
}
