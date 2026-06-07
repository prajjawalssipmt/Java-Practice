package OOPs.Polymorphism.CompileTime_Overloading;

public class Addition {

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    String add(String a, String b){
        return a+b;
    }
}
