package factory.factorymethod;

import factory.ColaDrink;
import factory.IDrink;

public class ColaFactory implements IDrinkFactory{

    @Override
    public IDrink create() {
        return new ColaDrink();
    }
}
