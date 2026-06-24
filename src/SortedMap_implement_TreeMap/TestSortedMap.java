package SortedMap_implement_TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
    static void main() {
        SortedMap<String,Integer> map = new TreeMap<>((a,b)->b.compareTo(a));

        map.put("Tanmay", 23);
        map.put("Yarlav", 75);
        map.put("Prajjawal", 11);
        map.put("Ujjawal", 42);
        map.put("Dhanno", 15);

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Tanmay"));  //excluded Tanmay
        System.out.println(map.tailMap("Tanmay")); //included last value of key

        try {
            System.out.println(map.putFirst("Jaggu",55));
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
