package observer.simple;

/**
 * 具体观察者
 */
public class ConcreteObserver implements IObserver {

    @Override
    public void update() {
        System.out.println("主题发生了改变啦啦啦");
    }
}
