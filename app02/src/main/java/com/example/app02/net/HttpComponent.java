package com.example.app02.net;

import com.example.app02.MainActivity;

import dagger.Component;

@NetScope
@Component(modules = HttpModule.class)
public interface HttpComponent {
    void inject(MainActivity activity);
}
