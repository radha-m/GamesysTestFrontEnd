package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Radha on 11/12/2018.
 */
public class readPropConfig {


    String filename = "src/test/Resources/config.properties";

    Properties prop = new Properties();

    public String getConfig(String type){


        try {

            File file = new File(filename);
            FileInputStream fileInput = new FileInputStream(file);
            prop.load(fileInput);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return prop.getProperty(type);
    }
}
