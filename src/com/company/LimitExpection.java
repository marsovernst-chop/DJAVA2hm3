package com.company;

public class LimitExpection extends Exception {
    private double reamingAmount;
    public LimitExpection(String message,double reamingAmount){
        super(message);
        this.reamingAmount = reamingAmount;

    }

    public double getReamingAmount() {
        return reamingAmount;
    }
}
