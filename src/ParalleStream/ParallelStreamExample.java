package ParalleStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alex", "ben", "anna", "charlie", "adam", "david", "emma");

        System.out.println("--- Processing with Parallel Stream ---");

        long start1 = System.currentTimeMillis();
        names.stream()
                // Converts the sequential stream into a parallel one
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .map(name -> name + " ")
                // Prints the element alongside the thread name executing it
                .forEach(name -> {
                    System.out.println("Thread: " + Thread.currentThread().getName() + " | Result: " + name);
                });
        long end1 = System.currentTimeMillis();


        long start2 = System.currentTimeMillis();
        names.parallelStream()
                .filter(name->name.startsWith("a"))
                .map(String::toUpperCase)
                .map(name->name+" ")
                .forEach(name-> System.out.println(Thread.currentThread().getName()+" || "+name));
        long end2 = System.currentTimeMillis();


        System.out.println("Stream time taken : " + (end1 - start1));
        System.out.println("ParallelStream time taken : " + (end2 - start2));
    }
}
