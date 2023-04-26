package Lesson_7.sevice;

import Lesson_7.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount){

        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();

        if (billToAmount < amount){
            System.out.println("Перевод не возможен, не хватает средств");
        }
        else {
            System.out.println("Происходит перевод средств с аккаунта - "+ accountFrom.getPerson().getName() + " на аккаунт - " + accountTo.getPerson().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountFrom.getBill().setAmount(billToAmount + amount);
            System.out.println("Сумма средств на аккаунте " + accountFrom.getPerson().getName() + " составляет " + accountFrom.getBill().getAmount());
            System.out.println("Сумма средств на аккаунте " + accountTo.getPerson().getName() + " составляет " + accountTo.getBill().getAmount());
            System.out.println("Вы успешно перевели " + amount + " рублей");
        }

    }
}
