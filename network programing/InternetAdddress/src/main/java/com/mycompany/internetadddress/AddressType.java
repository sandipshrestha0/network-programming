//Check if given ip address is local or not
package com.mycompany.internetadddress;
import java.net.InetAddress;
import java.net.UnknownHostException; //
public class AddressType {
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getByName("FF0E::1");
            if(address.isAnyLocalAddress()){
                System.out.println("The address is the 'any' local address ");
            }
            else
            {
                System.out.println("The adddress is not the 'any' local address ");
            }
        }
        catch(UnknownHostException e)
        {
            System.out.println("Invalid address");
        }
    }
        
}
// InetAddress address = InetAddress.getByName("0.0.0.0");
// InetAddress address = InetAddress.getByName("169.254.0.1");
// InetAddress address = InetAddress.getByName("FF0E::1");