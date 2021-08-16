package com.movieDBInshorts.project.movies;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyApp extends Application {

    @Nullable
    private static SimpleIdlingResource mIdlingResource;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @NonNull
    public static SimpleIdlingResource getmIdlingResource() {
        if(mIdlingResource == null){
            mIdlingResource = new SimpleIdlingResource();
        }
        return mIdlingResource;
    }
}
