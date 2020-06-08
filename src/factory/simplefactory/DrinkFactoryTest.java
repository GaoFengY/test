package factory.simplefactory;

import factory.IDrink;

public class DrinkFactoryTest {
    public static void main(String[] args) {
        DrinkFactory factory = new DrinkFactory();
        IDrink drink = factory.create("coffee");
        drink.product();
    }
}
