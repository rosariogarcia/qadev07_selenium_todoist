package com.fundacionjala.todoist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Charito on 6/23/2016.
 */
public class PropertiesInfo {

    private static PropertiesInfo instance;

    private Properties properties;

    private PropertiesInfo() {
        loadProperties();
    }

    public static PropertiesInfo getInstance() {
        if (instance == null) {
            instance = new PropertiesInfo();
        }
        return instance;
    }

    public void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("todoist.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public String getProperty(String propertyKey) {
        return properties.getProperty(propertyKey);
    }

    public String getEmail() {
        return getProperty("email");
    }

    public String getPassword() {
        return getProperty("password");
    }

    public String getUrl() {
        return getProperty("url");
    }
}
