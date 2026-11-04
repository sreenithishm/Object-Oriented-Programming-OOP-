package OOP1;

public class CreatingObjectwithConstructor {
    public static void main(String[] args) {

//    Students[] student = new Students[10];
        students student1 = new students("Nithish",34,97.6);
        students student2 = new students("Rahul",69,86.45);

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

    students(String name,int rollno,double mark) {
        this.name = name;
        this.rollno = rollno;
        this.mark = mark;
    }
}


