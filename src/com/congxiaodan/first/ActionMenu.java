package com.congxiaodan.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class ActionMenu implements ActionListener {
    JPanel pan;
    JLabel lab;

    ActionMenu(JPanel j, JLabel l) {
        pan = j;
        lab = l;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("关于")) {
            JOptionPane.showMessageDialog(null, "本程序有以下成员为你打造：\n薛继飞、王赓、刘英豪、雷奥、丛晓丹\n感谢使用～～！");
        }
        if (e.getActionCommand().equals("退出")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("开始")) {
            pan.setVisible(true);
            lab.setText("                                           黑子先走");

        }

    }

}
