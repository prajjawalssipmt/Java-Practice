package Static;

public class TestStudent {
    static void main() {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student.getCount();

        System.out.println(School.getInstance().toString());
        System.out.println(School.getInstance());

    }
}
