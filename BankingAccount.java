public class BankingAccount {
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double intialdeposit){
        this.accountNumber = accountNumber; //(this.) refers to the instance variables above and helps assign the constructor value
        this.name = name;
        this.balance = intialdeposit;
    }

    public BankAccount(String accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0;
    }

    public boolean depositMoney(double amount){
        if(amount>0){
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdrawMoney(double amount){
        if(amount>0 && this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public static boolean transferMoney(BankAccount from, BankAccount to, double amount){ //static allows you to call class
        if(from.withdrawMoney(amount)){
            to.depositMoney(amount);
            return true;
        }
        return false;
    }

    public double getBalance(){ //makes the private class public
        return this.balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
//account number

//deposit money and withdraw number

//balance

//name associated with the account

//add function that transfers money

//equals
