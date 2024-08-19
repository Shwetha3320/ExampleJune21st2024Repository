package staticdemo;
//can we access instance members to static block
class Basicmaths1
{
    void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("addition result:"+res);
    }
    static void multiplication(int x,int y)
    {
        Basicmaths1 obj=new Basicmaths1();
        obj.addition(10,5);
        int res=(x*y);
        System.out.println("multiplication result"+res);

    }
}
public class Maths1 {
    public static void main(String[] args) {
        Basicmaths1.multiplication(20,5);
    }
}
