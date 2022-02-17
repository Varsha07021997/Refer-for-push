package Varsha;
import java.util.*;

import static java.lang.System.exit;

public class Circle {
    static void area(int r)
    {
        System.out.println("Area of Circle :" +(3.14*r*r));
    }
    static void circumference(int r)
    {
        System.out.println("Circumference of circle :"+(2*3.14*r));
    }
    public static void main(String[] args)
    {
        try
        {

            do
            {
                System.out.println("*******Menu*******\n" +
                        "1. Calculate Area of Circle\n" +
                        "2. Calculate Circumference of a Circle\n" +
                        "3. Exit.\n" +
                        "Enter your choice (1-3):");

                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();

                switch (ch)
                {
                    case 1:
                        System.out.println("Enter the radius of the circle:");
                        int r = sc.nextInt();
                        area(r);
                        break;
                    case 2:
                        System.out.println("Enter the radius of the circle:");
                        int r1 = sc.nextInt();
                        circumference(r1);
                        break;
                    case 3:
                        System.out.println("Successfully Exit");
                        exit(0);
                    default:
                        System.out.println("Wrong choice");
                }


            } while (true);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
