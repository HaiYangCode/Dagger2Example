package com.example.app03.app;

import dagger.Component;


@Component(modules = UserModule.class)
public interface ApplicationComponent {
    User createUser();//通过这种方式需要将UserModule中的参数暴露出来，需要提供要暴露出来的相关方法。
//    HttpComponent createHttpComponent();
}
