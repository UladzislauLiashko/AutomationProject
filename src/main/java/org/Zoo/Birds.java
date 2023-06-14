package org.Zoo;

public class Birds extends Creature implements AnimalFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes in the air");
    }

    @Override
    public void move() {
        System.out.println("It moves in the air, it flies");
    }
}
