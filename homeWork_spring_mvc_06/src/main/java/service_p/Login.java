package service_p;




import javax.servlet.http.HttpSession;

 

import model_p.Users;

import model_p.UserDatas;

 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component
public class Login {

    @Autowired
    UserDatas userData;

    

    public boolean login(Users user,HttpSession session){

        boolean login =false;

        if(userData.containsKey(user.getId()))
        {

            if(userData.get(user.getId()).getPw().equals(user.getPw()))
                login=true;
        }

        if(login)
            session.setAttribute("user", userData.get(user.getId()));

     
        return login;

    }

}
