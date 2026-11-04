package OOP1;

public class GarbageCollector {
    public static void main(String[] args) {
        object name1;
        for (int i = 0; i < 100000000; i++) {
            name1=new object("Nithish");
        }
    }

}
class object {
    String name;
    String dept;
    object(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }
}