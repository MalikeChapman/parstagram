package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("lGKHUBdiBzWAaEUwP7j7zo7Ek1CRyFqASK2ahZkL")
                .clientKey("sG0SdxEKaLLAPJaskZkaGFTAl8ZeJkYc3KygDf21")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
