package Workshop;
public class Laptop
{
String brand;
int ram;
float price;
public Laptop(String brand,int ram,float price)
{
  this.brand=brand;
  this.ram=ram;
  this.price=price;
}
void Result()
{
System.out.println(brand+"\t"+ram+"\t"+price);
}
}