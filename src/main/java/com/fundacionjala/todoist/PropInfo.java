package com.fundacionjala.todoist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Charito on 6/23/2016.
 */
public class PropInfo {

    private final String email;
    private final String password;

    public PropInfo() {
        getProperties();
        email = getProperties().getProperty("email");
        password = getProperties().getProperty("password");
    }

    public Properties getProperties() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\QADEV07\\Selenium\\roRepo\\qadev07_selenium_todoist\\src\\main\\java\\com\\fundacionjala\\todoist\\todoist.properties");
            properties.load(fileInputStream);
            if (!properties.isEmpty()) {
                return properties;
            } else {
                return null;
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return null;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
