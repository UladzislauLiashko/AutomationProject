package org.Zoo;

public class Animals extends Creature implements AnimalFeature {

    @Override
    public void breathe() {
        System.out.println("It breathes with lungs");
    }

    @Override
    public void move() {
        System.out.println("It moves on the ground");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}