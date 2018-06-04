package driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader
{
    private static Properties properties;

    private static void  initialization (String configuration)
    {
        properties = new Properties();
        try
        {
         properties.load(new FileInputStream(configuration));
        }
        catch (IOException e)
        {
        }
//        catch (IIOException e)
//        {
//        }

    }
    public static String GetConfig(String config)
    {
        if (properties == null)
        {
            initialization("src\\main\\resources\\Configuration.properties");
        }
        return properties.getProperty(config);
    }
    /* private Properties properties;
    private final String propertyFilePath = "configs//Configuration.properties";

    public ConfigFileReader()
    {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPath()
    {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl()
    {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getEmail()
    {
        String email = properties.getProperty("email");
        if(email != null) return email;
        else throw new RuntimeException("email not specified in the Configuration.properties file.");
    }*/
    }
