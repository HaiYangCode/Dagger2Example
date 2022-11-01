package com.example.app04.net;


import com.example.app04.MainActivity;

import dagger.Subcomponent;

@NetScope
@Subcomponent(modules = ApiServiceModule.class)
public interface ApiServiceComponent {
    @Subcomponent.Factory
    interface Factory {
        ApiServiceComponent create();
    }

    void inject(MainActivity activity);
}
