package com.example.dagger2demojava.di;

import com.example.dagger2demojava.MainActivity;

import dagger.Component;

@MyScope
@Component(modules = UserModule.class, dependencies = ApplicationComponent.class)
public interface UserComponent {
    void inject(MainActivity mainActivity);

}
