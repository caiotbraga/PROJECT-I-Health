package Financial;

public class Account {
protected int ID;//ou int pra facilitar a consulta
protected String userName;
protected boolean checkingAccount;
protected boolean savingsAccount;
protected boolean status;//conta ativa ou com restricoes

    public Account(int iD, String userName, boolean checkingAccount, boolean savingsAccount, boolean status) {
    this.ID = iD;
    this.userName = userName;
    this.checkingAccount = checkingAccount;
    this.savingsAccount = savingsAccount;
    this.status = status;
    }

}
