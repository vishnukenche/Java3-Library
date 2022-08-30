import java.lang.*;

class base
{
    public int i;
    public int j;

    public base(int a,int b)
    {
        this.i=a;
        this.j=b;
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
}

class derived extends base      //  class derived : public base
{
    public int x;
    public int y;

    public derived()
    {
        super(11,21);
        System.out.println("inside derived constructor");
        this.x=30;
        this.y=40;
    }
    public void sun()
    {
        System.out.println("inside derived sun");
        System.out.println(super.i);      // 10
        super.fun();        
    }
}
class inheritance3
{
    
    public static void main(String a[])
    {
        System.out.println("inside main");
        derived dobj=new derived();
        
        dobj.sun();
    }
}