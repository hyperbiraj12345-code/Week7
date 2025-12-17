package Workshop;
public class Main4
{
    public static void main(String[] args)
    {
    Laptop l1=new Laptop("Acer",6,50000); 
    Laptop l2=new Laptop("Asus",12,60000); 
    Laptop l3=new Laptop("Lenovo",24,70000); 
    System.out.println("Details of laptop with ram greater than 8 gb are:");
    System.out.println("brand\tram\tprice");
    if(l1.ram>8)
    {
    l1.Result();  
    }
    if(l2.ram>8)
    {
        l2.Result();
    }
    if(l3.ram>8)
    {
        l3.Result();
    }
    }
}