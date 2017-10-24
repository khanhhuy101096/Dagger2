package com.example.khanhhuy.myapplication.module;

import android.content.Context;
import android.util.Log;

import com.example.khanhhuy.myapplication.model.ImageDowloader;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yeu_thuong on 10/24/2017.
 */
@Module
public class ImageDowloaderModule {
    private Context mContext;

    public ImageDowloaderModule(Context context) {
        Log.e("khanhhuy"," ImageDowloaderModule(): "+context);
        mContext = context;
    }

    @Provides
    Context provideContext(){
        Log.e("khanhhuy"," provideContext(): "+mContext);
        return mContext;
    }

    @Provides
    ImageDowloader provideImageDowloader(Context context){
        Log.e("khanhhuy","provideImageDowloader(): "+context);
        return new ImageDowloader(context);
    }
}
