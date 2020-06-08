package factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MeidaFactory factory = new MeidaFactory();
        factory.productBingXiang().createBingXiang();
        factory.productKongTiao().createKongTiao();
    }

}
