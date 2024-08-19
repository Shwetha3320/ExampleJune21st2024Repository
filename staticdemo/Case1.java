package staticdemo;
class Person
{
    static String name;
    static void showage(int x)
    {
        System.out.println("age is=" +x);
    }
}
public class Case1 {
    public static void main(String[] args) {
        Person.name="shwetha";
        System.out.println("name=" + Person.name);
        Person.showage(26);
    }
}
