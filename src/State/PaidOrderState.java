package State;

public class PaidOrderState implements State {
    private Order order;

    public PaidOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has already been paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order has been shipped.");
        order.setState(order.getShippedState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. The order needs to be shipped first.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancelling a paid order is not allowed.");
    }
}
