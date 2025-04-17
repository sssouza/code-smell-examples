public class OrderProcessor {
    public void processOrder(Order order) {
        // Validate order
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have items");
        }
        for (Item item : order.getItems()) {
            if (item.getQuantity() <= 0) {
                throw new IllegalArgumentException("Invalid item quantity");
            }
        }

        // Calculate total
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        if (order.getCustomer().isVIP()) {
            total *= 0.9; // 10% discount for VIPs
        }

        // Charge payment
        PaymentResult result = paymentService.charge(order.getCustomer(), total);
        if (!result.isSuccess()) {
            throw new PaymentFailedException(result.getErrorMessage());
        }

        // Update inventory
        for (Item item : order.getItems()) {
            inventoryService.reduceStock(item.getId(), item.getQuantity());
        }

        // Send confirmation
        String emailContent = "Your order #" + order.getId() + " is confirmed. Total: $" + total;
        emailService.send(order.getCustomer().getEmail(), "Order Confirmation", emailContent);

        // Log the order
        auditLogger.log("Order processed: " + order.getId());
    }
}