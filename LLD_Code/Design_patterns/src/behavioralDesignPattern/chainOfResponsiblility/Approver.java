package behavioralDesignPattern.chainOfResponsiblility;

public abstract class Approver {
    protected Approver nextApprover;
    // set the next handler in the chain
    public void setNextApprover(Approver nextApprover){
       this.nextApprover=nextApprover;
    }
    // abstract method to process the leave request
    public abstract void processLeaveRequest(int leaveDays);

}
