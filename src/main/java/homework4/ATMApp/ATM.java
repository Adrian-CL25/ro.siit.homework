package homework4.ATMApp;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Cards card1 = new Cards("1234", "VISA");
        Cards card2 = new Cards("0000", "MasterCard");
        Cards card3 = new Cards(null, null);
        User user = new User("Joe", "Biden", new BankAccount(10000.00), card3);

        System.out.println("****************Welcome to the ATM Machine!***********");
        System.out.println("                  Please insert your card!               ");
        System.out.println("******************************************************");
        System.out.println("1.Card Visa\n2.Card MasterCard");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        if (option == 1) {
            card1.checkPin();
            if (card1.yes) {
                card3 = card1;
            }else{
                card3 = null;
            }
        } else if (option == 2) {
            card2.checkPin();
            if (card2.yes) {
                card3 = card2;
            }else{
                card3 = null;
            }
        } else {
            card3 = null;
            System.out.println("No compatibile card! Thank you for visiting us!");

        }
        if (card3 != null) {
            System.out.println("Welcome " + user);
            while (card3 != null) {
                System.out.println("Select one of following option:");
                System.out.println("\t1: Interogate sold");
                System.out.println("\t2: Withdraw");
                System.out.println("\t3: Deposit");
                System.out.println("\t4: Change PIN");
                System.out.println("\t5: Exit" + "\n");
                option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Your sold: " + user.getAccount().interogate() + "$");
                        break;
                    case 2:
                        System.out.println("Enter your amount:");
                        int amount = sc.nextInt();
                        System.out.println("Your balance now " + user.getAccount().withdraw(amount) + "$");
                        break;
                    case 3:
                        System.out.println("Enter how much do you want to deposit:");
                        amount = sc.nextInt();
                        System.out.println("Your balance now " + user.getAccount().addMoney(amount)+"$");
                        break;
                    case 4:
                        System.out.println("Enter the new PIN:");
                        String newPin = sc.next();
                        card3.setPin(newPin);
                        System.out.println("Your PIN is now " + card3.getPin());
                        break;
                    case 5:
                        System.out.println("Thank you for visiting us!\nOur commission is 1$ for your operations!");
                        card3 = null;
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + option);
                }
            }
        }
    }

}

