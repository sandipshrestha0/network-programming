/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDPServer {
    public static void main(String args[])
    {
        try{
            //specify the port number to the listen on 
            int port = 12345;
            //create a datagramsocket bound to the specified port
            DatagramSocket socket = new DatagramSocket(port);
            System.out.println("server listning on port" + port);
            
            //create a buffer to receive incoming data
            byte[] receiveData = new byte[102];
                    while(true)
                    {
                        //create a DatagramPacket to store the incoming data
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            
            //receive the packet from the client
            socket.receive(receivePacket);
            
            //extract the data from the packet
            String clientMessage = new String(receivePacket.getData());
            
            //display
                    }
        }
        
    }
}
