package com.company;

public class BamkAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public double deposit (double sum){
        return amount+=amount;
    }
    public void withdraw(int sum)throws LimitExpection{
        if (amount<amount);
        throw new LimitExpection("у вас нет денег на счету.\nСчитано"+amount,amount);

    }
}
