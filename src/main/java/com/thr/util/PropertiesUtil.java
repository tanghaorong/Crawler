package com.thr.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Tang Haorong
 * @description 读取properties文件，根据key获取value值
 */
public class PropertiesUtil {

    public static String getValue(String key){
        Properties properties=new Properties();
        InputStream in=new PropertiesUtil().getClass().getResourceAsStream("/crawler.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}
