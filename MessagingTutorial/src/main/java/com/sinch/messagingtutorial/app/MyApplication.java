package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "app-id", "client-key");

    }
}
