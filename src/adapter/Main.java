package adapter;

import adapter.simple.Adapter;
import adapter.simple.Target;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
