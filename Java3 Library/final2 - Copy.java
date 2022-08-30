import java.lang.*;

class base
{
    public void fun()
    {
        System.out.println("base fun");
    }
    public final void gun()
    {
        System.out.println("base gun");
    }
}

class derived extends base
{
    public void fun()         // overriding
    {
        System.out.println("derived fun");
    }
 /*   public void gun()       // not allowed
    {
        System.out.println("derived gun");
    } 
 */   
}


class final2
{
    public static void main(String a[])
    {
        derived dobj=new derived();
        dobj.fun();      // derived fun
        dobj.gun();       // base gun
    }
}