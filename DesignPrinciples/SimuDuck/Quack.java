package DesignPrinciples.SimuDuck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK! QUACK! QUACK!");
    }
    
}
