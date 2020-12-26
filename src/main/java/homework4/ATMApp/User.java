package homework4.ATMApp;

public class User {

    private final String fName;
    private final String lName;
    private final BankAccount account;
    private final Cards card;

    public Cards getCard() {
        return card;
    }

    public User(String fName, String lName, BankAccount account, Cards card) {
        this.fName = fName;
        this.lName = lName;
        this.account = account;
        this.card = card;
    }

    @Override
    public String toString() {
        return fName + "\t" + lName;
    }

    public BankAccount getAccount() {
        return account;
    }


}
