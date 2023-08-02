/*
 WAP to Relative url using base url
*/
package com.mycompany.myurl;

import java.net.*;
public class CreateRelativeUrl {
    public static void main(String[] args) throws MalformedURLException 
    {
        //define a base url
        URL baseURL  =  new URL("https://www.example.com/api/");
        //define a relative url
        String relativeURI = "data? param1=value1&param2=value2#section1";
        //Resolve the relative URI with respect to base URL
        URL resolvedURL = new URL(baseURL, relativeURI);
        //get the absolute URI
        String absoluteURI  = resolvedURL.toString();
        
        System.out.println("Resolved URL: " + absoluteURI);
    }
}
