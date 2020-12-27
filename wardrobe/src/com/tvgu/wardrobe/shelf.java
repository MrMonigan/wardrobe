package com.tvgu.wardrobe;

    public class shelf extends WardrobeDecorator {

        int value_of_shelf = 0;
        int weigh = 0, high = 0;
        int cost = 0;

        public shelf(int n, int weigh, int high, int cost, WardrobeInterface wardrobe) {
            super(wardrobe);
            setValue_of_shelf(n);
            setSize(weigh, high);
            setCost(cost);
        }
        public shelf(WardrobeInterface wardrobe) {
            super(wardrobe);
            setValue_of_shelf(0);
            setSize(0,0);
            setCost(0);
        }

        @Override
        public void setValue_of_shelf(int value_of_shelf) {
            this.value_of_shelf = value_of_shelf;
        }

        @Override
        public void setSize(int weigh, int high) {
            this.weigh = weigh;
            this.high = high;
        }

        @Override
        public void setCost(int cost) {
            this.cost = cost;
        }

        @Override
        public void changeShelf(int weigh, int high, int cost) {
            this.weigh = weigh;
            this.high = high;
            this.cost = cost;
        }


        @Override
        public int cost() {
            return wardrobe.cost() + value_of_shelf * (weigh * high * cost);
        }

        @Override
        public String Decription() {
            return wardrobe.Decription() + " " + value_of_shelf + " value of shelf " + weigh + " weigh " + high + " high";
        }

        @Override
        public void setHave_a_door(boolean have_a_door) {
            wardrobe.setHave_a_door(have_a_door);
        }
    }
