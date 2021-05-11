package iterator.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体容器
 */
public class ConcreteAggregate implements Aggregate<String> {
    private List<String> mList = new ArrayList<>();

    public void add(String item) {
        mList.add(item);
    }

    @Override
    public Iterator<String> createIterator() {
        return new ConcreteIterator(mList);
    }
}
