package com.AK;

public class Cactaceae extends Plants {

    private int body;
    private int height;
    private int weather;
    private String color;

    public Cactaceae(String names, int flowers, int stems, int body, int height, int weather, String color) {
        super(names, 11, 0, flowers, stems);
        this.body = body;
        this.height = height;
        this.weather = weather;
        this.color = color;

    }

    public void sun() {
        System.out.println("Cactaceae.sun() called");
    }

    @Override
    public void food() {
        System.out.println("Cactaceae.food() called");
        sun();
        super.food();
    }

    public void desertplant() {
        System.out.println("Cactaceae.desertplant() called");
        typeOfWalls(1);

    }

     public void houseplant() {
         System.out.println("Cactacaea.houseplant() called");
         typeOfWalls( 2);
        }

}
