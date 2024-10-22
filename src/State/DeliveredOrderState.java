package State;

public class DeliveredOrderState implements State {
    private Order order;

    public DeliveredOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has already been paid and delivered.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has already been delivered.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order has already been delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cannot be cancelled once it is delivered.");
    }
}

