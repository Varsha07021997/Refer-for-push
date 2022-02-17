package Varsha;
public class Employee {
    private String company,name,designation;
    private int id;
    Employee()
    {
        System.out.println("I am default constructor");
    }
    Employee(String s,int eid,String designation)
    {
        name=s;
        id=eid;
        this.designation=designation;
    }
    public String getCompany()
    {
        return company;
    }
    void setCompany(String company)
    {
        this.company=company;
    }

    @Override
    public String toString() {
        return "My name is "+name+". My employee id is : "+id+" Here I worked as "+this.designation;
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee("Varsha",1234,"JVM Trainee");
        e1.setCompany("To The New");
        System.out.println("I am from "+e1.getCompany());
        System.out.println(e2);

    }
}
