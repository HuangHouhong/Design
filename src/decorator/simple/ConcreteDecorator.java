package decorator.simple;

/**
 * 具体的装饰者
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterOperation() {
        System.out.println("被装饰者执行完操作后，在此做事情");
    }
}
