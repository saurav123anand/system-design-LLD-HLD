package observer_design_pattern.observable;

import observer_design_pattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable
{
    List<NotificationAlertObserver> observerList=new ArrayList<>();
    private int stockCount=0;
    @Override
    public void add(NotificationAlertObserver observer) {
      observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
      if (stockCount==0) notifySubscribers();
      stockCount=stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
      return stockCount;
    }
}
