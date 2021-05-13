package composite;

import composite.simple.Component;
import composite.simple.Composite;
import composite.simple.Leaf;

public class Main{
    public static void main(String[] args) {
        Component component1 = new Composite("普通1");
        Component component2 = new Composite("普通2");
        Component component3 = new Composite("普通3");
        Component leaf = new Leaf("叶子");

        component1.add(component2);
        component1.add(leaf);
        component1.operation();

        leaf.operation();
        leaf.add(component3);
    }
}
