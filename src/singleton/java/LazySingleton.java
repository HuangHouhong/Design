package singleton.java;

/**
 * 懒汉式
 */
public class LazySingleton {

    // volatile 关键字保证当sInstance被初始化，能够及时被其它线程得知
    private volatile static LazySingleton sInstance;

    /**
     * 构造函数私有化
     */
    private LazySingleton() {

    }

    /**
     * 提供静态方法返回实例
     * 使用双重检查锁的方式
     */
    public static LazySingleton getInstance() {
        if (null == sInstance) {
            synchronized (LazySingleton.class) {
                if (sInstance == null) {
                    sInstance = new LazySingleton();
                }
            }
        }
        return sInstance;
    }
}
