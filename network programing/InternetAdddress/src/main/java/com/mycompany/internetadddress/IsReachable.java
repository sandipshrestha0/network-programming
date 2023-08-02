
package com.mycompany.internetadddress;

import java.net.*;
import java.io.IOException;
public class IsReachable {
     public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("www.google.com"); //224, 239
            boolean reachable = address.isReachable(50);
            if(reachable){
                System.out.println("The host is  Reachable ");
            }
            else
            {
                System.out.println("The host is nor reachable ");
            }
        } 
        catch(IOException e)
        {
            System.out.println("Error occured" + e.getMessage());
        }
    }
}
