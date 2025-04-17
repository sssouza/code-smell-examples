public class User {
    // Authentication fields
    private String username;
    private String password;
    private String salt;
    private boolean isActive;
    private LocalDateTime lastLogin;
    
    // Profile fields
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;
    
    // Billing fields
    private String creditCardNumber;
    private LocalDate creditCardExpiry;
    private double balance;
    private List<Transaction> transactions;
    
    // Authentication methods
    public void login(String password) { ... }
    public void logout() { ... }
    public void resetPassword(String newPassword) { ... }
    public boolean validatePassword(String input) { ... }
    
    // Profile methods
    public void updateProfile(String firstName, String lastName, String email) { ... }
    public void changeAddress(Address newAddress) { ... }
    public void verifyEmail() { ... }
    
    // Billing methods
    public void charge(double amount) { ... }
    public void refund(Transaction transaction) { ... }
    public void updateCreditCard(String number, LocalDate expiry) { ... }
    public List<Transaction> getTransactionHistory() { ... }
    
    // ... 20+ more methods
}