package lessons.library;


public class Book {
    private String title;
    private String authorName;
    private double price;
    private int id;
    private int quantity;

    public Book(int id, String title, String authorName, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
