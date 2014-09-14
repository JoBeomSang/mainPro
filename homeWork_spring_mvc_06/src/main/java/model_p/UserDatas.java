package model_p;

import java.util.HashMap;

import org.springframework.stereotype.Component;

 

@Component
public class UserDatas extends HashMap<String, Users> {

    public UserDatas() {

        put("1", new Users("조범상","sang0542","464656")); 

    }

}