public class CreatingObject {
    public static void main(String[] args) {

    Students[] student = new Students[10];
    Students student1 = new Students();
    student1.rollno=69;
    student1.name="Nithish";
    student1.mark= 95.00;
            System.out.println(student1);

}}

class Students {
    String name;
    int rollno;
    double mark;
}
