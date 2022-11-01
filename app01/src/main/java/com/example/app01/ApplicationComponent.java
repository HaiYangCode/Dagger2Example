package com.example.app01;

import dagger.Component;

@Component
public interface ApplicationComponent {
    //指的将对象注入到那个地方,这里指的注入到MainActivity
    void inject(MainActivity activity);

    void inject(SingleInstance activity);
}
