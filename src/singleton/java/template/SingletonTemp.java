package singleton.java.template;

public class SingletonTemp {

    /**
     * 类加载的时候就创建了Singleton实例。
     * 但是只有在需要使用到 SingletonTemp 的时候，才会调用 create 方法创建 SingletonTemp
     */
    private static final Singleton<SingletonTemp> sInstance = new Singleton<SingletonTemp>() {
        @Override
        protected SingletonTemp create() {
            return new SingletonTemp();
        }
    };

    private SingletonTemp() {
    }

    public static SingletonTemp getInstance() {
        return sInstance.get();
    }
}
