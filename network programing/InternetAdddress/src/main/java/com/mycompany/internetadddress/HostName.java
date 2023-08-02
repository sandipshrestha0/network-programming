/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.*;

public class HostName {
   
        public static void main(String[] args){
            try{
                //create a new InetAdddress objjecct representing an ip address
                InetAddress address = InetAddress.getByName("192.168.1.1");
                System.out.println("Ip address: " + address.getHostAddress());
                System.out.println("Hostname:" + address.getHostName());
                
                //create a new InetAddress object represeting a hostname
                InetAddress address2 = InetAddress.getByName("www.Google.com");
                System.out.println("Hostname:" + address2.getHostName());
                System.out.println("IPAddress:" + address2.getHostAddress());
            }
            catch(UnknownHostException e){
                System.out.println("Error creating InetAddress: " + e.getMessage());
            }
        }
    
}
