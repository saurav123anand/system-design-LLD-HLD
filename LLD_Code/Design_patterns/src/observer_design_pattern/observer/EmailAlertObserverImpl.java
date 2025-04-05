package observer_design_pattern.observer;

import observer_design_pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private String emailId;
    private StockObservable observable;
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
      this.emailId=emailId;
      this.observable=observable;
    }
    @Override
    public void update() {
       sendEmail(emailId,"Product is in the stock hurry up!");
    }
    void sendEmail(String emailId,String msg){
        System.out.println("Email sent to: "+emailId);
    }
}
