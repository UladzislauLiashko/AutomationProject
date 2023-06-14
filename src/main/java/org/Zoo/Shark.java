package org.Zoo;

public class Shark extends Fish {

    public static void beScary() {
        System.out.println("Jeez, it is looking at us");
    }

    public static void eatFish() {
        Goldfish.isAlive = false;
        System.out.println("The goldfish is gone");
    }
}
