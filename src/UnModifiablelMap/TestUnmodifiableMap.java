package UnModifiablelMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestUnmodifiableMap {
    static void main() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"RUN");
        map.put(2,"WALK");
        map.put(3,"JUMP");
        Map<Integer,String> unModifyMap =  Collections.unmodifiableMap(map);
        System.out.println(map);
        System.out.println(unModifyMap);
        //if we perform any operation like put(), remove() or clear() then it will throw exception
        //modern approach to create unmodifiable map

        Map<Integer, String> integerStringMap = Map.of(110, "Praj", 222, "Tanmay", 303, "Gupta");
        System.out.println(integerStringMap);
        System.out.println(unModifyMap.entrySet());

        Map<Integer, String> integerStringMap1 = Map.ofEntries(Map.entry(110, "Praj"), Map.entry(222, "Tanmay"), Map.entry(303, "Gupta"));
        System.out.println(integerStringMap1);

        Map<Integer, String> integerStringMap2 = Map.copyOf(unModifyMap);
        System.out.println(integerStringMap2);
    }
}
