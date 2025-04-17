public class CustomerService {
    // 7 parameters!
    public void createCustomer(
        String firstName, 
        String lastName, 
        String email,
        String phone,
        Address address,
        boolean sendWelcomeEmail,
        LocalDate birthDate
    ) {
        // Validation
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Name required");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        
        // Create customer
        Customer customer = new Customer(firstName, lastName, email, phone, address, birthDate);
        
        // Optional welcome email
        if (sendWelcomeEmail) {
            emailService.sendWelcomeEmail(email, firstName);
        }
    }
}