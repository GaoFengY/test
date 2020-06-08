package singleton.innerstaticsingleton;

/**
 * 完美的兼顾了饿汉式的内存空间的浪费，以及synchronized的性能问题
 * 默认使用InnerStaticSingleTon时，会先初始化内部类；如果不适用的话，内部类是不加载的
 */
public class InnerStaticSingleTon {
    private InnerStaticSingleTon(){
        //不加这个的话会被反射攻击
        if(LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    /**
     * static关键字是为了单例的空间共享
     * final关键字保证不被重写和重载
     * @return
     */
    public static final InnerStaticSingleTon getInstance(){
        //在返回结果之前一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载
    public static class LazyHolder{
        private static final InnerStaticSingleTon LAZY = new InnerStaticSingleTon();
    }
}
