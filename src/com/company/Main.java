package com.company;

/** A simple bank account with a VIP customer
 * @author Felix Ogbonnaya
 * @since 2019-02-04
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        MyAccount account = new MyAccount("0263087775", "Adeyemi julius", 250000, "Adeyemi.julius@gmail.com", "080343536828");
        System.out.println("Account balance is $" + account.getBalance());
        System.out.print("Press ");
        System.out.println("(0 for deposit : 1 for withdrawal : 2 for account details : -1 to end your transaction  ");
        int response = input.nextInt();
        while(response!= -1) {
            if (response == 0) {
                System.out.println("Enter deposit amount");
                amount = input.nextDouble();
                account.Deposit(amount);
            }
            if (response == 1) {
                System.out.println("Enter withdrawal amount");
                amount = input.nextDouble();
                account.Withdraw(amount);
            }
            if (response == 2) {
                System.out.println("");
                System.out.println(account.getName() + " your account details are as follow: ");
                System.out.println("Account number is " + account.getAccountNo());
                System.out.println("Your account balance is $" + account.getBalance());
                System.out.println("Your email is " + account.getEmail());
            }
            System.out.print("Press ");
            System.out.println("(0 for deposit : 1 for withdrawal : 2 for account details : -1 to end your transaction  ");
            response = input.nextInt();
         }
         VipCustomer vip = new VipCustomer("felix", 456);
        System.out.println(vip.getName());
        System.out.println(vip.getEmail());
        System.out.println(vip.getCreditLimit());
    }
}
