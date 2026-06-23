package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(11,"Prajjawal");
        map.put(31,"Ujjawal");
        map.put(22,"Tanmay");
        map.put(15,"Yarlav");
        System.out.println(map);

        System.out.println(map.entrySet());

        System.out.println(map.keySet() );

        for (Integer i : map.keySet()) {
            System.out.println(map.get(i).toUpperCase());
        }

        Set<Map.Entry<Integer, String>> entries =  map.entrySet();
        System.out.println(entries);


    }
}
