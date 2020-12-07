package com.guice.intro.consumer;

import com.guice.intro.service.ConfigReaderService;

import javax.inject.Inject;

public class ConfigReader {

    private ConfigReaderService configReader;

    @Inject
    public  ConfigReader (ConfigReaderService configReader) {
        this.configReader = configReader;
    }


    public void processMessages() {
        System.out.println(this.configReader.getConfig());
    }
}
