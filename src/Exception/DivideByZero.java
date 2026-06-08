package Exception;

import java.util.Scanner;

public class DivideByZero {
    static void main() {
        int[] numbers = new int[]{10,20,30,40,50,60,70,80,90,100};
        int[] denominators = new int[]{2,4,6,8,10,12,0,14,16,20};

        try {
            for (int i = 0; i < numbers.length; i++) {
                int result = numbers[i] / denominators[i];
                System.out.println(result);
            }
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am from finally block");
        }
    }
}
