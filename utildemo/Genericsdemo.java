package utildemo;
class Sample<T>
{
    T obj=null;
    void add(T obj)
    {
        this.obj=obj;
    }
    T get()
    {
        return obj;
    }

}
public class Genericsdemo {
    public static void main(String[] args) {
        Sample<Integer> o1=new Sample<Integer>();
        o1.add(50);
        int a=o1.get();
        System.out.println(a);
        o1.add(75);
        int b=o1.get();
        System.out.println(b);
        //without generic approch
        Sample o2=new Sample();
        o2.add("Mango");
        String s1=(String) o2.get();
        System.out.println(s1);
    }
}
