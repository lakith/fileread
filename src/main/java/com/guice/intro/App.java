package com.guice.intro;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.guice.intro.consumer.ConfigReader;
import com.guice.intro.injector.AppModule;

import java.util.Timer;
import java.util.TimerTask;

public class App
{
    public static void main( String[] args )
    {

        new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                Injector injector = Guice.createInjector(new AppModule());
                ConfigReader configReader = injector.getInstance(ConfigReader.class);
                configReader.processMessages();
            }
        },0,5000);

    }
}
