import java.util.*;

public class BankingApplication {


    public static void main(String[] args) {
        
        BankAccount obj = new BankAccount("ABC","xxx001");
        obj.showMenu();
    }
    
}


class BankAccount{

    int balance;
    int prevTnx;
    String customerName;
    String customerId;
    
    BankAccount(String cname, String cid){
    
    customerName = cname;
    customerId = cid;
}


void deposit(int amount)
        {
        if(amount>0){
        balance += amount;
        prevTnx = amount;
        }
        System.out.println("\n"+amount+" Deposited");
}

void withdraw(int amount)
        {
        if(amount!= 0){
        balance -= amount;
        prevTnx = -amount;
        }
        System.out.println("\n"+amount+"Withdrawn ");
}

void showPrevTnx()
{
        if (prevTnx>0)
        System.out.println("Deposited : "+prevTnx);
        else if(prevTnx<0)
        System.out.println("Withdrawn : "+Math.abs(prevTnx));
        else
        System.out.println("No Transaction Made"); 
}

void showMenu()
{

        char option = '\0';
        Scanner sc = new Scanner(System.in);
        
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("WELCOME "+customerName);
System.out.println("\n");
System.out.println("Your ID "+customerId);
System.out.println("\n");
System.out.println("\n");

System.out.println("A. CHECK BALANCE\nB. DEPOSIT\nC. WITHDRAW\nD. PREVIOUS TRANSACTION\nE. EXIT");
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        do
        {
        System.out.println("********************************************************************************");
        System.out.println("Enter an Option: ");
        System.out.println("********************************************************************************");
        option = sc.next().charAt(0);
        System.out.println("\n");
        
        
        switch(option)
        {

case 'A':
case 'a':
        System.out.println("----------------------------------------------------");
        System.out.println("Balance : "+balance);
        System.out.println("----------------------------------------------------");
        System.out.println("This is the current balance");
        System.out.println("\n\n\n");
        break;
        
case 'B':
case 'b':
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the amount to be Deposited : ");
        System.out.println("----------------------------------------------------");
        int amount = sc.nextInt();
        deposit(amount);
        System.out.println("Transaction successful!\n\n\n");
        break;
        
case 'C':
case 'c':
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the amount to be Withdrawn : ");
        System.out.println("----------------------------------------------------");
        int amount2 = sc.nextInt();
        withdraw(amount2);
        System.out.println("Transaction succesful!\n\n\n");
        break;
        
case 'D':
case 'd':
        System.out.println("----------------------------------------------------");
        showPrevTnx();
        System.out.println("----------------------------------------------------");
        System.out.println("\n\n\n");
        break;
        
case 'E':
case 'e':
        System.out.println("......Exiting......");
        break;
        
default: 
        System.out.println("Invalid Option! Please enter again.");
        break;
}
}while(option != 'E' || option != 'e');
System.out.println("Thank You. Have a nice day!");
}
}
