package OOP2;

public class OuterClasses {
   static class InnerClasses{
    int age;
    String name;
    static String degree;

    InnerClasses(int age, String name) {
        this.age = age;
        this.name = name;
        InnerClasses.degree = "BCA";
    }
    @Override
        public String toString(){
        return name;
    }
    }

        public static void main(String[] args) {
            InnerClasses in =new InnerClasses(23, "Arun");
            System.out.println(in);
        }
}