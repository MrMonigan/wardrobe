package com.tvgu.view;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame(MyPanel p) {
        super("QueueStackList");
        setContentPane(new MyPanel().panelWardrobe);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
