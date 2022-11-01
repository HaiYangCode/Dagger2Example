package com.example.app03.app;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {
    @Provides
    User providerUser() {
        return new User();
    }
}
