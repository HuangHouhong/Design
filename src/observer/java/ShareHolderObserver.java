package observer.java;

import java.util.Observable;
import java.util.Observer;

public class ShareHolderObserver implements Observer {

    /**
     * @param observable 主题对象
     * @param o notifyObservers传入的参数
     */
    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof SharesObservable) {
            SharesObservable shares = (SharesObservable) observable;
            System.out.println("当前股票价格为："+shares.mPrice+" , "+o);
        }
    }
}
