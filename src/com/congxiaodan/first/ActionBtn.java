package com.congxiaodan.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ActionBtn implements ActionListener {
    int i = 0;
    JButton btn;
    JLabel lab;
    Icon icon1, icon2;

    ActionBtn(JButton j, JLabel l) {
        btn = j;
        lab = l;
        icon1 = new ImageIcon("images/bai.jpg");
        icon2 = new ImageIcon("images/hei.jpg");
    }

    public void actionPerformed(ActionEvent e) {
        i++;
        //System.out.println(i);
        if (i == 1 && Mouse.mcount % 2 > 0) {
            lab.setText("                                           白子走..");
            btn.setIcon(icon2);
        } else {
            if (i == 1 && Mouse.mcount % 2 == 0) {
                lab.setText("                                           黑子走..");
                btn.setIcon(icon1);
            } else {
                JOptionPane.showMessageDialog(null, "该点已有棋子！！", "错误", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
