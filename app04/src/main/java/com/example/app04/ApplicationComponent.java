package com.example.app04;


import com.example.app04.net.ApiServiceComponent;
import com.example.app04.net.ApiServiceComponentModule;

import dagger.Component;

@Component(modules = {ApiServiceComponentModule.class})
public interface ApplicationComponent {
    ApiServiceComponent.Factory createApiServiceComponent();
}
