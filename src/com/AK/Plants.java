package com.AK;

public class Plants {

    private String names;
    private int roots;
    private int leaves;
    private int flowers;
    private int stems;

    public Plants(String names, int roots, int leaves, int flowers, int stems) {
        this.names = names;
        this.roots = roots;
        this.leaves = leaves;
        this.flowers = flowers;
        this.stems = stems;
    }

    public void food() {
        System.out.println("Plants.food() called");

    }

    public void typeOfWalls(int size) {
        System.out.println("Cactaceae is " +size);

    }

    public String getNames() {
        return names;
    }

    public int getRoots() {
        return roots;
    }

    public int getLeaves() {
        return leaves;
    }

    public int getFlowers() {
        return flowers;
    }

    public int getStems() {
        return stems;
    }
}

