/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.InetAddress;
import java.net.UnknownHostException; //
public class LoopBackAdd {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("127.0.0.1");
            if(address.isLoopbackAddress()){
                System.out.println("The address is  loopback address ");
            }
            else
            {
                System.out.println("The adddress is not loopback address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}

//InetAddress address = InetAddress.getByName("FF0E::1");
