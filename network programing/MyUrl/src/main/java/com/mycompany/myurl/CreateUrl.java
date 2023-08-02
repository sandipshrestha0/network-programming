/*
 Create UTL using given parameter
*/
package com.mycompany.myurl;

import java.net.*;
public class CreateUrl {
    public static void main(String[] args) throws MalformedURLException 
    {
        //create a URL object from individual components
        // malformedURLException which can occur if the input URL is not valid.
        String protocol = "https";
        String host = "www.example.com";
        int port = 80; //Default port for HTTPS is 443
        String path = "/api/data";
        URL url = new URL(protocol, host, port, path);
        // access components of the url
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("path: " + url.getPath());
        System.out.println("URL: " + url);
    }
}
