package me.crosant.minecraftversionchanger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class MinecraftVersionChanger 
{
    public static void main( String[] args ) throws IOException
    {
        //List list = new ArrayList();
        
        Properties prop = new Properties();
        //save properties to project root folder

        prop.store(new FileOutputStream("config.properties"), null);
        
        //get the properties value
        String URL = prop.getProperty("repository", "http://crosant.skyirc.net/minecraft/repo/versions.txt");
        
        
        if ( Tools.readURL(URL))
        {
           List list = Tools.getList(URL);
           System.out.println(list);
        }
        
        else
        {
           System.err.println("Repo: " + URL + " not found");
        }
    }
}
