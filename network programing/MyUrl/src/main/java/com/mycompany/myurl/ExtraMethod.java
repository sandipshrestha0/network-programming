
package com.mycompany.myurl;
import java.net.*;
public class ExtraMethod {
    public static void main(String[] args) throws MalformedURLException
    {
        //Defination a URL
        URL url1 = new URL("https://ecommons.cornell.edu/handle/1813/71029");
         URL url2 = new URL("https://ecommons.cornell.edu/handle/1813/71029");
         
         //Equality and comaparison
         
// Equality and Comparison

    boolean isEqual = url1.equals(url2);

    int hashCode1 = url1.hashCode();

    int hashCode2 = url2.hashCode();

    System.out.println("URL1: " + url1);

    System.out.println("URL2: " + url2);

    System.out.println("URL1 equals URL2? " + isEqual);

    System.out.println("HashCode for URL1: " + hashCode1);

    System.out.println("HashCode for URL2: " + hashCode2);

    // String Representation

String urlStr = url1.toString();

String externalForm = url1. toExternalForm();

System.out.println("URL1.toString(): " + urlStr);

System.out.println("URL1.toExternalForm():"+externalForm);
    }
}
