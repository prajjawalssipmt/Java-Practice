package InnerClass.MemberClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        isEngineOn = true;
    }

    class Engine{

        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model+ " Engine is on");
            }else {
                System.out.println(model+ " Engine is already ON");
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model+ " Engine is On");
            }else {
                System.out.println(model+ " Engine is Off");
            }
        }
    }

}
