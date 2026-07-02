package Streams;


public class CountCharUsingStream {
    static void main() {
        String sentence="Prajjawal Gupta";
        long count = sentence.chars().filter(ch -> ch == 'a').count();
        System.out.println(count);


    }
}
