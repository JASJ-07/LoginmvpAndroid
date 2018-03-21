package com.example.antonio.login.domain;

/**
 * Created by antonio on 17/03/18.
 */

public class InteractorOperations implements IIteractorOperations{

    @Override
    public boolean login(String user, String pass){
        if(user.equals("antonio") && pass.equals("antonio123456")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String validauser(String user, String pass) {
        if (login(user, pass)){
            return "Login Access";
        }else{
            return "Login Denegado";

        }
    }
}