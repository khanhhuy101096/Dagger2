package com.example.khanhhuy.myapplication.Component;

import com.example.khanhhuy.myapplication.MainActivity;
import com.example.khanhhuy.myapplication.module.ImageDowloaderModule;

import dagger.Component;

/**
 * Created by yeu_thuong on 10/24/2017.
 */
@Component (modules = ImageDowloaderModule.class)
public interface ImageDownloaderComponent {
    void inject(MainActivity mainActivity);
}
