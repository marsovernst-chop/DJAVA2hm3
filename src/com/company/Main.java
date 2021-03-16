package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BamkAccount bamkAccount = new BamkAccount();
        bamkAccount.deposit(50000);
        System.out.println("банк:" + bamkAccount.getAmount() + "dollar.");
        System.out.println("ввзять");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextByte();

        while (true) {
            try {
                System.out.println(bamkAccount.getAmount());
                bamkAccount.withdraw(t);


            } catch (LimitExpection r) {
                System.out.println(r.getMessage());
                try {
                    bamkAccount.withdraw((int) bamkAccount.getAmount());


                } catch (LimitExpection limitExpetion) {
                    limitExpetion.printStackTrace();
                }
                break;
            }

        }
    }
}