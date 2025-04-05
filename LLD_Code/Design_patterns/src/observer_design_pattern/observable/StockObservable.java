package observer_design_pattern.observable;

import observer_design_pattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();

}
