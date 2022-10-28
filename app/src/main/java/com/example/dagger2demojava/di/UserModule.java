package com.example.dagger2demojava.di;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    User providerUser(){
        return new User();
    }
}
