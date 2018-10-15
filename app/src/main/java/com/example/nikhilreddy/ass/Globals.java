package com.example.nikhilreddy.ass;

/**
 * This is used to show the Intro screen only once
 */

import android.content.Context;
import android.content.SharedPreferences;

public class Globals {

    private static SharedPreferences pref;

    // Shared preferences file name
    private static final String PREF_NAME = "tutorialwing-shared-preference";

    private static final String IS_FIRST_TIME_LAUNCH = "FIRST_TIME_LAUNCH";

    /**
     * for initialization
     * @param context
     */
    public static void init(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    /**
     * @return
     */
    public static boolean shouldShowSlider() {
        return (pref == null) || pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    /**
     * @param isFirstTime
     */
    public static void saveFirstTimeLaunch(boolean isFirstTime) {
        if (pref == null)
            return;

        SharedPreferences.Editor editor = pref.edit();
        if (editor != null) {
            editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
            editor.apply();
        }
    }
}

