package Generics.PracTwo.GenericMethod;

public class GenMethod {


    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    @SafeVarargs
    public final <T  extends Number> void add(T... a) {
        double sum=0;
        for (T ele : a) {
            sum+=ele.doubleValue();
        }
        System.out.println(sum);
    }


    static void main() {
        Integer[] intArr=new Integer[]{1,2,3,4,5};
        String[] strArr=new String[]{"a","b","c","d"};
        printArray(intArr);
        printArray(strArr);


        GenMethod gm=new GenMethod();
        gm.add(1,2,3,4);
    }
}
