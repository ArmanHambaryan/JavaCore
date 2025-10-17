package lessons.library;

import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Plase input 0 for EXIT");
            System.out.println("Plase input 1 for ADD BOOK");
            System.out.println("Plase input 2 for PRINT ALL BOOKS");
            System.out.println("Plase input 3 for SEARCH BOOK BY TITLE");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book`s title");
                    String booktitle = scanner.nextLine();
                    System.out.println("Please input book`s authorName");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input book`s price");
                    double price = Double.parseDouble(scanner.nextLine());
                    Book book = new Book(price, authorName, booktitle);
                    bookStorage.add(book);
                    System.out.println("Book added successfully");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                    


            }


        }
    }
}
