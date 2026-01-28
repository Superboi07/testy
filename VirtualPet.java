public class VirtualPet {
    private String name;
    private int energy;
    private int happiness;
    private int weight;
    private int age;

    public VirtualPet(String n) {
        name = n;
        weight = 5;
    }

    public String getName() {
        return name;
    }
    public int getEnergyLevel() {
        return energy;
    }
    public int getHappinessLevel() {
        return happiness;
    }

    public void feed() {
        if (energy < 10) energy++;
        weight++;
    }

    public void play() {
        if (weight > 5) weight--;
        if (happiness < 10) happiness++;
    }

    public void updateStatus() {
        age++;
        if (energy > 0) energy--;
        if (happiness > 0) happiness--;
    }

    public String toString() {
        return name + "'s Information:\nEnergy: " + energy + "\nHappiness: " + happiness + "\nWeight: " + weight + "g\nAge: " + (age%12) + " months and " + ((age-(age%12))/12) + " years";
    }
}