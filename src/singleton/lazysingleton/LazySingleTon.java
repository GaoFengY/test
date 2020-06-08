package singleton.lazysingleton;

/**
 * 懒汉式
 * 被外部调用的时候才会被加载
 * 问题：不是线程安全的
 */
public class LazySingleTon {
    private static LazySingleTon lazySingleTon = null;

    private LazySingleTon(){
    }

    private LazySingleTon getInstance(){
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }
}
