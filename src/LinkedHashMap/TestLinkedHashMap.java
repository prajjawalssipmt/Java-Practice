package LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashMap {
    static void main() {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(16,0.75f,true);
        lhm.put("A",1);
        lhm.put("B",2);
        lhm.put("C",3);

        lhm.get("A");
        lhm.get("C");

        Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println();
// //////////////////////////////////////////////////////////////////////////

        HashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(4,"D");
        hm.put(5,"E");


        LinkedHashMap<Integer,String> lhm2 = new LinkedHashMap<>(hm);
        lhm2.get(3);
        lhm2.get(4);
        Set<Map.Entry<Integer, String>> entries1 = lhm2.entrySet();

        for (Map.Entry<Integer, String> entry : entries1) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
