package factory;

import factory.simple.Product;
import factory.simple.s2.AbsFactory;
import factory.simple.s2.ConcreteFactoryA;
import factory.simple.s3.ConcreteS3FactoryA;
import factory.simple.s3.S3AbsFactory;

public class Main {
    public static void main(String[] args) {
        // 工厂方法使用
        // 如果想创建某个具体的产品，直接获取对应的工厂
        AbsFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.println();

        // 抽象工厂使用
        S3AbsFactory s3AbsFactory = new ConcreteS3FactoryA();
        s3AbsFactory.createProduct().println();
        s3AbsFactory.createOtherProduct().printOut();
    }
}
