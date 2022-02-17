package Varsha;
import java.util.Scanner;
public class MyProgram_XDONE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String result="",str="";
        System.out.println("Press XDONE if you want to exit.\nEnter some string :");
        while(!str.equals("XDONE"))
        {
            str=sc.next();
            if(str.equals("XDONE"))
                break;
            result=result+str+" ";
        }
        System.out.println(result);
    }
}