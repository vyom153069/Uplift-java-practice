package bankingapplication;

import java.util.*;

public class BankingApplication {


    public static void main(String[] args) {
        
        String nam;
        String id;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        nam = s.nextLine();
        System.out.println("Enter your ID: ");
        id = s.nextLine();
        BankAccount obj = new BankAccount(); //An instance (Obj) is created of the class BankAccount.
        obj.bankAcc(nam,id); //Funtion call for passing User Input (user name and user ID).
        obj.showMenu();  //Function call for display of Main Menu.
        
    }
    
}

class BankAccount{

    int balance;
    int prevTnx;
    String customerName;
    String customerId;
 
    /*Function for copying values of Actual arguments i.e. nam & id to formal arguments i.e. cname & cid
      and then assigning them to local variables i.e. customerName & customerId*/
 void bankAcc(String cname,String cid){
      
   customerName=cname;
   customerId=cid;
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
//Funtion for display of Previous Transactions made.
void showPrevTnx()
{
    System.out.println("Previous Transaction.");
    
        if (prevTnx>0)
        System.out.println("Deposited : "+prevTnx);
        else if(prevTnx<0)
        System.out.println("Withdrawn : "+Math.abs(prevTnx));
        else
        System.out.println("No Transaction Made"); 
}
//Function for Display of Main Menu with User Name & User ID
void showMenu()
{

        char option = '\0';
        Scanner sc = new Scanner(System.in);
       
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("WELCOME "+customerName); //Displays User Name
System.out.println("Your ID "+customerId); //Displays User ID
//Menu contains five options out of which one is to be selected by the User 
System.out.println("A. CHECK BALANCE\nB. DEPOSIT\nC. WITHDRAW\nD. PREVIOUS TRANSACTION\nE. EXIT");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
        do
        {
        System.out.println("********************************************************************************");
        System.out.println("Enter an Option: ");
        System.out.println("********************************************************************************");
        //User's choice of Option entered.
        //Input could be in lowercase or uppercase.
        option = sc.next().charAt(0);
        
           switch(option)
        {
//Checks if the User Input matches any case.              
case 'A':
case 'a':
        System.out.println("----------------------------------------------------");
        System.out.println("Balance : "+balance);
        System.out.println("----------------------------------------------------");
        System.out.println("This is the current balance");
        System.out.println("__________________________________________________________________________________________________________________________________________");
        break;
        
case 'B':
case 'b':
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the amount to be Deposited : ");
        System.out.println("----------------------------------------------------");
        int amount = sc.nextInt();
        deposit(amount);
        System.out.println("Transaction successful!");
        System.out.println("__________________________________________________________________________________________________________________________________________");
        break;
        
case 'C':
case 'c':
        System.out.println("----------------------------------------------------");
        System.out.println("Enter the amount to be Withdrawn : ");
        System.out.println("----------------------------------------------------");
        int amount2 = sc.nextInt();
        withdraw(amount2);
        System.out.println("Transaction succesful!");
        System.out.println("__________________________________________________________________________________________________________________________________________");
        break;
        
case 'D':
case 'd':
        System.out.println("----------------------------------------------------");
        showPrevTnx();
        System.out.println("----------------------------------------------------");
        System.out.println("__________________________________________________________________________________________________________________________________________");
        break;
        
case 'E':
case 'e':
        System.out.println("......Exiting......");
        break;
//Executes default when none of the cases match.        
default: 
        System.out.println("Invalid Option! Please enter again.");
        break;
}
}while(option != 'E' && option != 'e'); //Checks if the condition is True or False, if it's True then the loop continues otherwise control goes out of loop.
                                         
System.out.println("Thank You. Have a nice day!");//Prints this statement if the Condition is False.
}
}
