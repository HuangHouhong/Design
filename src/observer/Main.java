package observer;

import observer.java.ShareHolderObserver;
import observer.java.SharesObservable;
import observer.simple.ConcreteObserver;
import observer.simple.ConcreteSubject;

public class Main {

    public static void main(String[] args) {
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(observer);
        subject.setData(1);

        SharesObservable observable = new SharesObservable();
        observable.addObserver(new ShareHolderObserver());
        observable.setPrice(100);
    }

}
