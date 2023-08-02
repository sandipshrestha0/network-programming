/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.*;
public class MCOrgLocal {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF08::1");//FF0E, FF18
            if(address.isMCOrgLocal()){
                System.out.println("The address is  multicast org local address ");
            }
            else
            {
                System.out.println("The adddress is not multicast org local address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}
