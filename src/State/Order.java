package State;

public class Order {
    private State newState;
    private State paidState;
    private State shippedState;
    private State deliveredState;
    private State cancelledState;

    private State currentState;

    public Order() {
        newState = new NewOrderState(this);
        paidState = new PaidOrderState(this);
        shippedState = new ShippedOrderState(this);
        deliveredState = new DeliveredOrderState(this);
        cancelledState = new CancelledOrderState(this);

        currentState = newState;  // Initial state is New
    }

    public void setState(State state) {
        currentState = state;
    }

    public void payOrder() {
        currentState.payOrder();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void deliverOrder() {
        currentState.deliverOrder();
    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }

    public State getNewState() {
        return newState;
    }

    public State getPaidState() {
        return paidState;
    }

    public State getShippedState() {
        return shippedState;
    }

    public State getDeliveredState() {
        return deliveredState;
    }

    public State getCancelledState() {
        return cancelledState;
    }
}
