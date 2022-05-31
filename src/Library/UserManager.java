package Library;

import java.util.ArrayList;

public class UserManager {
    ArrayList<User> users = new ArrayList<>();

    //Constructor
    public UserManager(){

    }

    //Add User
    public void addUser(User user){
        users.add(user);
    }

    //Remove User by ID
    public void removeUser(String id){
        for (User user : users){
            if(user.getUserID().equalsIgnoreCase(id)){
               users.remove(user);
            }
        }
    }

//    //Search User
//    public User searchUser(String id){
//        for (User user : users){
//            if(user.getUserID().equalsIgnoreCase(id)){
//                return user;
//            }
//        }
//        return users;
//    }
}
