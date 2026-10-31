public class CallingOneFromOtherConstructor {
    public static void main(String[] args) {

//    Students[] student = new Students[10];
        students student1 = new students();
        students student2 = new students("Rahul", 69, 86.45);

        System.out.println(student1.name);
        System.out.println(student2.name);

    }


    static class students {
        String name;
        int rollno;
        double mark;

        void greeting() {
            System.out.println("My name is " + name);
        }

        students() {
        this("Unknown",01,95.66);
        }

        students(String name, int rollno, double mark) {
            this.name = name;
            this.rollno = rollno;
            this.mark = mark;
        }
    }

}