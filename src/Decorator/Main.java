package Decorator;

import Decorator.simple.Component;
import Decorator.simple.ConcreteComponent;
import Decorator.simple.ConcreteDecorator;
import Decorator.simple.Decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operation();
    }
}
