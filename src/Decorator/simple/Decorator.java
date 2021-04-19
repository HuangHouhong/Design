package Decorator.simple;

/**
 * 抽象装饰者
 */
public abstract class Decorator extends Component {

    // 被修饰者
    private Component mComponent;

    // 构造函数传入被修饰者
    public Decorator(Component component) {
        this.mComponent = component;
    }

    @Override
    public void operation() {
        if (mComponent != null) {
            mComponent.operation();
            afterOperation();
        }
    }

    public abstract void afterOperation();
}
