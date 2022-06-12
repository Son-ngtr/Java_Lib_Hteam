package Library;

import java.util.Calendar;

public class Book_Psychological extends Book{
    private String[] type = {"Nhận Thức", "Hành Vi", "Tội Phạm"};
    private String[] recommentForAge = {"6->10", "11->16", "16->18", "18+"};

    //Constructor
    public Book_Psychological(int code, String name, Calendar dateAdded, Long price, String author, String publisher, int quantity, String[] type, String[] recommentForAge) {
        super(code, name, dateAdded, price, author, publisher, "Tâm Lý Học", quantity);
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
