package observer.simple;

/**
 * 具体主题
 */
public class ConcreteSubject extends Subject {

    int data;

    /**
     * 设置数据。当数据改变时，需要通知所有的观察者
     */
    public void setData(int data) {
        this.data = data;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < mObservers.size(); i++) {
            mObservers.get(i).update();
        }
    }
}
