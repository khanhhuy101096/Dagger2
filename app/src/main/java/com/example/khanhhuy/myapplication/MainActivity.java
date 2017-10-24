package com.example.khanhhuy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.khanhhuy.myapplication.Component.DaggerImageDownloaderComponent;
import com.example.khanhhuy.myapplication.Component.ImageDownloaderComponent;
import com.example.khanhhuy.myapplication.model.ImageDowloader;
import com.example.khanhhuy.myapplication.module.ImageDowloaderModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ImageDownloaderComponent mImageDownloaderComponent;
    @Inject
    ImageDowloader mImageDowloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageDownloaderComponent = DaggerImageDownloaderComponent.builder()
                                    .imageDowloaderModule(new ImageDowloaderModule(this))
                                    .build();

        mImageDownloaderComponent.inject(this);

        ImageView mImageView = (ImageView) findViewById(R.id.image_view);
        mImageDowloader.toImageView(mImageView, "http://i.imgur.com/EjH6r8C.png");
    }
}
