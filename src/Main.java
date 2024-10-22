import Strategy.*;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Process payment with Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(150.00);  // Output: Processing credit card payment of $150.0 for cardholder: John Doe

        // Switch to PayPal payment
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(200.00);  // Output: Processing PayPal payment of $200.0 for email: johndoe@example.com

        // Switch to Cryptocurrency payment
        PaymentStrategy cryptoPayment = new CryptoPayment("1A2b3C4D5E6F7G8H9I0J");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout(300.00);  // Output: Processing cryptocurrency payment of $300.0 for wallet: 1A2b3C4D5E6F7G8H9I0J
    }
}