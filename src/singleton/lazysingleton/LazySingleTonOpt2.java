package singleton.lazysingleton;

/**
 * 相比上面方式，性能有了一定的提升
 * 但是对性能还是存在一定的影响
 */
public class LazySingleTonOpt2 {
    private static LazySingleTonOpt2 lazySingleTon = null;

    private LazySingleTonOpt2(){
    }

    /**
     * 使用双重检查锁
     * @return
     */
    private synchronized LazySingleTonOpt2 getInstance(){
        if (lazySingleTon == null) {
            synchronized (LazySingleTonOpt2.class) {
                if(lazySingleTon == null) {
                    lazySingleTon = new LazySingleTonOpt2();
                }
            }
        }
        return lazySingleTon;
    }
}
