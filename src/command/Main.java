package command;

import command.simple.Command;
import command.simple.ConcreteCommand;
import command.simple.Invoker;
import command.simple.Receiver;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
