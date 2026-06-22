package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparatorInteger {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(78);
        list.add(99);
        list.add(12);
        list.add(66);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //sort in desc order
       list.sort(new TestComparator2());
        System.out.println(list);
    }
}

class TestComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer t1, Integer t2) {
        return t2-t1;
    }
}
