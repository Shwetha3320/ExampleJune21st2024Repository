package Methodsdemo;
class maths
{
   void addition()
    {
        int x,y,res;
        x=2; y=3;
         res=x+y;

        System.out.println("addition="+res);
    }
}
public class method1 {
    public static void main(String[] args) {
        maths o=new maths();
        o.addition();
    }

}
