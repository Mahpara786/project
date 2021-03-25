/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavalu.com.utilities;

import exavalu.com.utilities.DbParamProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class PropertiesReader {

    public static DbParamProvider readProperties(String propFile)  {
        DbParamProvider dbParamProvider = new DbParamProvider();
        //Now read the property file and extarct the properties to set into DbParamProvider class
         try {
            Properties p = new Properties();
            FileReader reader;
            reader = new FileReader(propFile);
            p.load(reader);
            dbParamProvider.setDriver(p.getProperty("driver"));
            dbParamProvider.setDbUrl(p.getProperty("db_url"));
            dbParamProvider.setDbName(p.getProperty("db_name"));
            dbParamProvider.setUserName(p.getProperty("user_name"));
            dbParamProvider.setPassword(p.getProperty("password"));
            System.out.println("Driver name="+p.getProperty("driver"));
            System.out.println("Driver name="+p.getProperty("db_url"));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }

        return dbParamProvider;
    }

}
