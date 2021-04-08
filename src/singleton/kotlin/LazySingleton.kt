package singleton.kotlin

/**
 * 懒汉式
 * 使用的是object关键字的另一种用法：伴生对象
 */
class LazySingleton private constructor(){

    companion object {
        private var instance: LazySingleton? = null
        get(){
            if (field == null) {
                field = LazySingleton()
            }
            return field
        }

        /**
         * 直接在get方法上加上锁，保证同一个时刻只有一处能够调用。
         */
        @Synchronized
        fun get(): LazySingleton {
            return instance!!
        }
    }
}