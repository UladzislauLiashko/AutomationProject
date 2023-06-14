package org.Zoo;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<AnimalFeature> listOfCreatures = new ArrayList<>();
        listOfCreatures.add(new Lion());
        listOfCreatures.add(new Goldfish());
        listOfCreatures.add(new Parrot());
        listOfCreatures.add(new Elephant());
        listOfCreatures.add(new Peugeon());
        listOfCreatures.add(new Shark());


        System.out.println("Please, select an animal");
        for (int i = 0; i < listOfCreatures.size(); i++) {
            AnimalFeature animal = listOfCreatures.get(i);
            System.out.println(i + 1 + " - " + animal.getClass().getSimpleName());
        }
        int userChoice;
        do {
            System.out.print("Please choose your animal: ");
            userChoice = new Scanner(System.in).nextInt();
            if (userChoice > 0 && userChoice < listOfCreatures.size() + 1) {
                System.out.println(listOfCreatures.get(userChoice - 1).getClass().getSimpleName());
                listOfCreatures.get(userChoice - 1).breathe();
                listOfCreatures.get(userChoice - 1).move();
            } else {
                System.out.println("Wrong number");
            }
        } while (userChoice > 0);
    }
}
