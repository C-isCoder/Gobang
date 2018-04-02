package com.congxiaodan.first;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    int i = 0, t = 0;
    JPanel pan1, pan2, pan3, pan4;
    GridLayout layout;
    JButton btn[], jbtn[][], jbtn1, jbtn2;
    BorderLayout blayout, blayout1, blayout2;
    JMenuBar bar;
    JMenu menu, menu1;
    JMenuItem item, item1, item2;
    Icon icon;
    JTextArea txt;
    JLabel lab, lab1;

    MyFrame(String s) {
        super(s);
        this.setSize(750, 525);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        JPanel pan = new JPanel();
        pan1 = new JPanel();
        pan2 = new JPanel();
        pan3 = new JPanel();
        pan4 = new JPanel();
        lab = new JLabel();
        lab1 = new JLabel();


        icon = new ImageIcon("images\\tu.jpg");
        txt = new JTextArea("寒冬萧萧不寐天，星空点点下五连，\n对面有缘棋会友，局中得先喜开颜。", 4, 16);
        txt.setLineWrap(true);
        txt.setFont(new Font("楷体", Font.BOLD, 18));
        txt.setBackground(new Color(239, 239, 239, 239));
        txt.setEditable(false);
        layout = new GridLayout(14, 14);
        blayout = new BorderLayout(0, 10);
        blayout1 = new BorderLayout();
        blayout2 = new BorderLayout();
        this.setContentPane(pan);

        pan.setLayout(blayout);
        pan1.setLayout(layout);
        pan2.setLayout(blayout1);
        pan4.setLayout(blayout2);

        bar = new JMenuBar();
        menu = new JMenu("游戏");
        menu1 = new JMenu("帮助");
        item = new JMenuItem("开始");
        item1 = new JMenuItem("退出");
        item2 = new JMenuItem("关于");

        setJMenuBar(bar);
        bar.add(menu);
        bar.add(menu1);
        menu.add(item);
        menu.addSeparator();
        menu.add(item1);
        menu1.add(item2);

        jbtn1 = new JButton("New Game");
        jbtn2 = new JButton("let's go!!");
        btn = new JButton[196];
        jbtn = new JButton[14][14];
        for (; i < 196; i++) {
            btn[i] = new JButton();
            btn[i].setBackground(new Color(192, 175, 129));
            btn[i].addActionListener(new ActionBtn(btn[i], lab1));
            btn[i].addMouseListener(new Mouse());
            pan1.add(btn[i]);
        }

        lab.setIcon(icon);
        pan3.add(jbtn2);
        pan3.add(jbtn1);
        pan4.add(lab1, BorderLayout.CENTER);
        pan4.add(lab, BorderLayout.NORTH);
        pan4.add(txt, BorderLayout.SOUTH);
        pan2.add(pan3, BorderLayout.NORTH);
        pan2.add(pan4, BorderLayout.CENTER);
        pan.add(pan1, BorderLayout.CENTER);
        pan.add(pan2, BorderLayout.EAST);
        pan1.setVisible(false);

        item.addActionListener(new ActionMenu(pan1, lab1));
        item1.addActionListener(new ActionMenu(pan1, lab1));
        item2.addActionListener(new ActionMenu(pan1, lab1));
        jbtn1.addActionListener(new Action(pan1, lab1, this));
        jbtn2.addActionListener(new Action(pan1, lab1, this));

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
