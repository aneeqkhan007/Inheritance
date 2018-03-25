package com.AK;

public class Main {

    public static void main(String[] args) {
        Plants plants = new Plants( "Plants", 1, 2, 5, 5);

//        Cactaceae cactaceae = new Cactaceae("Cereus", 0, 5, 1,6, 100, "green");
//        cactaceae.food();
//        cactaceae.desertplant();
//        cactaceae.houseplant();

        Moneyplant moneyplant = new Moneyplant("GoldenDevil", 2, 1, 9,5, "tiny");
        moneyplant.food();
        moneyplant.officeplant();
        moneyplant.homeplant();


    }
}
