package com.company;

public class Account extends Person{
    String bankName;
    String accountType;
    private int amount=500;//original amount
    int amountToWithdraw;
    int amountToDeposit;
    int balance;

    Account(String personName,int age,int govtID,int adressNO,int KRA_Pin,String bankName,String accountType){
        super(personName,age,govtID,adressNO,KRA_Pin);
        this.bankName=bankName;
        this.accountType=accountType;
    }
    Account(String personName,int age,int govtID,int adressNO,int KRA_Pin,String bankName,String accountType,int amountToWithdraw,int amountToDeposit){
        super(personName,age,govtID,adressNO,KRA_Pin);
        this.bankName=bankName;
        this.accountType=accountType;
        this.amountToWithdraw=amountToWithdraw;
        this.amountToDeposit=amountToDeposit;
    }

    @Override
    public String toString() {

        return super.toString()+this.bankName+"\n"+this.accountType;
    }

    public int getAmount() {
        int amount=balance;
        return amount;
    }


    public String withdraw(int amountToWithdraw){
        int balance=amount-amountToWithdraw;
        return "You have withdrawn "+amountToWithdraw+".Your balance is "+ balance;
    }

    public String deposit( int moneyToDeposit){
        int balance= amount+ moneyToDeposit;
        return "You have deposited "+moneyToDeposit+".Your balance is "+ balance;
    }

    public String statusCheck(){
        return "The amount in your account is  "+amount;
    }
}
