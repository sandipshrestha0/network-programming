/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myurl;

import java.net.*;
import java.io.*;
public class UrlEncode1 {
    public static void main(String[] args) throws UnsupportedEncodingException{
        String input ="Hello world!";
        String encoded = URLEncoder.encode(input, "UTF=8");
        System.out.println("Input string" + input);
        System.out.println("Encoded string" + encoded);
    }
}
