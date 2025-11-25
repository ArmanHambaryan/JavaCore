package homework.user;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    Map<String,User> strMap = new HashMap<>();

    public void add(User user){
        strMap.put(user.getEmail(), user);
    }




}
