package utildemo;

public class Unboxingdemo
{
    public static void main(String[] args) {
        Integer a=130;
        System.out.println("integer a:"+a);
        //convert into primitive datatype
        int b=a.intValue();
        System.out.println("int b:"+b);
        //unboxing
        int c=a;
        System.out.println("int c:"+c);
    }
}
