package com.tvgu.wardrobe;

public interface WardrobeInterface {
    int cost();
    String Decription();
    void setHave_a_door(boolean have_a_door);
    void setValue_of_shelf(int value_of_shelf);
    void setSize(int weigh, int high);
    void setCost(int cost);

    void changeShelf(int weigh, int high, int cost);
}
