
package com.mycompany.myurl;

import java.net.*;
public class UrlInfo {
    public static void main(String[] args) throws MalformedURLException {
        //create a url object from a string
        URL url = new URL("https://github.com/sandipshrestha0");
        // access various components of the url
        System.out.println("Protocol:" + url.getProtocol());
        System.out.println("Host:" + url.getHost());
        System.out.println("Path: " + url.getPath());
        
    }
}
