package observer_design_pattern;

import observer_design_pattern.observable.IphoneObservableImpl;
import observer_design_pattern.observable.StockObservable;
import observer_design_pattern.observer.EmailAlertObserverImpl;
import observer_design_pattern.observer.MobileAlertObserverImpl;
import observer_design_pattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
//        StockObservable iphoneStockObservable=new IphoneObservableImpl();
//        NotificationAlertObserver observer1=new
//                EmailAlertObserverImpl("xyz1@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver observer2=new
//                EmailAlertObserverImpl("xyz2@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver observer3=new
//                MobileAlertObserverImpl("xyz_username",iphoneStockObservable);
//        iphoneStockObservable.add(observer1);
//        iphoneStockObservable.add(observer2);
//        iphoneStockObservable.add(observer3);
//        iphoneStockObservable.setStockCount(10);
//        iphoneStockObservable.setStockCount(0);

        System.out.println(4^(5^6));
        System.out.println(6^(4^5));


    }
}
