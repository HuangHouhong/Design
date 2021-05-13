package composite.simple;

import java.util.List;

/**
 * 抽象接口
 */
public abstract class Component {

    protected String mName;

    public Component(String name) {
        mName = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract List<Component> getChild();

    public abstract void operation();
}
