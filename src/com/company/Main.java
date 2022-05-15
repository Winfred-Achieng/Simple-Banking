package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	    Account account1=new Account("Alicia",20,123456,6543_0021,01000,"Equity","Savings");//creating an account

       // System.out.println(account1.toString());
        System.out.println("Enter your account number");
        int accountNo=scanner.nextInt();
        System.out.println("Welcome "+account1.personName+ ".Press 1 to withdraw or Press 2 to deposit and Press 3 to check status");
        int choice=scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Set amount to Withdraw");
                int amountToWithdraw=scanner.nextInt();
                System.out.println(account1.withdraw(amountToWithdraw));
                break;
                case 2:
                    System.out.println("Set amount to Deposit");
                    int amountToDeposit=scanner.nextInt();
                    System.out.println(account1.deposit(amountToDeposit));
                    break;
                        case 3:
                        System.out.println(account1.statusCheck());
                        break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}