package com.sunbeam.q7;

import java.util.*;

//Product class
class Product {
 private int id;
 private String name;
 private double price;

 public Product(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 public int getId() { return id; }
 public String getName() { return name; }
 public double getPrice() { return price; }
}

//Shopping Cart class
class ShoppingCart {
 private HashMap<Product, Integer> cart;

 public ShoppingCart() {
     cart = new HashMap<>();
 }

 // Add product to cart
 public void addProduct(Product p, int quantity) {
     cart.put(p, cart.getOrDefault(p, 0) + quantity);
 }

 // Remove product from cart
 public void removeProduct(Product p) {
     cart.remove(p);
 }

 // Display cart items
 public void displayCart() {
     System.out.println("Cart Items:");
     for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
         Product p = entry.getKey();
         int qty = entry.getValue();
         System.out.println(p.getName() + " | Qty: " + qty + " | Price: " + p.getPrice());
     }
 }

 // Calculate total
 public double getTotal() {
     double total = 0;
     for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
         total += entry.getKey().getPrice() * entry.getValue();
     }
     return total;
 }

 // Clear cart
 public void clearCart() {
     cart.clear();
 }
}

//Order class
class Order {
 private List<Product> products;
 private double total;

 public Order(List<Product> products, double total) {
     this.products = products;
     this.total = total;
 }

 public void displayOrder() {
     System.out.println("Order Details:");
     for (Product p : products) {
         System.out.println(p.getName() + " - " + p.getPrice());
     }
     System.out.println("Total: " + total);
 }
}

//Main class
public class Main {
 public static void main(String[] args) {

     // Products
     Product p1 = new Product(1, "Laptop", 50000);
     Product p2 = new Product(2, "Phone", 20000);
     Product p3 = new Product(3, "Headphones", 2000);

     // Cart
     ShoppingCart cart = new ShoppingCart();

     cart.addProduct(p1, 1);
     cart.addProduct(p2, 2);
     cart.addProduct(p3, 1);

     cart.displayCart();

     double total = cart.getTotal();
     System.out.println("Total Amount: " + total);

     // Order history using ArrayList
     List<Order> orderHistory = new ArrayList<>();

     // Create order and add to history
     List<Product> orderedProducts = new ArrayList<>();
     orderedProducts.add(p1);
     orderedProducts.add(p2);
     orderedProducts.add(p3);

     Order order = new Order(orderedProducts, total);
     orderHistory.add(order);

     // Clear cart after order
     cart.clearCart();

     // Display order history
     System.out.println("\nOrder History:");
     for (Order o : orderHistory) {
         o.displayOrder();
     }
 }
}
