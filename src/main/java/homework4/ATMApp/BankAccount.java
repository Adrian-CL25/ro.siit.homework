package homework4.ATMApp;

public class BankAccount {
    private double balance;


    public BankAccount(double balance) {
        this.balance = balance;

    }
    public double withdraw(int amount){
        return balance-=amount;

    }
    public double interogate(){
        return balance;

    }
    public double addMoney(int amount){
        return balance+=amount;

    }

}
