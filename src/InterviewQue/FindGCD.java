package InterviewQue;

import java.util.Scanner;

public class FindGCD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a=sc.nextInt();
        System.out.print("Enter b num: ");
        int b=sc.nextInt();

        int tempVal= Math.min(a, b);
        while(tempVal>0){
            if (a%tempVal==0 && b%tempVal==0){
                System.out.println("GCD : "+ tempVal);
                break;
            }
            tempVal--;
        }

    }
}
