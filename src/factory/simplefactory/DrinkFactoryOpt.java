package factory.simplefactory;

import factory.IDrink;

public class DrinkFactoryOpt {
    public IDrink create(Class<? extends IDrink> clazz) {
        try{
            return clazz.newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
