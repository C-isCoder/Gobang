package com.congxiaodan.first;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Mouse implements MouseListener {
    public static int mcount = 1;

    public void mouseClicked(MouseEvent e) {
        mcount++;
        //System.out.println(mcount);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

}
