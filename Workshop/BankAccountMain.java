package Workshop;

public class BankAccountMain
{
    public static void main(String[] args)
    {
    BankAccount b1=new BankAccount("Hari",101,10000);
    System.out.println("For first account");
    System.out.println("Name ="+b1.Name+"\tAccount_No ="+b1.acc_no);
    System.out.println("Initial Balance is "+b1.balance);
    b1.depositMoney();
    b1.withdrawMoney();
    b1.displayBalance();
    System.out.println();
    BankAccount b2=new BankAccount("Shyam",102,20000);
    System.out.println("For second account");
    System.out.println("Name ="+b2.Name+"\tAccount_No ="+b2.acc_no);
    System.out.println("Initial Balance is "+b2.balance);
    b2.depositMoney();
    b2.withdrawMoney();
    b2.displayBalance();
    }
}