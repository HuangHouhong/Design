package strategy.simple;

/**
 * 具体的策略
 */
public class StrategyImpl implements IStrategy{
    @Override
    public void algorithm() {
        System.out.println("执行了算法A");
    }
}
