package com.tvgu.wardrobe;

public class Wardrobe implements WardrobeInterface{
    public boolean have_a_door;

    public Wardrobe(){have_a_door=false; }

    @Override
    public void setHave_a_door(boolean have_a_door){
        this.have_a_door=have_a_door;
    }

    @Override
    public int cost() {
        if (have_a_door==true)
            return 5000;
        else
            return 0;
    }

    @Override
    public String Decription() {
        return "base complectation and "+have_a_door+ " have a door";
    }
    @Override
    public void setValue_of_shelf(int value_of_shelf) {
    }

    @Override
    public void setSize(int weigh, int high) {

    }

    @Override
    public void setCost(int cost) {

    }

    @Override
    public void changeShelf(int weigh, int high, int cost) {

    }
}
