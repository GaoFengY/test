package factory.factorymethod;

import factory.CoffeeDrink;
import factory.IDrink;

public class CoffeeFactory implements IDrinkFactory{

    @Override
    public IDrink create() {
        return new CoffeeDrink();
    }
}
