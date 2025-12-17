package Workshop;
public class Mobile
{
String brand;
float price;
public Mobile(String brand,float price)
{
    this.brand=brand;
    this.price=price;
}
void isAffordable()
{
    if(price<20000)
    {
        System.out.println("Brand is affordable");
    }
    else 
    {
     System.out.println("Brand isn't affordable");   
    }
}
}