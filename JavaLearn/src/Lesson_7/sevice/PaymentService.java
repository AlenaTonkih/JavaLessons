package Lesson_7.sevice;

import Lesson_7.Account;
import Lesson_7.Bill;

public class PaymentService {
    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("Недостаточно средств для перевода");
        }
        else{
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция, текущее значение счета " + account.getPerson().getName() + " равно: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж завершен, текущее значение счета после оплаты: " + bill.getAmount());
        }
    }
}
