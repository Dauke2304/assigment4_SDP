package State;

public class ShippedOrderState implements State {
    private Order order;

    public ShippedOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has already been paid and shipped.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order has been delivered.");
        order.setState(order.getDeliveredState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cannot be cancelled once it is shipped.");
    }
}
