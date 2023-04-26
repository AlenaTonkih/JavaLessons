package Lesson_7;

import Lesson_7.sevice.DepositService;
import Lesson_7.sevice.PaymentService;
import Lesson_7.sevice.TransferService;

public class Main {
    public static void main(String[] args) {
    Person loriPerson = new Person("Lori", "Tompson", "+79234882855");
    Bill loriBill = new Bill(10000);
    Account loriAccount = new Account(loriPerson, loriBill);

    Person tomPerson = new Person("Tom", "Alex", "+79234892956");
    Bill tomBill = new Bill(20000);
    Account tomAccount = new Account(tomPerson, tomBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 7000);
        System.out.println();

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 2000);
        System.out.println();

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, tomAccount, 500);
    }
}
