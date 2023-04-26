package Lesson_7.sevice;

import Lesson_7.Account;
import Lesson_7.Bill;

public class DepositService {
    public void deposit(Account account, int amount){
        Bill bill = account.getBill();

        int currentBillAmount = bill.getAmount();
        bill.setAmount(currentBillAmount + amount);

        System.out.println("Произошло пополнение счета " + account.getPerson().getName() + " на сумму: " + amount);
        System.out.println("На аккаунте " + account.getPerson().getName() + "cумма средств " + account.getBill().getAmount());

    }
}
