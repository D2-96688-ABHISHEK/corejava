package com.sunbeam.q6;

import java.util.*;

class ECommerceException extends Exception {
 public ECommerceException(String message) {
     super(message);
 }
}

//Payment Exception
class PaymentException extends ECommerceException {
 public PaymentException(String message) {
     super(message);
 }
}

//Inventory Exception
class InventoryException extends ECommerceException {
 public InventoryException(String message) {
     super(message);
 }
}

//Shipping Exception
class ShippingException extends ECommerceException {
 public ShippingException(String message) {
     super(message);
 }
}

//Service class to simulate operations
class ECommerceService {

 public void processPayment(double amount) throws PaymentException {
     if (amount <= 0) {
         throw new PaymentException("Invalid payment amount");
     }
     if (amount > 100000) {
         throw new PaymentException("Payment limit exceeded");
     }
     System.out.println("Payment successful: " + amount);
 }

 public void checkInventory(int stock) throws InventoryException {
     if (stock <= 0) {
         throw new InventoryException("Product out of stock");
     }
     System.out.println("Stock available: " + stock);
 }

 public void shipOrder(String address) throws ShippingException {
     if (address == null || address.isEmpty()) {
         throw new ShippingException("Invalid shipping address");
     }
     System.out.println("Order shipped to: " + address);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {

     ECommerceService service = new ECommerceService();

     try {
         service.processPayment(50000);
         service.checkInventory(10);
         service.shipOrder("Pune, India");

     } catch (PaymentException e) {
         System.out.println("Payment Error: " + e.getMessage());

     } catch (InventoryException e) {
         System.out.println("Inventory Error: " + e.getMessage());

     } catch (ShippingException e) {
         System.out.println("Shipping Error: " + e.getMessage());

     } catch (ECommerceException e) {
         System.out.println("General Error: " + e.getMessage());
     }
 }
}
