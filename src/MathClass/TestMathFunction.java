package MathClass;

public class TestMathFunction {
    static void main() {
        double a=12.33;
        double b=27.79;

        double min = Math.min(a, b);
        System.out.printf("Min of %f & %f is %f",a,b,min);

        double max = Math.max(a, b);
        System.out.println(max);

        int c=5;
        double pow = Math.pow(c, 2);
        System.out.println(pow);

        double sqrt = Math.sqrt(64);
        System.out.println(sqrt);

        System.out.println(Math.floor(b));
        System.out.println(Math.ceil(a));
        System.out.println(Math.PI);
        System.out.println((int)(Math.random()*10));
    }
}
