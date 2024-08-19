package Methodsdemo;
class maths2
{

    void addition(int x, int y)
    {

        int res=(x+y);
        System.out.println("addition:"+res);
    }
}
public class Method2 {
    public static void main(String[] args) {
        maths2 o=new maths2();
        o.addition(2,3);
    }
}
 