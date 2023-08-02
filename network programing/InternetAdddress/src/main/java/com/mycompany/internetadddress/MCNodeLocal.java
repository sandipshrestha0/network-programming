/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;

import java.net.*;
public class MCNodeLocal {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF11::1"); //FF01
            if(address.isMCNodeLocal()){
                System.out.println("The address is  multicast Node Local address ");
            }
            else
            {
                System.out.println("The adddress is not Node Local address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}
