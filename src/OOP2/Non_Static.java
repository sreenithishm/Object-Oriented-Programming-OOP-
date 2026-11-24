package OOP2;

import com.sun.tools.javac.Main;

public class Non_Static {
    public static void main(String[] args) {

    function2();

    }
    static void function2(){
        Non_Static obj =new Non_Static();
        obj.function();
        obj.function3();
        System.out.println(2);
    }
    void function(){
        System.out.println(1);
    }
    void function3(){
        function();
        System.out.println(4);
    }
}
