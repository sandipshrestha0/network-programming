/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myurl;
import javax.swing.*;
public class PasswordField {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Password Field");
        JPasswordField value = new JPasswordField();
        JLabel l1= new JLabel("Password: ");
        l1.setBounds(20,100,80,30);
        value.setBounds(20,100,100,30);
        f.add(value);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
