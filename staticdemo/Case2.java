package staticdemo;
class Person1 {
    void showname(String name)
    {
        System.out.println("name is:" +name);
    }

    void showage(int age)
    {
        System.out.println("age is:" +age);
    }
}
public class Case2 {
    public static void main(String[] args) {
    Person1 obj=new Person1();
    obj.showname("ami9");
    obj.showage(20);
    }
}
