package EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class TestEnumMap {
    static void main() {
            Map<Day,String> eMap = new EnumMap<Day,String>(Day.class);
            eMap.put(Day.FRIDAY,"JUMP");
            eMap.put(Day.SATURDAY,"PUSHUP");
            eMap.put(Day.SUNDAY,"SLEEP");
            eMap.put(Day.MONDAY,"WALK");
            eMap.put(Day.TUESDAY,"EAT");
            eMap.put(Day.WEDNESDAY,"GYM");
            eMap.put(Day.THURSDAY,"RUN");

        System.out.println(Day.WEDNESDAY.ordinal());

        System.out.println(eMap);
        System.out.println(eMap.get(Day.FRIDAY).toLowerCase());
        String s = eMap.get(Day.THURSDAY);

        for (Day day : eMap.keySet()) {
            int ordinal = day.ordinal();
            System.out.println("Day: "+day+" Ordinal/Index: "+ordinal+" Value: "+eMap.get(day));
        }
    }
}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
        }
