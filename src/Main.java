import ChainOfResponsibility.*;
public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        // Create some expense requests
        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(3000, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(15000, "New Office Setup");
        ExpenseRequest request4 = new ExpenseRequest(50000, "Company Expansion Project");

        // Process the requests through the chain
        System.out.println("Processing request 1:");
        approvalChain.processRequest(request1);

        System.out.println("\nProcessing request 2:");
        approvalChain.processRequest(request2);

        System.out.println("\nProcessing request 3:");
        approvalChain.processRequest(request3);

        System.out.println("\nProcessing request 4:");
        approvalChain.processRequest(request4);
    }
}