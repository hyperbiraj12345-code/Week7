package Workshop;
public class Employee
{
int id;
float salary;
String name;

void Display()
{ System.out.println("Details of employee with highest salary is");
    System.out.println("Name\tID\tSalary\t");
    System.out.println(name+"\t"+id+"\t"+salary);
}
}