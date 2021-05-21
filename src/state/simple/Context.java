package state.simple;

/**
 * 上下文环境。
 * 供客户端调用
 */
public class Context {

    // 所有的状态
    private State stateA;
    private State stateB;

    // 当前状态
    private State mCurrentState;

    public Context() {
        stateA = new ConcreteStataA(this);
        stateB = new ConcreteStataB(this);
        // 默认初始状态为A
        mCurrentState = stateA;
    }

    public State getCurrentState() {
        return mCurrentState;
    }

    public State getStateA() {
        return stateA;
    }

    public State getStateB() {
        return stateB;
    }

    public void setCurrentState(State state) {
        mCurrentState = state;
    }

    /**
     * 客户端具体调用出，用来执行行为的。
     */
    public void handleA() {
        mCurrentState.handleA();
    }

    public void handleB() {
        mCurrentState.handleB();
    }
}
