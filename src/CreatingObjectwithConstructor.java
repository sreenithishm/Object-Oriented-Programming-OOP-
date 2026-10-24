public class CreatingObjectwithConstructor {
    public static void main(String[] args) {

//    Students[] student = new Students[10];
        students student1 = new students();

        System.out.println(student1.name);
        student1.greeting();
        System.out.println(student1.rollno);
        System.out.println(student1.mark);

    }
}

class students {
    String name;
    int rollno;
    double mark;
    void greeting(){
        System.out.println("My name is"+name);
    }

    students() {
        this.name = "Nithish";
        this.rollno = 69;
        this.mark = 95.00;
    }
}


