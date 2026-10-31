import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        int i = 35;
        Integer a =35;
        Integer b = 45;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int a,int b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}
