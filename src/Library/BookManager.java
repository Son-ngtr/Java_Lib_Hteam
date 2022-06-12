package Library;

import java.util.ArrayList;
import java.util.Calendar;

public class BookManager {
    private boolean isUpdate = false;
    private int codeCount = 0;

    //Getter and Setter
    public boolean getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(boolean update) {
        isUpdate = update;
    }

    //Array List, Book List
    private ArrayList<Book> books = new ArrayList<>();

    //Book Category
    public String[] bookCategory(){
        String bookCategory[] = {"Sách Giáo Trình", "Tiểu Thuyết", "Thiếu Nhi", "Tâm Lý Học"};
        return bookCategory;
    }

    //Tạo ra một cuốn sách
    public Book createBook(String name, Calendar dateAdded, Long price, String author, String publisher, String category, int quantity){
        codeCount++;
        Book book = new Book(codeCount, name, dateAdded, price, author, publisher, category, quantity);
        return book;
    }

    //Tổng số lượng sách (khác loại) của thư viên
    public int totalBookDifferent(){
        return codeCount;
    }

    //Tổng số lượng sách (cùng loại) của thư viên
    public int totalBookSame(){
        int total = 0;
        for (Book book : books){
            total += book.getQuantity();
        }
        return total;
    }

    //Danh Sách
    public String[][] listBook(){
        String[][] mainObj = new String[totalBookDifferent()][8];
        int count = 0;
        for (Book book : books){
            for (int i=0; i<8; i++){
                switch (i){
                    case 0:
                        mainObj[count][i] = String.valueOf(book.getCode());
                        break;
                    case 1:
                        mainObj[count][i] = book.getName();
                        break;
                    case 2:
                        mainObj[count][i] = book.dateConvert();
                        break;
                    case 3:
                        mainObj[count][i] = book.moneyConvert();
                        break;
                    case 4:
                        mainObj[count][i] = book.getAuthor();
                        break;
                    case 5:
                        mainObj[count][i] = book.getPublisher();
                        break;
                    case 6:
                        mainObj[count][i] = book.getCategory();
                        break;
                    case 7:
                        mainObj[count][i] = String.valueOf(book.getQuantity());
                        break;
                    default:
                        break;
                }
            }
            count++;
        }
        return mainObj;
    }

    //Tiêu Đề Danh Sách
    public String[] bookContent(){
        String[] obj = {
              "Code", "Name", "Date Added", "Price", "Author", "Publisher", "Category", "Quantity"
        };
        return obj;
    }

    //Thêm Sách
    public void addBook(Book book){
        books.add(book);
    }

    //Xóa Sách
    public void removeBook(String code){
        boolean codeReduce = false;
        for (int i=0; i<books.size(); i++){
            if(Integer.toString(books.get(i).getCode()).equalsIgnoreCase(code.trim()) && !codeReduce){
                books.remove(books.get(i));
                codeReduce = true;
                codeCount--;
            }
            if (codeReduce && i!=books.size()){
                books.get(i).setCode(books.get(i).getCode() - 1);
            }
        }
    }

    //Tìm kiếm sách
    public void searchBook(Book book){

    }

    //Kiểm tra có phải số nguyên
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    public boolean isLong(String s){
        try {
            Long.parseLong(s);
        }catch (NumberFormatException e){
            return false;
        }catch (NullPointerException e){
            return false;
        }
        return true;
    }

    //Kiểm tra có phải Date không
    public boolean isDateOrNot(String date){
        String[] dates = date.split("/");
        if(dates.length < 3){
            return false;
        }
        for (String d : dates){
            if (!isInteger(d)){
                return false;
            }
        }
        if(Integer.parseInt(dates[1]) <=0 || Integer.parseInt(dates[1]) > 12){
            return false;
        }
        if (soNgay(Integer.parseInt(dates[1]),Integer.parseInt(dates[2]))<Integer.parseInt(dates[0])
                || Integer.parseInt(dates[0]) <= 0){
            return false;
        }
        return true;
    }
    public int soNgay(int th, int na){
        switch (th) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: {
                if (na % 4 == 0) {
                    return 29;
                }
                return 28;
            }
            default: return -1;
        }
    }

    //Kiểm tra có phải money không
    public boolean moneyCheck(String money){
        String s = "";
        if(money.length() == 0){
            return false;
        }
        for (int i=0; i<money.length() ; i++){
            char a = money.charAt(i);
            if(Character.compare(a, '.') != 0 && Character.compare(a, 'v') != 0 && Character.compare(a, 'n') != 0 && Character.compare(a, 'd') != 0 && Character.compare(a, '.') != 0 && Character.compare(a, 'V') != 0 && Character.compare(a, 'N') != 0 && Character.compare(a, 'D') != 0){
                s += a;
            }
        }
        try {
            Long.parseLong(s);
        }catch (NumberFormatException e){
            return false;
        }catch (NullPointerException e){
            return false;
        }
        return true;
    }
    public String moneyConvert(String money){
        String s ="";
        for (int i=0; i<money.length() ; i++){
            char a = money.charAt(i);
            if(Character.compare(a, '.') != 0 && Character.compare(a, 'v') != 0 && Character.compare(a, 'n') != 0 && Character.compare(a, 'd') != 0 && Character.compare(a, '.') != 0 && Character.compare(a, 'V') != 0 && Character.compare(a, 'N') != 0 && Character.compare(a, 'D') != 0){
                s += a;
            }
        }
        return s;
    }


    //Kiểm tra có phải phép tính không
    public String[] mathAnalysis(String math){
        String result[] = new String[2];
        result[0] = "";
        result[1] = "+";
        for (int i=0; i<math.length() ; i++){
            char a = math.charAt(i);
            switch (a){
                case '+':
                case '-':
                case 'x':
                case '*':
                case '/':
                    result[1] += a;
                    result[0] += " ";
                    break;
                default:
                    if(Character.compare(a, '0') >= 0 && Character.compare(a, '9') <= 0){
                        result[0] += a;
                    }
                    break;
            }
        }
        return result;
    }
    public boolean mathCheck(String[] analysisResult){
        String s1[] = analysisResult[0].trim().split(" ");
        String s2[] = analysisResult[1].split("");

        if (s1.length != s2.length || analysisResult[0].trim() == ""){
            return false;
        }

        return true;
    }
    public String matConvert(String[] analysisResult){
        long result = 0;

        String s1[] = analysisResult[0].split(" ");
        String s2[] = analysisResult[1].split("");

        for (int i=0 ; i<s2.length;i++){
            switch (s2[i]){
                case "+":
                    result = result + Long.parseLong(s1[i]);
                    break;
                case "-":
                    result = result - Long.parseLong(s1[i]);
                    break;
                case "x":
                    result = result * Long.parseLong(s1[i]);
                    break;
                case "*":
                    result = result * Long.parseLong(s1[i]);
                    break;
                case "/":
                    result = result / Long.parseLong(s1[i]);
                    break;

            }
        }
        if(result < 0){
            result = 0;
        }
        return Long.toString(result);
    }


    //Sửa Thông Tin Sách
    public void editBook(String code, int col, String value){
        for (Book book: books){
            if(Integer.toString(book.getCode()).equalsIgnoreCase(code.trim())){
                switch (col){
                    case 1:
                        book.setName(value);
                        break;
                    case 2:
                        book.dateReConvert(value);
                        break;
                    case 3:
                        book.setPrice(Long.parseLong(value));
                        break;
                    case 4:
                        book.setAuthor(value);
                        break;
                    case 5:
                        book.setPublisher(value);
                        break;
                    case 6:
                        book.setCategory(value);
                        break;
                    case 7:
                        book.setQuantity(Integer.parseInt(value));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
