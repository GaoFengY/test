package singleton.hungrysingleton;

/**
 * 饿汉式
 * 类加载的时候就立即初始化，并且创建对象
 * 绝对线程安全：线程还没出现的时候就已经初始化了，不可能存在访问安全的问题
 * 优点：没有加任何锁，执行效率较高
 * 缺点：类加载的时候就初始化，浪费了内存空间
 */
public class HungrySingleTon {
    /**
     * final能够防止利用反射机制修改
     */
    private static final HungrySingleTon hungrySingleton;

    static {
        hungrySingleton = new HungrySingleTon();
    }

    private HungrySingleTon(){
    }

    public static HungrySingleTon getInstance(){
        return hungrySingleton;
    }
}
