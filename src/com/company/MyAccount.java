package com.company;
public class MyAccount {

    private String accountNo;
    private double balance;
    private String name;
    private String email;
    private String phoneNo;

    public MyAccount(String accountNo, String name, double balance, String email, String phoneNo){
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.phoneNo = phoneNo;

    }
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public void Deposit(double deposit){
        this.balance += deposit;
        System.out.println("Your deposit of $"+ deposit +" is successful and new account balance is $" +  this.balance);
    }
    public void Withdraw(double withdraw){
        if(withdraw < balance) {
            this.balance -= withdraw;
            System.out.println("Withdrawal of $"+ withdraw + " is processing new account balance is $ " + this.balance);
        }
        else
            System.out.println("Insufficient funds only $"+ this.balance +" is available");
    }
}

