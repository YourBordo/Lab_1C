package bsu.rfe.java.lab1;

public class Cocktail extends Food{
    String drink = "some drink";
    String fruit = "some fruit";

    public Cocktail(String drink) {
        super("Cocktail");
        this.drink = drink;
    }
    public Cocktail(String drink, String type) {
        super("Cocktail");
        this.fruit = type;
        this.drink = drink;
    }
    public Cocktail() {
        super("Cocktail");
            }

    @Override
    public boolean equals(Object cocktail) {

        if (super.getName().equals(((String[])cocktail)[0])){
            if(((String[])cocktail).length == 2)
            {
                return this.drink.equals(((String[])cocktail)[1]);
            }
            if(((String[])cocktail).length == 3)
            {
                return this.drink.equals(((String[])cocktail)[1]) && this.fruit.equals(((String[])cocktail)[2]);
            }
            return true;
        }
        return  false;

    }

    @Override
    public void consume() {
        System.out.println(drink + " with " + fruit + " (" + super.getName() + ") ");
    }

    @Override
    public int calculateCalories() {
        switch (fruit){
            case "orange": calories = 10; break;
            case "mango": calories = 15;break;
            case "pear": calories = 20;break;
            case "lemon": calories = 13;break;
            default:
                fruit = "some taste";
                calories = 5;break;
        }

        switch (drink){
            case "milk": calories += 23; break;
            case "juice": calories += 15;break;
            case "water": calories += 4;break;
            case "sprite": calories += 70;break;
            default:
                drink = "some drink";
                calories += 5;break;
        }
        return calories;
    }
}
