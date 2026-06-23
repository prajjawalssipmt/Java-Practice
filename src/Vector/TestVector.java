package Vector;

import java.util.Arrays;
import java.util.Vector;

public class TestVector {
    static void main() {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        System.out.println(v);

        v.add(5,6);
        System.out.println(v);

        Vector<Integer> v2 = new Vector<>(Arrays.asList(7,8,9));
        v.addAll(0,v2);
        System.out.println(v);

//        v.capacity();
        System.out.println(v.capacity());
        System.out.println(v.isEmpty());

        System.out.println(v2);
        v2.clear();
        System.out.println(v2.isEmpty());

    }
}
