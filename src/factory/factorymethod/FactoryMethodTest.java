package factory.factorymethod;

import factory.IDrink;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IDrinkFactory factory = new ColaFactory();
        IDrink drink = factory.create();
        drink.product();
        IDrinkFactory factory1 = new CoffeeFactory();
        IDrink drink1 = factory1.create();
        drink1.product();
        IDrinkFactory factory2 = new SpiritFactory();
        IDrink drink2 = factory2.create();
        drink2.product();
    }
}
