
import java.util.Scanner;




 class BankAppln
{
     public static void main(String[] args) {
         
         MyBankAccount obj=new MyBankAccount("Amay","AS001612");
         obj.showMenu();
     }
}

public class MyBankAccount {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerId;
    
    
    
    public MyBankAccount(String customerName,String customerId)
    {
        this.customerName=customerName;
        this.customerId=customerId;
    }
    
    public void deposit(int amt)
    {
        if(amt<=0)
            System.out.println("Please Input valid Amount !!!");
        else 
        {
            balance=balance+amt;
            previousTransaction=amt;
        }
    }
    
    public void withdraw(int amt)
    {
         if(amt<=0)
            System.out.println("Please Input valid Amount !!!");
        else 
         {
             balance=balance-amt;
             previousTransaction=-amt;
         }
    }
    
    public void getpreviousTrans()
    {
        if(previousTransaction>0)
            System.out.println("Amount Deposited : "+previousTransaction);
        else if(previousTransaction<0)
            System.out.println("Amount Withdrawn : "+Math.abs(previousTransaction));
        else
            System.out.println("No Transaction Occured !!");
    }
    
    public void showMenu()
    {
        char choice='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+"customerName"+"To Our MyBank Services");
        System.out.println("Your Id : "+customerId);
        System.out.println("\n");
        System.out.println("A -- Check Your Balance");
        System.out.println("B -- Deposit the Amount");
        System.out.println("C -- Withdraw the Amount");
        System.out.println("D -- Check Previous Transaction");
        System.out.println("E -- Exit");
        
        do
        {
            System.out.println("======================================================");
            System.out.println("Enter an option....");
            System.out.println("======================================================");
            choice=sc.next().charAt(0);
            System.out.println("\n");
            
            switch(choice)
            {
                
                
                case 'A' : case 'a':
                    System.out.println("------------------------------------------");
                    System.out.println("Your Balance : "+balance);
                    System.out.println("------------------------------------------");
                    System.out.println();
                    break;
                    
                    
                case 'B' : case 'b':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an Amount to Deposit  ");
                    System.out.println("------------------------------------------");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println("Amount Deposited Successfully !!");
                    System.out.println();
                    break;
                    
                    
                case 'C' :case 'c':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an Amount to withdraw ");
                    System.out.println("------------------------------------------");
                    int amount2=sc.nextInt();
                    withdraw(amount2);
                    System.out.println("Amount Withdraw Successfully !!!!");
                    System.out.println("\n");
                    break;
                    
                case 'D':case 'd':
                    System.out.println("------------------------------------------");
                    getpreviousTrans();
                    System.out.println("------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                case 'E': case 'e':
                    System.out.println("------------------------------------------");
                    break;
                default:
                    System.out.println("Please Input Valid Option !!!");
                    break;
            }
            
        }while(choice !='E'||choice!='e');
        System.out.println("Thank You for using our Services !!!");
        
    }
    
}
