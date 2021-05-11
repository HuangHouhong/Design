package iterator.simple;

/**
 * 抽象迭代器
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
