package staticdemo;
//can we access static members in the instance block
class Basicmaths2
{
    void addition(int x,int y)
    {
        Basicmaths2.multiplication(10,20);
       int res=(x+y);
        System.out.println("addtion result="+res);
    }
     static void multiplication(int x,int y)
     {
         int res=(x*y);
         System.out.println("multiplicartion result="+res);
     }
}

public class Maths2 {
    public static void main(String[] args) {
        Basicmaths2 obj=new Basicmaths2();
        obj.addition(10,20);
    }
}
