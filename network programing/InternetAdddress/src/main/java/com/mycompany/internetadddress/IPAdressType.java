/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.*;
public class IPAdressType {
    public static void main(String[] args){
        try{
            //get the local ip address
            InetAddress IpAddress = InetAddress.getLocalHost();
            
            //determine whether the ip address is IPV4 or IPV6
            if(IpAddress instanceof Inet4Address){
                System.out.println("Local IP address is IPV4:" + IpAddress.getHostAddress());
            }
            else if(IpAddress instanceof Inet6Address)
                    {
                        System.out.println("Local Ip address is IPV6:" + IpAddress.getHostAddress());
                    }
            else{
                System.out.println("Local IP address format is unknoun");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Error gettin local IP address: " + e.getMessage());
        }
}
}
