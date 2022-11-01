package com.example.app02.net;

import com.example.app02.MainActivity;
import com.example.app02.dao.DaoModule;

import dagger.Component;

@NetScope
@Component(modules = {HttpModule.class, DaoModule.class})
public interface HttpComponent {
    void inject(MainActivity activity);
}
