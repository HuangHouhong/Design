package strategy;

import strategy.simple.Context;
import strategy.simple.StrategyImpl;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        // 不同场景，通过set方法设置不同的策略，执行perform方法就得到不同的结果了。
        context.setStrategy(new StrategyImpl());
        context.perform();
    }
}
