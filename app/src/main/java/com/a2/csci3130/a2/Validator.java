package com.a2.csci3130.a2;

import java.util.regex.*;

public class Validator {
    private String password;
    private int mark=0;

    public void setPwd(String password) {
        this.password=password;
    }

    public boolean getValidation() {
        mark=checkPwdEqual()+checkPwdLength()+checkPwdNum()+checkPwdUpper()+checkPwdLower();
        if(mark>=5) {
            return true;
        }
        else
            return false;
    }

    //Rule1: not equal to "password"
    public int checkPwdEqual() {
        if(password.toLowerCase().equals("password")) {
            return 0;
        }
        else
            return 1;
    }
    //Rule2: at least 8 character
    public int checkPwdLength() {
        if(password.length()>=8) {
            return 1;
        }
        else
            return 0;
    }
    //Rule3: contains number
    public int checkPwdNum() {
        String regex="[0-9]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        if(matcher.find()) {
            return 1;
        }
        else
            return 0;
    }
    //Rule4: contains upper case letter
    public int checkPwdUpper() {
        String regex="[A-Z]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        if(matcher.find()) {
            return 1;
        }
        else
            return 0;
    }
    //Rule5: contains lower case letter
    public int checkPwdLower() {
        String regex="[a-z]";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(password);
        if(matcher.find()) {
            return 1;
        }
        else
            return 0;
    }

}
