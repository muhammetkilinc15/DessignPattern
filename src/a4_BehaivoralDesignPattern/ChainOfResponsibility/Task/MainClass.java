package a4_BehaivoralDesignPattern.ChainOfResponsibility.Task;

public class MainClass {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();

        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);
        vicePresident.setNextApprover(president);

        manager.approveRequest(500);
        manager.approveRequest(7500);
        manager.approveRequest(20000);
        manager.approveRequest(100000);

    }
}
