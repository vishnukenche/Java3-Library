import java.lang.*;
import java.io.*;

class input1
{
    public static void main(String arg[])throws IOException
    {
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedReader bobj=new BufferedReader(iobj);

        System.out.println("enter your name");
        String name=bobj.readLine();

        System.out.println("your name is :"+name);
    }
}