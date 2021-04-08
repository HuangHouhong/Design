# 单例模式

## java 文件夹下
- HungrySingleton: 饿汉式单例模式
- LazySingleton: 懒汉式单例模式.使用的是双重检查锁的方式
- StaticInnerSingleton: 静态内部类的方式实现单例模式，实际上也是属于饿汉式的一种实现。
- template文件夹: 参考自android源码的一种单例模式的实例，是通过双重检查所和泛型结合，为单例提供一个模板。

## kotlin 文件夹下
- DoubleCheckSingleton: 双重检查锁实现单例
- HungrySingleton: 对象申明实现的饿汉式单例
- LazySingleton: 伴生对象实现的懒汉式单例
- StaticInnerSingleton: 内部类实现的饿汉式单例
