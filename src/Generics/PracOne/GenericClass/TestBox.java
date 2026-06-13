package Generics.PracOne.GenericClass;

public class TestBox {
    static void main() {
        Box<Integer> box = new Box();

//        box.setValue("123");
//        String s =(String) box.getValue();
//        System.out.println(s);

//        System.out.println(s.contains("1"));

        box.setValue(123);
        Integer i=(Integer) box.getValue();
        System.out.println(i);
    }
}
