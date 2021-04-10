package strategy.simple;

/**
 * 环境。
 * 持有抽象策略，供客户端调用
 */
public class Context {

    private  IStrategy mStrategy;

    /**
     * 对于不同的场景，设置不同的策略
     */
    public void setStrategy(IStrategy strategy) {
        this.mStrategy = strategy;
    }

    /**
     * 客户端调用，执行策略
     */
    public void perform() {
        if (mStrategy == null) {
            System.out.println("no strategy");
            return;
        }
        mStrategy.algorithm();
    }
}
