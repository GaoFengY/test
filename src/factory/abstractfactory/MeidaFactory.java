package factory.abstractfactory;

public class MeidaFactory implements ProductFactory{
    @Override
    public BingXiang productBingXiang() {
        return new MeidaBingXiang() ;
    }

    @Override
    public KongTiao productKongTiao() {
        return new MeidaKongTiao() ;
    }
}
