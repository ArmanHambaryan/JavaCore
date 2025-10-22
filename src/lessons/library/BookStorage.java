package lessons.library;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[size + 10];
        System.arraycopy(books, 0, temp, 0, size);
        books = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword)) ;
            System.out.println(books[i]);
        }
    }

    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteBookById(int id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId() == id) {
                for (int j = 0; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--size] = null;
                System.out.println("Book with ID " + id + " was deleted");
                return;

            }
        }
        System.out.println("Not thid Id");
    }

    public void searchByPriceRange(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("this range no Books");

        }

    }


}
