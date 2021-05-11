package iterator.simple;

import java.util.List;

/**
 * 具体迭代器.
 * 这里是对list的迭代
 */
public class ConcreteIterator implements Iterator<String> {

    private List<String> mList;
    // 记录当前游标位置
    private int cursor = -1;

    public ConcreteIterator(List<String> list) {
        mList = list;
    }

    @Override
    public boolean hasNext() {
        if (mList == null || mList.isEmpty()) {
            return false;
        }
        return cursor + 1 < mList.size();
    }

    @Override
    public String next() {
        cursor++;
        return mList.get(cursor);
    }
}
