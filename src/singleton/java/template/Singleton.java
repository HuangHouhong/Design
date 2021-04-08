package singleton.java.template;

/**
 * 参考自android.util.Singleton源码
 */
public abstract class Singleton<T> {

    private T mInstance;

    protected abstract T create();

    public final T get() {
        if (mInstance == null) {
            synchronized (this) {
                if (mInstance == null) {
                    mInstance = create();
                }
            }
        }
        return mInstance;
    }
}
