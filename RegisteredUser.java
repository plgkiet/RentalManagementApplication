import java.util.HashMap;
import java.util.Map;

public class RegisteredUser {
    private Map<String, User> userMap = new HashMap<String, User>();

    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }
    public boolean removeUser(User user) {
        if (userMap.get(user.getUserId()) == null) {
            return false;
        } else {
            userMap.remove(user.getUserId(), user);
            return true;
        }
    }
}
