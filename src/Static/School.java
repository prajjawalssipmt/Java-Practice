package Static;

public class School {

    public static School school = new School();

    //private constructor
    private  School() {
    }

    public static School getInstance(){
        return school;
    }
}
