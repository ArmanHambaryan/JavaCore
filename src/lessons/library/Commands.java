package lessons.library;

public interface Commands {
    String EXIT = "0";
    String ADD_BOOK = "1";
    String PRINT_ALL_BOOKS = "2";
    String SEARCH_BOOK_BY_TITLE = "3";
    String PRINT_EXPENSIVE_BOOK = "4";

    static void printCommands() {
        System.out.println("Plase input " + EXIT + " for EXIT");
        System.out.println("Plase input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Plase input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Plase input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Plase input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");

    }

}

