package bsu.rfe.java.lab1;

public class Cheese extends Food {

    public Cheese() {
        super("Cheese");
    }

    public void consume() {
        System.out.println(super.getName());
    }


    @Override
    public int calculateCalories() {
    calories = 25;
    return calories;
    }
}