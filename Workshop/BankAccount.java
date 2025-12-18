package Workshop;
import java.util.Scanner;
public class BankAccount
{
String Name;
float balance;
int acc_no;
Scanner s=new Scanner(System.in);
public BankAccount(String Name,int acc_no,float balance)
{
  this.Name=Name;
  this.balance=balance;
  this.acc_no=acc_no;
}
void depositMoney()
{
System.out.println("Enter the money to deposit");
float deposit=s.nextFloat();
balance=balance+deposit;
}
void withdrawMoney()
{
 System.out.println("Enter the money to withdraw"); 
 float withdraw=s.nextFloat();
if(withdraw>balance)
{
     System.out.println("Your account doesnt have enough money");
}
 else
{
     System.out.println("Withdraw Successful");
      balance=balance-withdraw;
}

}
void displayBalance()
{
System.out.println("Current balance is "+balance);
}
}
