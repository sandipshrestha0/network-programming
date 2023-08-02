/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myclient;

import java.io.*;
import java.net.*;
public class MyServer {
 public static void main(String[] args) throws IOException {
        //create server socket
        ServerSocket serverSocket = new ServerSocket(12345);
        
        while(true)
        {
            //wait for client  to connect
            Socket clientSocket;
            clientSocket = serverSocket.accept();
             //get output stream to send data to client
             OutputStream outputStream;
             outputStream = clientSocket.getOutputStream();
//        create data outputstream to write data to output stream
            DataOutputStream dataOutputStream;
            dataOutputStream = new DataOutputStream(outputStream);

             
             // sent data to client
             String data = "hello  client!!!";
             dataOutputStream.writeUTF(data);
             //close stream and socket
             dataOutputStream.close();
             outputStream.close();
             clientSocket.close();
            
        }
       
    }
}
