package com.perry.pattern.pattern.structural.bridge;

/**
 * 银行
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();
}
