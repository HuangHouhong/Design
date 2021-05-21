package state;

import state.simple.Context;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.handleA();
        context.handleB();

        Context context2 = new Context();
        context2.handleB();
        context2.handleA();
    }
}
