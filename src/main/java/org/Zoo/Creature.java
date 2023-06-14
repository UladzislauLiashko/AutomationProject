package org.Zoo;

public class Creature {
    static boolean isAlive = true;
    boolean landLiving;
    boolean waterLiving;
    boolean airLiving;

    public String getEnvironment(){
        String mainEnvironment = "";
        if (airLiving) {
            mainEnvironment += "Air";
        } if (waterLiving) {
            mainEnvironment += " Water";
        } if (landLiving) {
            mainEnvironment += " Land";
        }
        return mainEnvironment.trim();
    }
}
