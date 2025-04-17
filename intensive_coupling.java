public class OrderProcessor {
    // Tight coupling: Directly depends on PayPal (no abstraction)
    private PayPalPayment paypal = new PayPalPayment(); 

    public void processPayment(double amount) {
        paypal.charge(amount); // Can't switch payment providers easily!
    }
}

public class PayPalPayment {
    public void charge(double amount) {
        System.out.println("Charged $" + amount + " via PayPal.");
    }
}