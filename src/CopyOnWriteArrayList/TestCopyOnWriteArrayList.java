package CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList {
    static void main() {
        List<String> cowa = new CopyOnWriteArrayList<>(); //In ArrayList you cannot add data while reading list
        cowa.add("Milk");
        cowa.add("Eggs");
        cowa.add("Bread");
        System.out.println(cowa);

        for (String s : cowa) {
            if (s.equals("Eggs")) {
                cowa.add("Butter");
                System.out.println("Butter added to reading list");
            }
        }
        System.out.println(cowa);
    }
}
