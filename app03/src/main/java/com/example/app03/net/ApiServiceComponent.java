package com.example.app03.net;

import com.example.app03.MainActivity;
import com.example.app03.app.ApplicationComponent;

import dagger.Component;

@NetScope
@Component(modules = ApiServiceModule.class, dependencies = BaseHttpComponent.class)
public interface ApiServiceComponent {
    void inject(MainActivity activity);
}
