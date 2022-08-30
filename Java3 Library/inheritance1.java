import java.lang.*;

class base
{
    public int i;
    public int j;

    public base()
    {
        System.out.println("inside base constructor");
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
    public void fun(int x)
    {
        System.out.println("inside base fun with integer argument");
    }
    public void gun()
    {
        System.out.println("inside base gun");
    }
    
}

class derived extends base      //  class derived : public base
{
    public int x;
    public int y;

    public derived()
    {
        System.out.println("inside derived constructor");
    }
    public void sun()
    {
        System.out.println("inside derived sun");
    }
}
class inheritance1
{
    static
    {
        System.out.println("inside static block");
    }
    public static void main(String a[])
    {
        System.out.println("inside main");
        derived dobj=new derived();
        dobj.fun();
        dobj.fun(11);
        dobj.gun();
        dobj.sun();
    }
}