package lesson.lesson3.task2;

import lesson.lesson3.task2.interfac.Transferable;

public class FixedBalanceAccount extends Account implements Transferable {
    public FixedBalanceAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void transfer(Account destination, double amount) {
        super.setBalance(super.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);
    }
}