package com.guice.intro.service;

import java.io.*;

public class ConfigReaderServiceImpl implements ConfigReaderService {

    public String configvalue = null;

    @Override
    public String getConfig() {
        File file = new File("src/main/resources/resources.txt");
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ){
            String line = bufferedReader.readLine();

            while(line != null) {
                System.out.println(line);
                configvalue = line;
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return configvalue;
    }
}
