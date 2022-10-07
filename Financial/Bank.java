package Financial;

public class Bank {
protected double balance;
Bank entity= new Bank();

//perde receita com o pagamento dos salarios
public void paymentWage(String typeEmployee){

    }   
//receber receita dos tratamentos
public void revenueCollection(Double value){
    setBalance(balance+=value);
    }

//getters e setters
public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}


}
