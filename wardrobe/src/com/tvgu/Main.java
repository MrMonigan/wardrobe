package com.tvgu;

import com.tvgu.view.MyFrame;
import com.tvgu.view.MyPanel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MyFrame frame;
        MyPanel panel = new MyPanel();
        frame = new MyFrame(panel);
    }
}
