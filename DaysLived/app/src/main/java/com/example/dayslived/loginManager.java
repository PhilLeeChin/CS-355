package com.example.dayslived;

public class loginManager {
    public static boolean knownUser(String name, String psswd)
    {
        //verifies whether the user name and password are valid
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
