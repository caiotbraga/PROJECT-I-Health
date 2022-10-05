package com.Health.build.Financial;

public class Account {
    protected String ID;//ou int pra facilitar a consulta
    protected String userName;
    protected boolean checkingAccount;
    protected boolean savingsAccount;
    protected boolean status;//conta ativa ou com restricoes

    public Account(String iD, String userName, boolean checkingAccount, boolean savingsAccount, boolean status) {
        ID = iD;
        this.userName = userName;
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
        this.status = status;
    }
}