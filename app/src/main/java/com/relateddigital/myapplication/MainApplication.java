package com.relateddigital.myapplication;

import android.app.Application;

import com.relateddigital.relateddigital_android.RelatedDigital;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RelatedDigital.init(getApplicationContext(), "676D325830564761676D453D",
                "356467332F6533766975593D", "visistore");

        RelatedDigital.setIsInAppNotificationEnabled(getApplicationContext(), true);
    }
}
