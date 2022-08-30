import java.lang.*;

class demo
{
    public int i;
    public int j;

    public demo()
    {
        this.i=0;
        this.j=0;
    }

    public demo(int x,int y)
    {
        this.i=x;
        this.j=y;
    }

    public void fun()
    {
        System.out.println("Inside fun");
    }

    public void gun()
    {
        System.out.println("Inside gun");
    }
}

class marvellous
{
    public static void main(String arr[])
    {
        System.out.println("Inside main");
        demo obj=new demo();
        obj.fun();     // fun(obj);
        obj.gun();     // gun(obj);
        System.out.println(obj.i);

        demo objx=new demo(11,21);
        objx.fun();     // fun(objx);
        objx.gun();     // gun(objx);
        System.out.println(objx.i);

    }
}

