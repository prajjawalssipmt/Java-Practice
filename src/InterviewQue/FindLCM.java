package InterviewQue;

import java.util.Scanner;

public class FindLCM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int a=sc.nextInt();
        System.out.print("Enter b num: ");
        int b=sc.nextInt();


        int lcm=Math.min(a,b);
        while (true){
            if (lcm%a==0 && lcm%b==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}
