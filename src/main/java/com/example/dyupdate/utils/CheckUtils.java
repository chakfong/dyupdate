package com.example.dyupdate.utils;

import com.example.dyupdate.exception.CheckException;
import org.springframework.context.MessageSource;

public class CheckUtils {

    private static MessageSource source;

    public static void setSource(MessageSource source) {
        CheckUtils.source = source;
    }

    public static void notNull(Object obj, String key, Object... args) {
        if (obj == null) {
            fail(key, args);
        }
    }

    private static void fail(String key, Object... args) {
        throw new CheckException(source.getMessage(key, args, LocaleUtils.getLocale()));
    }
}
