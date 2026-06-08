package WrapperClass;

public class WrapperTest {
    static void main() {

        //wrapper class Integer and Autoboxing
        Integer iObj = Integer.valueOf(44);
        Integer iObj1 = 35;

        int min = Integer.min(iObj1, iObj);
        System.out.println(min);

        //Unboxing
        int c=iObj1;
        int d=iObj;
        System.out.println(c==d);
        int max = Integer.max(c, d);
        System.out.println("Max: "+max);

        //ParseInt
        String age="21";
        int parsedInt=Integer.parseInt(age);
        System.out.println(parsedInt);



    }
}
