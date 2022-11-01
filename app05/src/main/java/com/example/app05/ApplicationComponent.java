package com.example.app05;

import dagger.Component;

@Component(modules = DaoModule.class)
public interface ApplicationComponent {
    void inject(MainActivity activity);
}
