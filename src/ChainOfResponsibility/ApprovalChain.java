package ChainOfResponsibility;

public class ApprovalChain {
    private Approver chain;

    public ApprovalChain() {
        // Create the chain of approvers
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // Set the chain of responsibility
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        chain = teamLead;  // Chain starts with the team lead
    }

    public void processRequest(ExpenseRequest request) {
        chain.approveRequest(request);
    }
}
