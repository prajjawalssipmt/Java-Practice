package Comparator.Developer;

import java.util.ArrayList;
import java.util.Comparator;

public class ExperienceComparator {  // implements Comparator<Developer>{

//    @Override
//    public int compare(Developer d1, Developer d2) {
//        return d2.getExperienceYears() - d1.getExperienceYears() ;
//    }

    static void main() {
        Developer developer=new Developer("Prajjawal",3);
        Developer developer1=new Developer("Tanmay",2);
        Developer developer2=new Developer("Gupta",4);
        Developer developer3=new Developer("Guptaa",4);

        ArrayList<Developer> dev=new ArrayList<>();
        dev.add(developer);
        dev.add(developer1);
        dev.add(developer2);
        dev.add(developer3);

//        dev.sort(new ExperienceComparator());
//        System.out.println(dev);

//        dev.sort((d1,d2)->Integer.compare(d2.getExperienceYears(),d1.getExperienceYears()));
//        for(Developer d:dev){
//            System.out.println(d);
//        }

        dev.sort(Comparator.comparingInt(Developer::getExperienceYears).thenComparing(Developer::getName));
        System.out.println(dev);
        System.out.println(dev.reversed());

    }
}
