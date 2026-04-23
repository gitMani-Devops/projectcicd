package com.shop.UIDesign;

import java.awt.Color;
import java.awt.TextField; //awt abstract window toll kit

import javax.swing.*;

public class MainUI {

    public void show() {
        JFrame f = new JFrame("Billing");
        // f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(600, 700); // size of frame
        f.setLayout(null); // it is used for to place input component
        // f.setExtendedState(JFrame.MAXIMIZED_BOTH); // this function is inbuilt Jframe
        // class
        // .setExtendedState() ->function
        // Frame.MAXIMIZED_BOTH it is static variable

        JButton fb = new JButton("Submit");
        fb.setBounds(90, 90, 80, 40);
        f.add(fb);

        JLabel l = new JLabel();
        l.setBounds(140, 120, 80, 40);
        f.add(l);
        l.setText("hello");

        JEditorPane ed = new JEditorPane();
        ed.setBounds(400, 120, 80, 40);
        ed.setBackground(Color.RED);
        ed.setText("Hello guys editpane got it");
        f.add(ed);

        JTextField tf = new JTextField();
        tf.setBounds(400, 120, 80, 40);
        tf.setBackground(Color.RED);
        tf.setText("Hello guys editpane got it");
        f.add(tf);
    }

}
