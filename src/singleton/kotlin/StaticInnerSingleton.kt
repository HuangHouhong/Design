package singleton.kotlin

class StaticInnerSingleton {
    companion object {
        val instance = SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = StaticInnerSingleton()
    }
}