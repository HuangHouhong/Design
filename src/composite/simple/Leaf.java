package composite.simple;

import java.util.List;

/**
 * 叶子对象
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("叶子节点无法添加子元素");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("叶子节点无法移除子元素");

    }

    @Override
    public List<Component> getChild() {
        throw new UnsupportedOperationException("叶子节点没有子元素");
    }

    @Override
    public void operation() {
        System.out.println("当前是叶子节点： " + mName);
    }
}
