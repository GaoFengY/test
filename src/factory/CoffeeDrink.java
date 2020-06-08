package factory;

public class CoffeeDrink implements IDrink {
    @Override
    public void product() {
        System.out.println("生产咖啡");
    }
}
