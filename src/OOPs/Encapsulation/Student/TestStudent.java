package OOPs.Encapsulation.Student;

public class TestStudent {
    static void main() {
        Student s1=new Student(1,"Prajjawal",25);
        Student s2=new Student(2,"Tanmay",26);

        System.out.println(s1.getName());
        System.out.println(s2.getName());

        System.out.println(s2);
        System.out.println(s1);


    }
}
