package observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    List<IObserver> mObservers = new ArrayList<>();

    public void registerObserver(IObserver ob) {
        mObservers.add(ob);
    }

    public void unregisterObserver(IObserver ob) {
        mObservers.remove(ob);
    }

    public abstract void notifyObservers();
}
