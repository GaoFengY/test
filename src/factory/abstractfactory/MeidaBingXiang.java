package factory.abstractfactory;

public class MeidaBingXiang implements BingXiang{
    @Override
    public void createBingXiang() {
        System.out.println("生产冰箱");
    }
}
