package bsu.rfe.java.lab1;

public abstract class Food implements INutritious, IConsumable{
    int calories = 0;
    private String name;

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }

}
