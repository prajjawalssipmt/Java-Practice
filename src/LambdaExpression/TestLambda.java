package LambdaExpression;

public class TestLambda {
    static void main() {

        MathOperation sumOperation=(a,b) -> a+b;
        MathOperation diffOperation=(a,b) -> a-b;
        MathOperation modOperation=(a,b) -> a%b;
        MathOperation productOperation=(a,b) -> a*b;

        System.out.println(diffOperation.operation(199,45));
        System.out.println(sumOperation.operation(199,45));
        System.out.println(modOperation.operation(199,45));
        System.out.println(productOperation.operation(199,45));


    }
}

interface MathOperation{
    int operation(int a, int b);
}
