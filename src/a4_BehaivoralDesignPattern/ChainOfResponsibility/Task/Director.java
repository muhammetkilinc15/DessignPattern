package a4_BehaivoralDesignPattern.ChainOfResponsibility.Task;

public class Director extends Approver {
    @Override
    public void approveRequest(double amount) {
        if (amount < 10000) {
            System.out.println("Director approved request for " + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }else{
            System.out.println("Issue not handled.");
        }
    }
}
