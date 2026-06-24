package SortedMap_implement_TreeMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TestNavigableMap {
    static void main() {
        NavigableMap<String,Integer> map = new TreeMap<>();
        map.put("Ram",44);
        map.put("Shyam",99);
        map.put("Laxman",23);
        map.put("Hanuman",77);

        System.out.println(map);
        System.out.println(map.headMap("Laxman",false));
        System.out.println(map.descendingMap());
        System.out.println(map.lowerKey("Laxman"));
        System.out.println(map.floorKey("Laxman"));  //return laxman if present else upper key
        System.out.println(map.higherKey("Laxman"));
        System.out.println(map.ceilingKey("Laxman"));  //return laxman if present else lower key
    }
}
