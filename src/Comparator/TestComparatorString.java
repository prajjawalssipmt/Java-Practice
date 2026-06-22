package Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class TestComparatorString {
    static void main() {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Mango");
        strList.add("Grapes");

        System.out.println(strList);
        strList.sort(new TestComparatorStringComparator());
        System.out.println(strList);
    }
}


class TestComparatorStringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
