package OOP2;

public class Static_Block {
    static int a =5;
    static int b;

    static {
        System.out.println("Class executed");
    }

    public static void main(String[] args) {
        Static_Block block = new Static_Block();
        System.out.println(Static_Block.a+""+Static_Block.b);
        System.out.println(a+""+b);
    }
}
