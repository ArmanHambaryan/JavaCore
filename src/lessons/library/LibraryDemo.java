package lessons.library;

import java.util.Scanner;

public class LibraryDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    adBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case DELETE_BY_ID:
                    System.out.println("Please input book ID to delete");
                    int idToDelete = Integer.parseInt(scanner.nextLine());
                    bookStorage.deleteBookById(idToDelete);
                    break;
                case SEARCH_BOOK_FOR_PRICE_RANGE:
                    System.out.println("Please input min price");
                    double minPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input max price");
                    double maxPrice = Double.parseDouble(scanner.nextLine());
                    bookStorage.searchByPriceRange(minPrice, maxPrice);
                default:
                    System.err.println("Wrong command! try again");


            }


        }
    }

    private static void adBook() {
        System.out.println("Please input book`s title");
        String booktitle = scanner.nextLine();
        System.out.println("Please input book`s authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book`s price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input book ID");
        String id = scanner.nextLine();
        System.out.println("please input book Quantity");
        String quantity = scanner.nextLine();
        Book book = new Book();
        book.setTitle(booktitle);
        book.setPrice(price);
        book.setAuthorName(authorName);
        book.setId(Integer.parseInt(id));
        book.setQuantity(Integer.parseInt(quantity));
        bookStorage.add(book);
        System.out.println("Book added successfully");
    }


}
