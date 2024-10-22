package State;

public class CancelledOrderState implements State {
    private Order order;

    public CancelledOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has been cancelled. You cannot pay for a cancelled order.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has been cancelled. You cannot ship a cancelled order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order has been cancelled. You cannot deliver a cancelled order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has already been cancelled.");
    }
}

