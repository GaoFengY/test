package factory.simplefactory;

import factory.ColaDrink;

public class DrinkFactoryOptTest {
    public static void main(String[] args) {
        DrinkFactoryOpt wOpt = new DrinkFactoryOpt();
        wOpt.create(ColaDrink.class).product();
    }
}
