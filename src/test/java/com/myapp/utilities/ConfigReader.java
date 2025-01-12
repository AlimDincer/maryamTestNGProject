package com.myapp.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  private static Properties properties;
  static{
   String path="configuration.properties";
    try {
          FileInputStream fileInputStream=new FileInputStream(path);
          properties =new Properties();
          properties.load(fileInputStream);
          fileInputStream.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
     String value =properties.getProperty(key);
      return properties.getProperty(key);
    }

    public static void main(String[] args) {
    System.out.println(ConfigReader.getProperty("amazon_prod_url"));
    System.out.println(ConfigReader.getProperty("browser"));
    System.out.println(ConfigReader.getProperty("b"));
    }

 }
