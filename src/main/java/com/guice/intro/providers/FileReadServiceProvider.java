package com.guice.intro.providers;

import com.google.inject.Provider;
import com.guice.intro.service.ConfigReaderServiceImpl;

public class FileReadServiceProvider implements Provider<ConfigReaderServiceImpl> {

    private static final int reloadTimeInMinutes = 5;
    private static long lastUpdatedTime = 0L;
    private static ConfigReaderServiceImpl configRead = null;
    
    @Override
    public ConfigReaderServiceImpl get() {

        long currentTime = System.currentTimeMillis();
        long reloadReqiuredTime = lastUpdatedTime + (1 * 60 * 1000);

        if(currentTime > reloadReqiuredTime) {
            System.out.println("new new new something new");
            lastUpdatedTime = currentTime;
            configRead = new ConfigReaderServiceImpl();
            return configRead;
        } else {
            System.out.println("old old old");
            return configRead;
        }
    }
}
