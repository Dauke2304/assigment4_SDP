package ChainOfResponsibility;

public class CEO extends Approver {
    @Override
    public void approveRequest(ExpenseRequest request) {
        System.out.println("CEO approved the request of $" + request.getAmount() + " for " + request.getPurpose());
    }
}

