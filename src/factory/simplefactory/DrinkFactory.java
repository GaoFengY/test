package factory.simplefactory;

import factory.CoffeeDrink;
import factory.ColaDrink;
import factory.IDrink;
import factory.SpiritDrink;

public class DrinkFactory {
    public IDrink create(String name){
        if("cola".equals(name)) {
            return new ColaDrink();
        }else if("spirit".equals(name)) {
            return new SpiritDrink();
        }else if("coffee".equals(name)) {
            return new CoffeeDrink();
        }else{
            return null;
        }
    }
}
