package homework3.libraryApp;

import java.util.Scanner;

public class PlayWithBooks {

    public static void main(String[] args) {
        Book[] books = new Book[6];

        books[0] = new Novels("Ion", 416, "social");
        books[1] = new Novels("Head First Java", 675, "educational");
        books[2] = new AlbumArt("Prado", 50, "LQ");
        books[3] = new AlbumArt("Schiele", 20, "HQ");
        books[4] = new Novels(null, 0, null);
        books[5] = new AlbumArt(null, 0, null);

        System.out.println("********************Welcome to the Public Library!********************");
        System.out.println("              Please Select From The Following Options:               ");
        System.out.println("**********************************************************************");
        System.out.println("1: Add new book");
        System.out.println("2: Delete one book");
        System.out.println("3: List library");
        System.out.println("4: Exit" + "\n");

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        switch (s) {
            case 1:
                System.out.println("Select one option:\n" + "1-Novel" + "\n" + "2-Album art");
                s = sc.nextInt();
                if (s == 1) {
                    books[4].add();
                    books[4].list();
                    for (int i = 0; i < books.length - 1; i++) {
                        System.out.println(books[i]);
                    }
                }
                if (s == 2) {
                    books[5].add();
                    books[5].list();
                    for (int i = 0; i < books.length; i++) {
                        System.out.println(books[i]);
                    }
                }
                break;
            case 2:
                System.out.println("Select one option:\n" + "1-Novel" + "\n" + "2-Album art");
                s = sc.nextInt();
                if (s == 1) {
                    books[0].delete();
                    for (int i = 0; i < books.length - 2; i++) {
                        System.out.println(books[i]);
                    }
                }
                if (s == 2) {
                    books[2].delete();
                    for (int i = 0; i < books.length - 2; i++) {
                        System.out.println(books[i]);
                    }
                }
                break;

            case 3:
                for (int i = 0; i < books.length - 2; i++) {
                    System.out.println(books[i]);
                }
                break;
            case 4:
                System.out.println("Thank you for visiting!!!");
        }

    }


}
