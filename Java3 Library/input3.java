import java.io.*;

class input3
{
    public static void main(String arg[])throws IOException
    {
            InputStreamReader iobj=new InputStreamReader(System.in);
            BufferedReader bobj=new BufferedReader(iobj);

            System.out.println("enter string");
            String str=bobj.readLine();

            System.out.println("enter integer");
            int no=Integer.parseInt(bobj.readLine());

            System.out.println("enter float");
            float f=Float.parseFloat(bobj.readLine());

            System.out.println("enter double");
            double d=Double.parseDouble(bobj.readLine());

            System.out.println("enter string is:"+str);
            System.out.println("enter integer is:"+no);
            System.out.println("enter float is:"+f);
            System.out.println("enter double is:"+d);
    }
}
