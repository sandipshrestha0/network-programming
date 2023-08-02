/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.*;
public class MCSiteLocal {
     public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF05::1");//FF05,FF15
            if(address.isMCSiteLocal()){
                System.out.println("The address is  multicast site local address ");
            }
            else
            {
                System.out.println("The adddress is not multicast site local address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}
