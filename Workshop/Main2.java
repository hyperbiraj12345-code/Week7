package Workshop;
public class Main2
{
public static void main(String[] args)
{
 Rectangle r1=new Rectangle();
 r1.length=10;
 r1.breadth=5;
 System.out.println("Length of first rectangle="+r1.length);
 System.out.println("Breadth of first rectangle="+r1.breadth);
  r1.Area();
Rectangle r2=new Rectangle();
 r2.length=20;
 r2.breadth=10;
System.out.println("Length of second rectangle="+r2.length);
 System.out.println("Breadth of second rectangle="+r2.breadth);
  r2.Area();
}
}