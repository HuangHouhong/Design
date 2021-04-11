package observer.java;

import java.util.Observable;

public class SharesObservable extends Observable {

    public int mPrice;

    public void setPrice(int price) {
        mPrice = price;
        setChanged();
        notifyObservers("快出售");
    }
}
