package factory.simple;

/**
 * 具体的产品类
 */
public class ConcreteProductB extends Product {
    @Override
    public void println() {
        System.out.println("this is product B");
    }
}
