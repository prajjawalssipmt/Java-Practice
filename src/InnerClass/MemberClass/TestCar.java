package InnerClass.MemberClass;

public class TestCar {
    static void main() {
        Car car=new Car("tata safari");

        Car.Engine engine =car.new Engine();
        engine.start();
        engine.stop();
    }
}
