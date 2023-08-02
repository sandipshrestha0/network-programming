/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myurl;

import java.io.*;
import java.net.*;
public class URLConncetionExample {
    public static void main(String[] args)
    {
        try
        {
            URL url = new URL("http://www.example.com");
            URLConnection conn = url.openConnection();
            //set doInput and doOutput to true
            conn.setDoInput(true);
            conn.setDoOutput(true);
            //check if the connection has been established
            if(!conn.getDoInput()|| !conn.getDoOutput()){
                System.out.println("Error: connection not extablished");
            }
            //set ifModifiedSince to the current time
            conn.setIfModifiedSince(System.currentTimeMillis());
            //Check if the connection uses caching
            if(!conn.getUseCaches())
            {
                System.out.println("Caching is not enabled");
            }
            // print out the URL object associated with the connection
            System.out.println("Url : " + conn.getURL());
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
