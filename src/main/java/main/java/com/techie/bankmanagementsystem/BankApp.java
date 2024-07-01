package main.java.com.techie.bankmanagementsystem;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bank1 = new BankAccount("Sid", "01");
        bank1.showMenu();
    }
}
class BankAccount{
int balance;
int previousTransaction;
String customerName;
String customerId;

   BankAccount(String cname,String cid){
    customerName = cname;
    customerId =cid;
 }

   void deposit(int amount){
     if(amount != 0){
        balance = balance + amount;
        previousTransaction = amount;
     }
}
 void withdraw(int amount){
    if (amount!= 0){
        balance = balance - amount;
        previousTransaction = amount;
    }
 }
 void getPreviousTransaction(){
    if(previousTransaction >0){
        System.out.println("Deposited:" + previousTransaction);
    }
    else if (previousTransaction <0){
        System.out.println("Withdrawn: "+ Math.abs(previousTransaction));

    }
    else{
        System.out.println("No Transaction has occured!");
    }
}
    void showMenu(){
        char option = '\0';
        Scanner sc = new Scanner (System.in);

         System.out.println("Welcome"+ customerName);
         System.out.println("Your ID is: "+ customerId);
         System.out.println();
         System.out.println("A.Check Balance");
         System.out.println("B. Deposit");
         System.out.println("C. Withdraw");
         System.out.println("D. Previous Transaction");
         System.out.println("E. Exit");
         

        do{
            System.out.println("=========================");
            System.out.println("Enter the option");
            System.out.println("=========================");
            option = sc.next().charAt(0);
            //Convert character to Uppercase
            Character.toUpperCase(option);


                switch (option) {
                    case 'A':
                        System.out.println("===================");
                        System.out.println("Balance is:"+balance);
                        System.out.println("===================");
                        System.out.println();
                    break;
                

                    case 'B':
                    System.out.println("===================");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("===================");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;


                    case 'C':
                    System.out.println("===================");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("===================");
                    int amount1 = sc.nextInt();
                    withdraw(amount1);
                    System.out.println();
                    break;

                    case 'D':
                    System.out.println("===================");
                    getPreviousTransaction();
                    System.out.println("===================");
                    System.out.println();
                    break;

                    case 'E' :
                    System.out.println("===================");
                    break;


                    default:
                    System.out.println("Invalid Option,Kindly Try again");
                    break;
                }

        }while(option != 'E');
    }

   
}

 

   


