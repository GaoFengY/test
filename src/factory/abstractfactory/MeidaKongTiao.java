package factory.abstractfactory;

public class MeidaKongTiao implements KongTiao{

    @Override
    public void createKongTiao() {
        System.out.println("生产空调");
    }
}
