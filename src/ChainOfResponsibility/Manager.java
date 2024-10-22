package ChainOfResponsibility;

public class Manager extends Approver {
    private static final double APPROVAL_LIMIT = 5000;

    @Override
    public void approveRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Manager approved the request of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        }
    }
}

