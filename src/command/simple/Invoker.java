package command.simple;

/**
 * 请求者
 */
public class Invoker {

    Command mCommand;

    public Invoker(Command command) {
        mCommand = command;
    }

    /**
     * 客户端调用该方法执行命令
     */
    public void invoke() {
        mCommand.execute();
    }
}
