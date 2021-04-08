package singleton.kotlin

/**
 * 双重检查锁实现
 */
class DoubleCheckSingleton private constructor(){

    companion object {
        val instance : DoubleCheckSingleton by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DoubleCheckSingleton()
        }
    }
}