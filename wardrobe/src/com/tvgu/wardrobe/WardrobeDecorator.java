package com.tvgu.wardrobe;


public abstract class WardrobeDecorator implements WardrobeInterface {
    WardrobeInterface wardrobe;

    WardrobeDecorator(WardrobeInterface wardrobe) {
        this.wardrobe=wardrobe;
    }

    @Override
    public abstract int cost();

    @Override
    public abstract String Decription();

    @Override
    public abstract void setHave_a_door(boolean have_a_door);

    @Override
    public abstract void setValue_of_shelf(int value_of_shelf);

    @Override
    public abstract void setSize(int weigh, int high);

    @Override
    public abstract void setCost(int cost);

    @Override
    public abstract void changeShelf(int weigh, int high, int cost);
}


