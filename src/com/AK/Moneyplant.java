package com.AK;

public class Moneyplant extends Plants {

    private int apicalBud;
    private int body;
    private String node;

    public Moneyplant(String names, int flowers, int color, int apicalBud, int body, String node) {

        super(names, 7, 19, flowers, color);
        this.apicalBud = apicalBud;
        this.body = body;
        this.node = node;

    }

    private void light() {

    }

    public void officeplant() {
        System.out.println("Moneyplant.officeplant() called");
        typeOfWalls(2);

    }

    public void homeplant() {
        System.out.println("Moneyplant.homeplant() called");
        typeOfWalls(1);

    }

    public void internode(int size) {
        officeplant();
        homeplant();
        super.typeOfWalls(size);
    }


}
