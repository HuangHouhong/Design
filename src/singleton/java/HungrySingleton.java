package singleton.java;

/**
 * 饿汉式
 *
 */
public class HungrySingleton {

    // 在静态初始化器中创建单例,即jvm加载该类的时候初始化。保证了多线程安全
    private static HungrySingleton sInstance = new HungrySingleton();


    /**
     * 构造函数私有化
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return sInstance;
    }
}
