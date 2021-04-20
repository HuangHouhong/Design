package factory.simple.s2;

import factory.simple.ConcreteProductA;
import factory.simple.Product;

/**
 * 具体的工厂
 */
public class ConcreteFactoryA extends AbsFactory{

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
