package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    static JFrame scene;

    public Check() {
        scene = new JFrame("VAVA cvicenie uloha");

        JTextArea exp=new JTextArea();
        exp.setBounds(400, 100, 200, 30);
        scene.add(exp);
        JLabel l = new JLabel("Zadaj retazec:");
        l.setBounds(300, 100, 100, 30);
        scene.add(l);


        JTextField reg = new JTextField();
        reg.setBounds(400, 150, 200, 30);
        reg.setBorder(null);
        scene.add(reg);
        JLabel lab = new JLabel("Zadaj regex:");
        lab.setBounds(300, 150, 200, 30);
        scene.add(lab);


        JButton button = new JButton("Skontroluj");
        button.setBounds(350, 220, 150, 40);
        scene.add(button);
        JLabel check = new JLabel();
        check.setBounds(350, 270, 120, 30);
        scene.add(check);


        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Pattern patt = Pattern.compile(reg.getText());
                Matcher match = patt.matcher(exp.getText());
                if (match.find() == true) {
                    check.setText("Spravne!");
                } else {
                    check.setText("Nespravne!");
                }
            }
        }
        );


        scene.setSize(800,400);
        scene.setLayout(null);
        scene.setVisible(true);
    }
}

