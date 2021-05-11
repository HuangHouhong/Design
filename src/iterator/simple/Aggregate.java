package iterator.simple;

/**
 * 抽象容器。
 * 需要提供一个返回迭代器的接口
 */

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
