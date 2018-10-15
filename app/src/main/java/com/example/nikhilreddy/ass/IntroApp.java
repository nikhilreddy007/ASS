package com.example.nikhilreddy.ass;

import android.app.Application;

/**
 * It is used for Intro screen of the app
 */

public class IntroApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Globals.init(this);
    }
}

