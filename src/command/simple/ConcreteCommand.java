package command.simple;

/**
 * 具体命令.
 * 一般一个具体的命令对应一个具体的接受者。
 */
public class ConcreteCommand implements Command {

    Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
