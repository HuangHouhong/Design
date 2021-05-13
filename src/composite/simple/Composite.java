package composite.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器对象
 */
public class Composite extends Component{
    private List<Component> mChildList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        mChildList.add(component);
    }

    @Override
    public void remove(Component component) {
        mChildList.remove(component);
    }

    @Override
    public List<Component> getChild() {
        return mChildList;
    }

    @Override
    public void operation() {
        System.out.println("当前是普通节点：" + mName + " , 叶子节点数量为：" + mChildList.size());
    }
}
