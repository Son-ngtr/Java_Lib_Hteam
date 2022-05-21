package Library;

public class Book {
    private String bookName;
    private String bookPrice;
    private boolean bookStatus;
    private String bookAuthor;

    //Constructor
    public Book(String bookName, String bookPrice, boolean bookStatus, String bookAuthor) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
        this.bookAuthor = bookAuthor;
    }

    //Getter and Setter
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
