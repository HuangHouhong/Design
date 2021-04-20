package factory.simple;

/**
 * 具体的产品类
 */
public class ConcreteProductA extends Product {
    @Override
    public void println() {
        System.out.println("this is product A");
    }
}
