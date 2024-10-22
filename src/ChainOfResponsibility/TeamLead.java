package ChainOfResponsibility;

public class TeamLead extends Approver {
    private static final double APPROVAL_LIMIT = 1000;

    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Team Lead approved the request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
