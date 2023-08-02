
package com.mycompany.internetadddress;


import java.net.InetAddress;
import java.net.UnknownHostException; //
public class MultiCastLinkLocal {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF12::1");
            if(address.isMCLinkLocal()){
                System.out.println("The address is  MCLink Local address ");
            }
            else
            {
                System.out.println("The adddress is not MCLink Local address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
}

// InetAddress address = InetAddress.getByName("FF0E::1");
//InetAddress address = InetAddress.getByName("FF02::1");
