/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myurl;

import java.io.*;
import java.net.*;
public class authentication1 
{
    public static void main(String[] args)throws Exception 
    {
        String username = "myUsername";
         String password = "myPassword";
         Authenticator.setDefault(new Authenticator(){
             @Override protected PasswordAuthentication getPasswordAuthentication (){
                 return new PasswordAuthentication(username, password.toCharArray());
             }         
         });
         // Create URL and open connection
            URL url = new URL("http://example.com");
            URLConnection connection = url.openConnection();
           try(
                   // Read the response
                   BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream())))
           {
               String line;
               while ((line = reader.readLine()) != null){
                   System.out.println(line);
               }
           }
               
                   
    }
}

