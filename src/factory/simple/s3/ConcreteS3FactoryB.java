package factory.simple.s3;

import factory.simple.*;

/**
 * 具体工厂
 */
public class ConcreteS3FactoryB extends S3AbsFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public OtherProduct createOtherProduct() {
        return new ConcreteOtherProductB();
    }
}
