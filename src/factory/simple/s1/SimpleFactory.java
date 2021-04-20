package factory.simple.s1;

import factory.simple.ConcreteProductA;
import factory.simple.ConcreteProductB;
import factory.simple.ConcreteProductC;
import factory.simple.Product;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 工厂方法为静态的
     */
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return new ConcreteProductC();
        }
    }
}
