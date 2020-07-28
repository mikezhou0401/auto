package org.webdriver.webui.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    public static Properties getProperties() {
        String path = new Properties().getClass().getClassLoader().getResource("./config.properties").getPath();
        File file = new File(path);
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return p;
    }
}
