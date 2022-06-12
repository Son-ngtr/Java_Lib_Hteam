package Library;

import java.util.Calendar;

public class Book_Learning extends Book{
    private String education[] = {"Mẫu Giáo", "Tiểu Học", "Trung Học Cơ Sở", "Trung Học Phổ Thông", "Đại Học"};
    private String education_subjects[] = {"Toán", "Lý", "Hóa", "Lịch Sử", "Văn Học", "Tiếng Anh", "Tiếng Nhật", "Tiếng Trung", "Sinh Học"};

    //Constructor
    public Book_Learning(int code, String name, Calendar dateAdded, Long price, String author, String publisher, int quantity, String[] education, String[] education_subjects) {
        super(code, name, dateAdded, price, author, publisher, "Sách Giáo Trình", quantity);
        this.education = education;
        this.education_subjects = education_subjects;
    }

    //Getter And Setter
    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String[] getEducation_subjects() {
        return education_subjects;
    }

    public void setEducation_subjects(String[] education_subjects) {
        this.education_subjects = education_subjects;
    }
}
