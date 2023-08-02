/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internetadddress;


import java.net.InetAddress;
import java.net.UnknownHostException; //
public class MultiCast {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF0E::1");
            if(address.isMCGlobal()){
                System.out.println("The address is  multicast address ");
            }
            else
            {
                System.out.println("The adddress is not multicast address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}
//1if(address.isMCGlobal())