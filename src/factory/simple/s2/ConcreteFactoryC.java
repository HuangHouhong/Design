package factory.simple.s2;

import factory.simple.ConcreteProductA;
import factory.simple.ConcreteProductC;
import factory.simple.Product;

/**
 * 具体的工厂
 */
public class ConcreteFactoryC extends AbsFactory{

    @Override
    public Product createProduct() {
        return new ConcreteProductC();
    }
}
