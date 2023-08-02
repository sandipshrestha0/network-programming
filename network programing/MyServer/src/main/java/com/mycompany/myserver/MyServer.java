
package com.mycompany.myserver;
import java.io.*;
import java.net.*;
import java.net.ServerSocket;
public class MyServer {

    public static void main(String[] args) {
        try{
            ServerSocket ss;
            ss=new ServerSocket(6666);
            Socket s = ss.accept(); //establishes connection 
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("message="+str);
            ss.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
