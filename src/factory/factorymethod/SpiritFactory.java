package factory.factorymethod;

import factory.IDrink;
import factory.SpiritDrink;

public class SpiritFactory implements IDrinkFactory{

    @Override
    public IDrink create() {
        return new SpiritDrink();
    }
}
