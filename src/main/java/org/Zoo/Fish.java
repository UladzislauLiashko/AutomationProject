package org.Zoo;

public class Fish extends Creature implements AnimalFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes in the water");
    }

    @Override
    public void move() {
        System.out.println("It moves in the water");
    }
}
