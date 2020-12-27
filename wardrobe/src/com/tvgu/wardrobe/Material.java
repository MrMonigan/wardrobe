package com.tvgu.wardrobe;

public class Material extends WardrobeDecorator {
    public Material(WardrobeInterface wardrobe){super(wardrobe);}
    @Override
    public int cost(){ return wardrobe.cost()+10000; }
    @Override
    public String Decription() {
        return wardrobe.Decription()+" material complectation";
    }

    @Override
    public void setHave_a_door(boolean have_a_door) {
        wardrobe.setHave_a_door(have_a_door);
    }
    @Override
    public void setValue_of_shelf(int value_of_shelf) {
    }
    @Override
    public void setSize(int weigh, int high) {
        wardrobe.setSize(weigh,high);
    }

    @Override
    public void setCost(int cost) {
        wardrobe.setCost(cost);
    }

    @Override
    public void changeShelf(int weigh, int high, int cost) {
        wardrobe.setSize(weigh, high);
        wardrobe.setCost(cost);
    }

}
