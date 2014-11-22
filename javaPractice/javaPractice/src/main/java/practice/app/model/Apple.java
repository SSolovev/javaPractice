package practice.app.model;

import practice.app.model.food.Fruit;

public class Apple extends Fruit {

    public Apple() {
        System.out.println("Apple!");
    }

    @Override
    public void printFruit() {
        System.out.println("THIS IS PUBLIC APLLE");
    }
}
