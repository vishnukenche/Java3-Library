import java.lang.*;

class base          // class base extends object
{
    public int i;
    public int j;


    public void fun()
    {
        System.out.println("inside base fun");
    }
}

class derived extends base      //  class derived : public base
{
    public int x;
    public int y;

    public void gun()
    {
        System.out.println("inside derived gun");
               
    }
}
class derivedX extends derived
{
    public int a;

    public void sun()
    {
        System.out.println("inside derivedX sun");
    }
}
class inheritance4
{
    
    public static void main(String a[])
    {
        System.out.println("inside main");
        derived dobj=new derived();
        
        dobj.sun();
    }
}