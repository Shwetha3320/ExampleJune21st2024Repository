package staticdemo;
//can we access instance variable in instance block
class Basicmaths3
{
    int addition(int x,int y)
    {
        return(x+y);
    }
    int subtraction(int x,int y)
    {
        return(x-y);
    }
    void multiplication()
    {
        int a= this.addition(20,10);
        int b=this.subtraction(5,1);
        int res=(a*b);
        System.out.println("multiplication result:"+res);
    }
}
public class Maths3 {
    public static void main(String[] args) {
        Basicmaths3 o=new Basicmaths3();
        o.multiplication();
    }

}
