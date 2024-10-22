package State;

public class NewOrderState implements State {
    private Order order;

    public NewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has been paid.");
        order.setState(order.getPaidState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship the order. The order needs to be paid first.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. The order needs to be paid and shipped first.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledState());
    }
}

