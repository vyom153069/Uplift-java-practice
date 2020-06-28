/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_application8;

/**
 *
 * @author shubamg
 */
import java.util.Scanner;
public class Bank_Application8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BankAccount obj=new BankAccount("XYZ","123");
       obj.showMenu();
        // TODO code application logic here
    }
}
    class BankAccount{
        int balance, previousTransaction;
        String customerName, customerId;
        BankAccount(String cname,String cid)
        {
            customerName= cname;
            customerId= cid;
        }
        void deposit(int amount)
        {   
            if(amount!=0)
            {
            balance+= amount;
            previousTransaction= amount;
            }
        }
         void withdraw(int amount)
        {   
            if(amount!=0)
            {
            balance-= amount;
            previousTransaction= -amount;
            }
        }
        void getPreviousTransaction()
        {
            if(previousTransaction>0)
            {
                System.out.println("Deposited:"+previousTransaction);
            }
            else if(previousTransaction<0)
            {
                System.out.println("Withdrawn:"+Math.abs(previousTransaction));
            }
            else
            {
                System.out.println("No previous transaction occured"); 
            }

        }
        void showMenu()
        {
            char option='\0';
            Scanner x=new Scanner(System.in);
            
            System.out.println("WELCOME "+customerName);
            System.out.println("YOUR ID IS "+customerId);
            System.out.println();
            System.out.println("A Check Balance");
            System.out.println("B Deposit");
            System.out.println("C Withdraw");
            System.out.println("D Previous transaction");
            System.out.println("E Exit");
            
            do{
                 System.out.println("**********************************************************************");
                 System.out.println("Enter an option");
                 System.out.println("**********************************************************************");
                 option=x.next().charAt(0);
                 System.out.println();
                 
                 switch(option)
                 {
                     case 'A':
                         System.out.println("---------------------------------");
                         System.out.println("Balance = "+balance);
                         System.out.println("---------------------------------");
                         System.out.println();
                         break;
                    case 'B':
                         System.out.println("---------------------------------");
                         System.out.println("Enter an amount to deposit :");
                         System.out.println("---------------------------------");
                         int amount=x.nextInt();
                         deposit(amount);
                         System.out.println();
                         break;
                    case 'C':
                         System.out.println("---------------------------------");
                         System.out.println("Enter an amount to  withdrawn :");
                         System.out.println("---------------------------------");
                         int amount1=x.nextInt();
                         withdraw(amount1);
                         System.out.println();
                         break;
                    case 'D':
                         System.out.println("---------------------------------");
                         getPreviousTransaction();
                         System.out.println("---------------------------------");
                         System.out.println();
                         break;
                    case 'E':
                        System.out.println("**********************************************************************");
                        break;
                    default:
                        System.out.println("Invalid Option! Please enter again");
                        
                     
                         
                         
                 }
                 
            }while(option!='E');
        
            
           System.out.println("Thank you for using our services");
             
            
        
                
        
        
    }
    
}
