package Workshop;
public class Main5
{
    public static void main(String[] args)
    {
    Mobile m1=new Mobile("Samsung",25000);
    Mobile m2=new Mobile("Redmi",19000);
    System.out.println("For Samsung");
    m1.isAffordable();
    System.out.println("For Redmi");
    m2.isAffordable();
    }
}