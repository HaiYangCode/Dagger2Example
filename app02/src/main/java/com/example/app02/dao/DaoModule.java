package com.example.app02.dao;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class DaoModule {
    @Name01
    @Provides
    Student providerStudent01() {
        return new Student("tom01");
    }

    @Name02
    @Provides
    Student providerStudent02() {
        return new Student("tom02", 20);
    }

    @Named("threeParam")
    @Provides
    Student providerStudent03() {
        return new Student("tom03", 20, 1);
    }

}
