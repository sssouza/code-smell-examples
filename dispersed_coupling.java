// Bad: OrderProcessor has dispersed coupling with many services
public class OrderProcessor {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private ShippingService shippingService;
    private NotificationService notificationService;
    private AnalyticsService analyticsService;

    public OrderProcessor() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
        this.analyticsService = new AnalyticsService();
    }

    public void processOrder(Order order) {
        paymentService.charge(order);
        inventoryService.updateStock(order);
        shippingService.scheduleDelivery(order);
        notificationService.sendConfirmation(order);
        analyticsService.logOrder(order);
    }
}