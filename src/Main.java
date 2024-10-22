import State.*;
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Scenario 1: New order -> Pay -> Ship -> Deliver
        System.out.println("=== Scenario 1: New -> Paid -> Shipped -> Delivered ===");
        order.payOrder();     // Order has been paid
        order.shipOrder();    // Order has been shipped
        order.deliverOrder(); // Order has been delivered

        // Scenario 2: Trying to cancel a delivered order
        System.out.println("\n=== Scenario 2: Try to cancel a delivered order ===");
        order.cancelOrder();  // Cannot cancel a delivered order

        // Scenario 3: New order -> Cancel
        System.out.println("\n=== Scenario 3: New -> Cancel ===");
        Order anotherOrder = new Order();
        anotherOrder.cancelOrder();  // Order has been cancelled

        // Scenario 4: Trying to pay a cancelled order
        System.out.println("\n=== Scenario 4: Try to pay a cancelled order ===");
        anotherOrder.payOrder();  // Cannot pay for a cancelled order
    }
}