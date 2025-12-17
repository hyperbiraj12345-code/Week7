package Workshop;
public class Main3
{
public static void main(String[] args)
{
Employee e1=new Employee();
e1.name="Hari";
e1.id=101;
e1.salary=10000;
Employee e2=new Employee();
e2.name="Shyam";
e2.id=102;
e2.salary=15000;
Employee e3=new Employee();
e3.name="Radha";
e3.id=103;
e3.salary=20000;
System.out.println("Name\tID\tSalary");
System.out.println(e1.name+"\t"+e1.id+"\t"+e1.salary);
System.out.println(e2.name+"\t"+e2.id+"\t"+e2.salary);
System.out.println(e3.name+"\t"+e3.id+"\t"+e3.salary);
if(e1.salary>e2.salary&& e1.salary>e3.salary){
e1.Display();
}
else if(e2.salary>e1.salary && e2.salary>e3.salary){
e2.Display();
}
else
{
e3.Display();
}
}
}