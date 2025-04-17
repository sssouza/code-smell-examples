class Vehicle {
       protected String name;
   
       public void startEngine() {
           System.out.println("Engine started.");
       }
   
       public void honk() {
           System.out.println("Beep beep!");
       }
   }
   
   class Bicycle extends Vehicle {
       // Bicycles don't have engines!
       @Override
       public void startEngine() {
           throw new UnsupportedOperationException("Bicycles don't have engines!");
       }
   
       // Bicycles don't honk; they ring a bell.
       @Override
       public void honk() {
           System.out.println("Ring ring!"); // Changes behavior entirely
       }
   }