package staticdemo;
// if clas  contain one static and one instance variable
class Basicmaths
{
    int a=20;
    static int b=10;
    void addtion(int x,int y)
    {
        int res=x+y;
        System.out.println("addtion:"+res);
    }
    static void multiplication(int x, int y)
    {
        int res=x*y;
        System.out.println("multiplication:"+res);
    }
}

public class Maths {
    public static void main(String[] args) {
        Basicmaths obj = new Basicmaths();
        obj.addtion(20, 2);
        Basicmaths.multiplication(10,10);
        System.out.println(obj.a);
    }
}