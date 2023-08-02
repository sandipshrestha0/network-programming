
package com.mycompany.myclient;

import java.io.*;
import java.net.*;
public class MyClient {

    public static void main(String[] args)throws IOException {
        Socket socket;
        socket = new Socket("localhost",12345);
        
       InputStream inputStream;
       inputStream = socket.getInputStream();
       
       DataInputStream dataInputStream;
       dataInputStream = new  DataInputStream(inputStream);
       
       String data = dataInputStream.readUTF();
        System.out.println("Received data from server "+data);
        
        dataInputStream.close();
        inputStream.close();
        socket.close();
    }
}
