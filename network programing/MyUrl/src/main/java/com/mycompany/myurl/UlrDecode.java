
package com.mycompany.myurl;

import java.net.*;
import java.net.MalformedURLException;
public class UlrDecode {
  public static void main(String[] args) throws MalformedURLException {

// Construct a URLobject
String urlString = "https://www.example.com/search?q=javaprogramming";
URL url= new URL(urlString);
//Getthe encoded URLstring
String encodedUrl = url.toString();

System.out.println("OriginalURL:" + urlString);
System.out.println("Encoded URL:" + encodedUrl);

}
}