//Employee_details_using_constructor_overloading//
import java.util.*;

class Employee
{
    String a;
    int b,c;
    Employee()
    {
      System.out.println("Employee details");
    }
    Employee(String a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void display()
    {
        System.out.println("Name: "+a+" Age: "+b+" Salary: "+c);
    }
}

public class Employee_details_using_constructor_overloading
{
    public static void main(String args[])
    {
        String n;
        int a1,s1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter details...");
        System.out.print("Enter name:");
        n = in.next();
        System.out.print("Enter age:");
        a1 = in.nextInt();
        System.out.print("Enter salary:");
        s1 = in.nextInt();
        //System.out.println("** Employee Details **");
        Employee e = new Employee();
        Employee e1 = new Employee(n, a1, s1);
        e.display();
        e1.display();
        in.close();
    }
}
