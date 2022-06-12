package Library;

import java.util.Calendar;

public class Book_Child extends Book{
    private String[] type = {"Cổ Điển", "Hiện Đại"};
    private String[] recommentForAge = {"6->10", "11->16", "16+"};

    //Constructor
    public Book_Child(int code, String name, Calendar dateAdded, Long price, String author, String publisher, int quantity, String[] type, String[] recommentForAge) {
        super(code, name, dateAdded, price, author, publisher, "Thiếu Nhi", quantity);
        this.type = type;
        this.recommentForAge = recommentForAge;
    }

    //Getter and Setter
    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public String[] getRecommentForAge() {
        return recommentForAge;
    }

    public void setRecommentForAge(String[] recommentForAge) {
        this.recommentForAge = recommentForAge;
    }
}
