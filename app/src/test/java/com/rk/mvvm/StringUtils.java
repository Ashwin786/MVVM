package com.rk.mvvm;

/**
 * Created by user1 on 28/6/19.
 */

class StringUtils {
    public static boolean isNotEmpty(final CharSequence cs) {
        return !StringUtils.isEmpty(cs);
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
