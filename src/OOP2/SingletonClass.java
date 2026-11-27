package OOP2;

public class SingletonClass {
    private static SingletonClass instance;
     private SingletonClass() {
     }

    public static SingletonClass getInstance(){
    if(instance==null){
    instance=new SingletonClass();
    }
    return instance;

}
}
class access{
    public static void main(String[] args) {
        SingletonClass in = SingletonClass.getInstance();
        SingletonClass out = SingletonClass.getInstance();
        SingletonClass out2 = SingletonClass.getInstance();
        System.out.println();
    }
}
