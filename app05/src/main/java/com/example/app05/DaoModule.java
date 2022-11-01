package com.example.app05;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DaoModule {
    /**
     * 这里的参数类型决定了调用哪一个实现方法
     *
     * @param impl01
     * @return
     */
    @Binds
    public abstract BInterface bindBInterface01(Impl01 impl01);


    @Provides
    static Impl01 providerBInterface01() {
        return new Impl01();
    }

    @Provides
    static Impl02 providerBInterface02() {
        return new Impl02();
    }

}
