package iterator;

import iterator.simple.ConcreteAggregate;
import iterator.simple.Iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("hello");
        aggregate.add("world");
        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
