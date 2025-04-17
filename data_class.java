// A "dumb" data container with no behavior
public class Customer {
       private String name;
       private String email;
       private double balance;
   
       // Only getters/setters
       public String getName() { return name; }
       public void setName(String name) { this.name = name; }
       public String getEmail() { return email; }
       public void setEmail(String email) { this.email = email; }
       public double getBalance() { return balance; }
       public void setBalance(double balance) { this.balance = balance; }
   }