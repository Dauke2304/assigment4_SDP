package ChainOfResponsibility;

public class Director extends Approver {
    private static final double APPROVAL_LIMIT = 20000;

    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Director approved the request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}
