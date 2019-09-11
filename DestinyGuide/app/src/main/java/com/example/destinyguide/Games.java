package com.example.destinyguide;

public class Games
{
    public static String fortuneTeller(String name)
    {
        String[] fate = {
                "Rise above negativity that wants to put you down.",
                "Tomorrow your path my be blocked with unexpected obstacles.",
                "You do not have to search for love because it will find you.",
                "Judge not other, but treat them in the way you wish to be treated.",
                "Though your past was painful, happiness will fill your coming days.",
                "A sturdy hand can lead the way.",
                "Strength will find you in your weakest times.",
                "Do not let fear consume you, rise above it.",
                "Life is a gift, tomorrow is not promised, live, love, laugh, share.",
                "Even if you get knocked down, rise like a Phoenix from the ashes.",
        };
        int random = (int) ((Math.random() * 10)) % fate.length;
        return "\nHere is your fortune " + name + ": \n" + fate[random];
    }
}
