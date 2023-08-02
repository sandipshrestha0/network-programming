/*
 WAP to show first url connection class
*/
package urlconnection1;

import java.net.*;
import java.io.*;
import java.util.Date;
public class url1_1 {
    public static void main (String[] args) throws Exception {
        try{
            URL url=new URL("http://sandipstha.com.np");
            URLConnection connection = url.openConnection();
            System.out.println("Content-Type: " + connection.getContentType());
        }
        catch(MalformedURLException e){
            System.err.println(e);
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}
//1. steps for open connections of url
//2. import java package
//3. create url class
//4. implement openconnection method
//5 show the connection object
//6. Read and write
//7. close the connection