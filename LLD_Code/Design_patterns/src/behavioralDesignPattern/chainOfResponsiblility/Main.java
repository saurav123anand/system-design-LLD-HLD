package behavioralDesignPattern.chainOfResponsiblility;

public class Main {
    public static void main(String[] args) {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        // Set up the chain: Supervisor -> Manager -> Director
        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        int leaveDays=10;
        System.out.println("Employee requests " + leaveDays + " days of leave.");
        supervisor.processLeaveRequest(leaveDays);

    }
}
