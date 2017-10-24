package com.example.khanhhuy.myapplication.model;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by yeu_thuong on 10/24/2017.
 */

public class ImageDowloader {
    private Context mContext;

    public ImageDowloader(Context context) {
        Log.e("khanhhuy"," ImageDowloader(): "+context);
        mContext = context;
    }

    public void toImageView(ImageView imageView, String url){
        Glide.with(mContext).load(url).into(imageView);
        Log.e("khanhhuy"," toImageView(): "+mContext);
    }
}
