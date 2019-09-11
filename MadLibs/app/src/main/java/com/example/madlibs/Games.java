package com.example.madlibs;

public class Games
{
    public static String madLibs(String [] pSpeech, String name)
    {
        String madLibs =
                "Dear " + name + ", \n" +
                        "I would like to invite you to a/an " + pSpeech[0] + " sleepover party this Friday\n" +
                        "night at my " + pSpeech[1] + ". I live on the corner of South " + pSpeech[2] + " Street\n" +
                        "and " + pSpeech[3] + " Lane. Please arrive " + pSpeech[4] + " at " + pSpeech[5] + " 0' clock.\n" +
                        "Don't forget to bring a/an " + pSpeech[6] + " sleeping " + pSpeech[7] + " and a\n" +
                        "soft " + pSpeech[8] + " to rest your " + pSpeech[9] + " on. We'll have pizza\n" +
                        "topped with " + pSpeech[10] + " for dinner.";
        return madLibs;
    }
}
