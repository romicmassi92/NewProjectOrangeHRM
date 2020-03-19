package NopCommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils {
    static Properties prop;
    static FileInputStream input;
    static String fileName = "testconfig.properties";
    static String fileLocation = "src/test/resources/TestData/";

    public String getProperty(String Key){

        prop = new Properties();
        try{
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(Key);
    }
}
