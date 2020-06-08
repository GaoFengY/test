package singleton.lazysingleton;

/**
 * 懒汉式优化一
 * 缺点:当线程数较多时，会导致大量线程阻塞，从而使得性能大幅度下降
 */
public class LazySingleTonOpt1 {

    private static LazySingleTonOpt1 lazySingleTon = null;

    private LazySingleTonOpt1(){
    }

    /**
     * 将此方法变成同步方法
     * @return
     */
    private synchronized LazySingleTonOpt1 getInstance(){
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTonOpt1();
        }
        return lazySingleTon;
    }
}
