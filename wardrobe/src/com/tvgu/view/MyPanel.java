package com.tvgu.view;

import com.tvgu.wardrobe.Material;
import com.tvgu.wardrobe.Wardrobe;
import com.tvgu.wardrobe.WardrobeInterface;
import com.tvgu.wardrobe.shelf;

import javax.swing.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
    int value_of_shelf;
    int weight;
    int hight;
    int price;
    private JButton button1;
    private JButton Button2;
    private JTextField weigh;
    private JTextField high;
    private JTextField cost;
    public JPanel panelWardrobe;
    private JTextField value_of_shelf_Text_field;
    private JTextArea textArea1;
    WardrobeInterface[] arrShelf = new WardrobeInterface[100];

    public void setValue_of_shelf(int value_of_shelf) {
        this.value_of_shelf = value_of_shelf;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHight(int hight) {
            this.hight = hight;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public MyPanel() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < value_of_shelf; i++) {
                    arrShelf[i] = new shelf(new Material(new Wardrobe()));
                    arrShelf[i].setHave_a_door(true);
                    arrShelf[i].setValue_of_shelf(value_of_shelf);
                    arrShelf[i].setSize(weight,hight);
                    arrShelf[i].setCost(price);
                }
                String str = Integer.toString(arrShelf[0].cost());
                textArea1.append(arrShelf[0].Decription()+ "\n");
                textArea1.append("wardrobe cost = "+ str + "\n");
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < value_of_shelf; i++) {
                    arrShelf[i] = new shelf(new Material(new Wardrobe()));
                    arrShelf[i].setHave_a_door(false);
                    arrShelf[i].setValue_of_shelf(value_of_shelf);
                    arrShelf[i].setSize(weight,hight);
                    arrShelf[i].setCost(price);
                }
                String str = Integer.toString(arrShelf[0].cost());
                textArea1.append(arrShelf[0].Decription()+ "\n");
                textArea1.append("wardrobe cost = "+ str + "\n");
            }
        });
        value_of_shelf_Text_field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = value_of_shelf_Text_field.getText();
                int i=Integer.parseInt(str);
                setValue_of_shelf(i);
            }
        });
        weigh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = weigh.getText();
                int i=Integer.parseInt(str);
                setWeight(i);
            }
        });
        high.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = high.getText();
                int i=Integer.parseInt(str);
                setHight(i);
            }
        });
        cost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = cost.getText();
                int i=Integer.parseInt(str);
                setPrice(i);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
