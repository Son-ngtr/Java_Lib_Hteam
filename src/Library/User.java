package Library;

public class User {
    private String userID;
    private String userName;
    private String userGender;
    private int userAge;
    private int userAddress;
    private String userPhoneNumber;
    private long userDept;

    //Constructor
    public User(String userID ,String userName,String userGender, int userAge, int userAddress, String userPhoneNumber) {
        this.userName = userName;
        this.userID = userID;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
    }

    //Getter and Setter
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public long getUserDept() {
        return userDept;
    }

    public void setUserDept(long userDept) {
        this.userDept = userDept;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(int userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    //UserDept
    public boolean userDeptManager(){
        if(userDept > 0){
            return true; // Vẫn Còn nợ
        }else {
            return false; // Hết Nợ
        }
    }

    //User Age Identify
    public boolean userAgeIdentify(){
        if (userAge >= 18){
            return true; //Được quyền mượn sách
        }else {
            return false; //Không được mượn sách
        }
    }
}
