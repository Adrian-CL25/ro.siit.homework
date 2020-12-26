package homework4.ATMApp;

import java.util.Scanner;

public class Cards {
    private String pin;
    private final String name;
    boolean yes;

    public void setYes(boolean yes) {
        this.yes = yes;
    }

    public Cards(String pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    public void checkPin() {
        Scanner keyboard = new Scanner(System.in);
        this.pin = getPin();
        System.out.print("ENTER YOUR PIN: ");
        String entry = keyboard.next();
        int i = 0;

        while (!entry.equals(pin)) {
            if (i < 2) {
                System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                System.out.print("ENTER YOUR PIN: ");
                entry = keyboard.next();
            } else {
                System.out.println("Card Blocked!");
                setYes(false);
                break;
            }
            i++;
        }

        if (entry.equals(pin)) {
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
            setYes(true);
        }

    }
}

