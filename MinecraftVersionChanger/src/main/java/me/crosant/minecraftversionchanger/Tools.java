/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.crosant.minecraftversionchanger;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Florian Reichmuth
 */
public class Tools {
public static boolean readURL( String URL )
  {
    InputStream is = null;
//    List list = new ArrayList();
    try
    {
      URL url = new URL( URL );
      is = url.openStream();
      
      //System.out.println( new Scanner( is ).useDelimiter( "\\Z" ).next() );
      return true;
    }
    catch ( Exception e ) {
      e.printStackTrace();
      return false;
    }
    finally {
      if ( is != null ){
        try { is.close(); } catch ( IOException e ) { e.printStackTrace(); }
      }
    }
  }
public static List getList( String URL )
  {
    InputStream is = null;
    List list = new ArrayList();
    try
    {
      URL url = new URL( URL );
      is = url.openStream();
          list.add( new Scanner( is ).useDelimiter( "\\Z" ).next() );
      
      //System.out.println( new Scanner( is ).useDelimiter( "\\Z" ).next() );
      return list;
    }
    catch ( Exception e ) {
      e.printStackTrace();
      return list;
    }
    finally {
      if ( is != null ){
        try { is.close(); } catch ( IOException e ) { e.printStackTrace(); }
      }
    }
  }
}
