package Library;

import java.util.Calendar;

public class Book {
    private int Code;
    private String Name;
    private Calendar DateAdded;
    private Long Price;
    private String Author;
    private String Publisher;
    private String category;
    private int Quantity;

    //Constructor
    public Book(int code, String name, Calendar dateAdded, Long price, String author, String publisher, String category, int quantity) {
        Code = code;
        Name = name;
        DateAdded = dateAdded;
        Price = price;
        Author = author;
        Publisher = publisher;
        this.category = category;
        Quantity = quantity;
    }

    //Getter and Setter


    public int getCode() {
        return Code;
    }

    public void setCode(int  code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Calendar getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(Calendar dateAdded) {
        DateAdded = dateAdded;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        Price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    //Set Date
    public void setDate(int date, int month, int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year+0, month-1, date+0);
        setDateAdded(calendar);
    }

    //Date convert
    public String dateConvert(){
        String date = getDateAdded().get(Calendar.DATE) + "/" + (getDateAdded().get(Calendar.MONTH) + 1) + "/" + getDateAdded().get(Calendar.YEAR);
        return date;
    }

    //DateReConvert
    public void dateReConvert(String dateReConvert){
        Calendar newCalendar = Calendar.getInstance();
        String[] times = dateReConvert.split("/");
        int date = Integer.parseInt(times[0]);
        int month = Integer.parseInt(times[1]);
        int year = Integer.parseInt(times[2]);
        newCalendar.set(year+0, month - 1 , date+0);
        setDateAdded(newCalendar);
    }

    //Money convert
    public String moneyConvert(){
        String soDu_String = Long.toString(getPrice());
        String soDu_String_result = "" ;
        for(int i=soDu_String.length()-1 ; i>=0; i-=3){
            if(i >= 3){
                soDu_String_result = "." + soDu_String.substring(i-2, i+1) + soDu_String_result;
            }else {
                soDu_String_result = soDu_String.substring(0, i+1) + soDu_String_result;
            }
        }
        return soDu_String_result + "VND";
    }
}
