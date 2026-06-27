package Set;

import java.util.*;

public class TestHashSet {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,43,14,66,31,87,67,99,23,14,31,67,66));
        System.out.println(list);

        Set<Integer> hashSet = new HashSet<>(list);
        hashSet.addAll(list);
        System.out.println(hashSet);

        Set<Integer> lhs = new LinkedHashSet<>(list);
        lhs.addAll(list);
        System.out.println(lhs);
    }
}
