package com.congxiaodan.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Action implements ActionListener {
    JPanel pan;
    JLabel lab;
    JFrame frm;

    Action(JPanel p, JLabel l, JFrame f) {
        pan = p;
        lab = l;
        frm = f;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New Game")) {
            frm.setVisible(false);
            MyFrame fr = new MyFrame("五子棋    V1.0");
            fr.pan1.setVisible(true);
            fr.lab1.setText("                                           黑子先走");
            Mouse.mcount = 1;
        }
        if (e.getActionCommand().equals("let's go!!")) {
            pan.setVisible(true);
            lab.setText("                                           黑子先走");
        }
    }
}
