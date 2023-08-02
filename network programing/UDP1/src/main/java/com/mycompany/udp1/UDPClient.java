/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPClient {

    public static void main(String[] args) {
        try
        {
            // create datagramSocket
            DatagramSocket socket = new DatagramSocket();
            
            //prepare the data to be sent
            String message = "Hello , server!";
            byte[] sendData = message.getBytes();
            
            //specify the destination ip address and port number
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int serverPort = 12345;
            
            //create a datagramPacket with the data, length, ip address, portnumber 
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            
            // sent the packet to the server
            socket.send(sendPacket);
            
            //receive the response from the server
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            
            socket.receive(receivePacket);
            
            // extract response and display it
            String serverResponse = new String(receivePacket.getData());
            System.out.println("server response" + serverResponse);
            
            //close the socket
            socket.close();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
