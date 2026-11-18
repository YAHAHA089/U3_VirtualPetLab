// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int weight;
    private int happinessLevel;
    private int months;
    private int years;
    public VirtualPet(String name){
        this.name = name;
        this.weight = 5;
    }
    public String getName() {
        return name;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }
    public int getWeight() {
        return weight;
    }
    public int getHappinessLevel() {
        return happinessLevel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }
    public String toString() {
        return name + "'s \n Information;\n" + " Energy: " + energyLevel + "\n Happiness: " + happinessLevel + "\n Weight: " + weight +"\n Age: " + months + " months \n and " + years + " years";
    }
    public void feed(){
        weight++;
        energyLevel++;
        if(energyLevel >= 10){
            energyLevel = 10;
        }
    }
    public void play(){
        happinessLevel++;
        if(happinessLevel >= 10){
            happinessLevel = 10;
        }
        weight--;
        if(weight < 5){
            weight = 5;
        }
    }
    public void updateStatus(){
        happinessLevel--;
        energyLevel--;
        if(happinessLevel <= 0){
            happinessLevel = 0;
        }
        if(energyLevel <= 0){
            energyLevel = 0;
        }
        months++;
        if(months == 12){
            years++;
            months = 0;
        }
    }
}
