public class User {
    private String userID;
    private String password;
    private String email;
    private User.USERTYPE userType;
    public static enum USERTYPE {
        TENANT, OWNER, MANGAER
    }
    
    public User(String userID, String password, String email, User.USERTYPE userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    public User createUser(String userID, String password, String email, User.USERTYPE userType) {
        return new User( userID,  password,  email,  userType);
    }

    public void resetPassword(String password) {
        this.password = password;
    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User.USERTYPE getUserType() {
        return userType;
    }

    public void setUserType(User.USERTYPE userType) {
        this.userType = userType;
    }

    
    
}
