package OOP1;

final public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 1002;
        final Integer b =1010;
        final int[] arr ={5,4,5,4,5};
        arr[0]=35;
//        arr = new int[]{45, 5, 2};
//    final OOP1.ClassA student1 = new OOP1.ClassA();
//    student1.name="ss";
//    student1 =new OOP1.ClassA();


}}

class ClassA {
    String name;
    int rollno;
    double mark;

    ClassA(){
        this.name="Nithish";
        this.rollno=69;
        this.mark= 95.00;
    }

}
