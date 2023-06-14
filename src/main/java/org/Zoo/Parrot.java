package org.Zoo;

import java.util.Scanner;

public class Parrot extends Birds{

    public static void cleanFeather() {
        System.out.println("He is so cute - he is cleaning his feather");
    }

    public static void saySomething() {
        System.out.println("Say something and he will repeat after you");
        String repetition = new Scanner(System.in).nextLine();
        System.out.println(repetition);
    }
}
