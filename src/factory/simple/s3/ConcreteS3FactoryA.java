package factory.simple.s3;

import factory.simple.*;

/**
 * 具体工厂
 */
public class ConcreteS3FactoryA extends S3AbsFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public OtherProduct createOtherProduct() {
        return new ConcreteOtherProductA();
    }
}
