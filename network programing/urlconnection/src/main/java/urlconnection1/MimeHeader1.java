/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection1;

import java.io.*;
import java.net.*;
public class MimeHeader1 {
     public static void main(String[] args) throws Exception{
         URL url = new URL("https://youtube.com/");
         HttpURLConnection connection =(HttpURLConnection)url.openConnection();
         connection.setRequestMethod("GET");
         
         int responseCode = connection.getResponseCode();
         String contentType = connection.getHeaderField("Content-Type");
         String contentEncoding = connection.getHeaderField("Content-Encoding");
         String contentDisposition = connection.getHeaderField("Content-Disposition");
         
         System.out.println("Response code: " + responseCode);
         System.out.println("Content-Type: " + contentType);
         System.out.println("Content-Encoding: " + contentEncoding);
         System.out.println("Content-Disposition: " + contentDisposition);
         connection.disconnect();
         
     }
}
