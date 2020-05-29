package com.example.dyupdate.utils;

public class RedisUtils {

    private static final String prefix = "DYUPDATE";

    public static String keySplice(Object... keys){
        StringBuilder keyString = new StringBuilder();
        keyString.append(prefix);
        for (Object key : keys) {
            keyString.append(":"+key);
        }
        return keyString.toString();
    }

}
