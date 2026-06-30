package LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicate {
    static void main() {

        Predicate<Integer> isEven = i -> i%2==0;
        System.out.println("Number is even : "+isEven.test(234));


        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string to check it is starting with P and ending with L : ");
        String s=sc.nextLine();


        Predicate<String> startingWithA = str ->str.toLowerCase().startsWith("p");
        System.out.println(startingWithA.test(s));

        Predicate<String> endingWithL = str ->str.toLowerCase().endsWith("l");
        System.out.println(endingWithL.test(s));

        Predicate<String> and = startingWithA.and(endingWithL);
        System.out.println(and.test(s));
    }
}
