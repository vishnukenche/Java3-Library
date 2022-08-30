import java.lang.*;

class Demo
{
    public int Arr[];

    public Demo(int size)
    {
        System.out.println("allocating the resources in constructor");
        this.Arr=new int[size];
    }
    protected void finalize()
    {
        System.out.println("deallocating the resources in finalize");
        this.Arr=null;
    }
}

class garbagecollector
{
    public static void main(String a[])
    {
        Demo dobj=new Demo(10);
        dobj=null;
        System.gc();
        System.out.println("End of main");

    }
}