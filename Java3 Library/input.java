import java.util.*;

class input
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("please enter your name");
        String name=sobj.nextLine();

        System.out.println("please enter your age");
        int age=sobj.nextInt();

        System.out.println("please enter your percentage");
        float percentage=sobj.nextFloat();

        System.out.println("your name is:"+name);
        System.out.println("your age is:"+age);
        System.out.println("your percentage is:"+percentage);
        sobj.close();       //   complesory nahi 
    }
}