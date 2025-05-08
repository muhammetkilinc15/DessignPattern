package a4_BehaivoralDesignPattern.ChainOfResponsibility.Task;

public class President extends Approver {
    @Override
    public void approveRequest(double amount) {
        if (amount > 50000) {
            System.out.println("President approved request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        } else {
            System.out.println("Issue not handled.");
        }
    }
}
