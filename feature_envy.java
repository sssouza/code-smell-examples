class Order {
    private Customer customer;
    private double total;

    // Feature Envy: This method "envies" Customer's data
    public double calculateDiscount() {
        if (customer.getAge() > 65 || customer.isVIP()) {
            return total * 0.2; // 20% discount
        }
        return 0.0;
    }
}

class Customer {
    private int age;
    private boolean isVIP;

    public int getAge() { return age; }
    public boolean isVIP() { return isVIP; }
}