package OOP1;

class Student {
    String name;
}

public class CreatingObject {
    public static void change(Student s) {
        s.name = "Rahul";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nithish";

        change(student);

        System.out.println(student.name);
    }
}