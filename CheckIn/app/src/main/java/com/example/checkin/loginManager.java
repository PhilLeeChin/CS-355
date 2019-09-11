package com.example.checkin;

public class loginManager{
    public static boolean knownUser(String name, String psswd) {
        if(name.equals("Philip")  && psswd.equals("silver"))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
