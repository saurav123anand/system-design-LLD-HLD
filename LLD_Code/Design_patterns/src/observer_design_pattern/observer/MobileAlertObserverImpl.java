package observer_design_pattern.observer;

import observer_design_pattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    private String username;
    private StockObservable observable;
    public MobileAlertObserverImpl(String emailId, StockObservable observable){
        this.username=emailId;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail(username,"Product is in the stock hurry up!");
    }
    void sendEmail(String emailId,String msg){
        System.out.println("msg sent to: "+emailId);
    }
}
