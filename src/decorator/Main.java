package decorator;

import decorator.simple.Component;
import decorator.simple.ConcreteComponent;
import decorator.simple.ConcreteDecorator;
import decorator.simple.Decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operation();
    }
}
