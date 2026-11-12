package OOP2;

public class Static {
    String name;
    int age;
    long salary;
    boolean marriage_status;
    static long population;

    Static (String person,int age,long salary,boolean marriage_status){
    this.name=person;
    this.age=age;
    this.salary=salary;
    this.marriage_status=marriage_status;
    Static.population=population+1;
    }

    public static void main(String[] args) {
        Static name1 =new Static("Nithish",22,100000,false);
        Static name2 =new Static("Arun",28,200000,true);
        System.out.println(name1.name);
        System.out.println(Static.population);
    }
}

