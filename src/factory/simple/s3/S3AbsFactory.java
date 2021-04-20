package factory.simple.s3;

import factory.simple.OtherProduct;
import factory.simple.Product;

/**
 * 抽象工厂
 */
public abstract class S3AbsFactory {
    public abstract Product createProduct();

    public abstract OtherProduct createOtherProduct();
}
