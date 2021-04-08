package singleton.java;

/**
 * 饿汉式.
 * 使用静态内部类完成初始化
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class SingletonHolder{
        private final static StaticInnerSingleton sInstance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.sInstance;
    }
}
