package Workshop;
public class Main
{ 
    public static void main(String[] args)
    {
     Book b1=new Book();
     b1.Title="Muna_Madan";
     b1.Author="Laxmi_Prasad_Devkota";
     b1.Price=500;
     Book b2=new Book();
     b2.Title="Harry_Potter";
     b2.Author="J.K Rowling";
     b2.Price=800;
     System.out.println("Title\t\tAuthor\t\t\tPrice");
    b1.Display();
    b2.Display();
    }
}
