package state.simple;w

/**
 * 抽象状态。
 * 一般有几个状态，就需要有多少个方法。
 */
public abstract class State {

    public abstract void handleA();

    public abstract void handleB();
}
