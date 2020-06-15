package com.learnSelenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
    Properties pro;
    FileInputStream fis1;

    public ConfigDataProvider() {
        //File input = new File("src/Config/config.properties");
        try {
            fis1 = new FileInputStream("./src/Config/config.properties");
            pro = new Properties();
            pro.load(fis1);
            System.out.println("pro loaded with fis1");
        } catch (Exception e) {
            System.out.println("Not able to load config file " + e.getMessage());
        }

        /*finally {
            if (fis1 != null) {
                try {
                    fis1.close();
                }
                catch (Exception e) {
                    System.out.println("Config file is closed");;
                }
            }
        }
*/

    }


    public String getBrowserFromConfig() {
        return  pro.getProperty("browserName");
    }

    public String getURLFromConfig() {
        return  pro.getProperty("url");
    }
}

