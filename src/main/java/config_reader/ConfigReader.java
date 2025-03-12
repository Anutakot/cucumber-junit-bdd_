package config_reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/main/java/config_reader/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Properties properties = new Properties();
//        properties.put("username", "Anna");
//        properties.put("password", "123");


        properties.put("url", "https://cydeo.com");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(properties.get("username"));

        System.out.println("properties.get(\"username\") = " + properties.get("username"));
        System.out.println("properties.getProperty(\"url\") = " + properties.getProperty("url"));

    }
}
