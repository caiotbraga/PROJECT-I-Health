package com.Health.build.Financial;
import java.util.ArrayList;

public class AccountStorage {
    ArrayList<Account> accounts = new ArrayList<Account>();

    public void insertion(Account register){
        accounts.add(register);
        System.out.println("Done!");
    }
    public void remotion(Account remote){
        accounts.remove(remote);
        System.out.println("Done!");
    }
    public void consult(int consultator){
        System.out.print("Account infos: ");
        accounts.get(consultator);
    }
}
