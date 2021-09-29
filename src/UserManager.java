public class UserManager {


    private String userName;
    private int userAge;
    private boolean isOnline;


    public UserManager() {

    }

    public UserManager(String userName, int userAge, boolean isOnline) {

        this.userName = userName;
        this.userAge = userAge;
        this.isOnline = isOnline;


    }


    public String getUserName() {
        return userName;
    }

    public int getUserAge() {

        return userAge;

    }

    public boolean getisOnline() {

        return isOnline;
    }

    @Override
    public String toString() {
        return "UserManager{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", isOnline=" + isOnline +
                '}';
    }
}
