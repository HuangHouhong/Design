package factory.simple.s2;

import factory.simple.ConcreteProductA;
import factory.simple.ConcreteProductB;
import factory.simple.Product;

/**
 * 具体的工厂
 */
public class ConcreteFactoryB extends AbsFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
