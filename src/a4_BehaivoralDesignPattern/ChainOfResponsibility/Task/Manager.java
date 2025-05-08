package a4_BehaivoralDesignPattern.ChainOfResponsibility.Task;

public class Manager extends Approver {

    @Override
    public void approveRequest(double amount) {
        if (amount < 1000) {
            System.out.println("Manager approved request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }else{
            System.out.println("Issue not handled.");
        }
    }
}
