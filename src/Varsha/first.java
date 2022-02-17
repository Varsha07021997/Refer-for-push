package Varsha;
class static_demo
{
    static int age=25;
    static
    {
        System.out.println("My first name is Varsha");
    }
    public static void lastname()
    {
        System.out.println("My last name is Saxena");
    }
}

public class first {

    public static void main(String[] args) {
        static_demo.lastname();
        System.out.println("My age is "+static_demo.age);

    }
}
