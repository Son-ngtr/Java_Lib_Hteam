package Library;

import java.util.Calendar;

public class Book_Novel extends Book{
    private String[] type = {"Khoa Học Viễn Tưởng", "Thể Thao", "Kinh Dị", "Đời Thường", "Fantasy", "Comedy", "Adult"};
    private int ageLimited = 18;

    //Constructor
    public Book_Novel(int code, String name, Calendar dateAdded, Long price, String author, String publisher, int quantity, String[] type, int ageLimited) {
        super(code, name, dateAdded, price, author, publisher, "Tiểu Thuyết", quantity);
        this.type = type;
        this.ageLimited = ageLimited;
    }

    //Getter and Setter
    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public int getAgeLimited() {
        return ageLimited;
    }

    public void setAgeLimited(int ageLimited) {
        this.ageLimited = ageLimited;
    }
}
