package OOPs.Encapsulation.NewStudent;

class Student {
    // Instance variables
    String name;
    int rollNo;
    int age;

    // Constructor to initialize variables
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Overriding toString() to print details easily
    @Override
    public String toString() {
        return "Roll No:00 " + rollNo + " | Name: " + name + " | Age: " + age;
    }
}
