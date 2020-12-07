package com.guice.intro.injector;

import com.google.inject.AbstractModule;
import com.guice.intro.providers.FileReadServiceProvider;
import com.guice.intro.service.ConfigReaderService;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ConfigReaderService.class).toProvider(FileReadServiceProvider.class);
    }
}

