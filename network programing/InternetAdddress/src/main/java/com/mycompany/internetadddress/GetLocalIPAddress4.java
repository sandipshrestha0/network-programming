/*
 * To find the ip address of the local machine
 */
package com.mycompany.internetadddress;
import java.net.*;
public class GetLocalIPAddress4 {
    public static void main(String[] args)
    {
        try
        {
            //Get the local ip address
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Ip address:" + localAddress.getHostAddress());
        }
        catch (UnknownHostException e)
                {
                    System.out.println("Error getting Lodcal IP address:" + e.getMessage());
                }
    }
}
