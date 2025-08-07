package DesignPrinciples.SimuDuck;

public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack(); 

        mallard.setFlyBehavior(new FlyNoWay()); // Change fly behavior
        mallard.performFly(); // Now it can't fly
    }
}
