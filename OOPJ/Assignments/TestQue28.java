public class TestQue28 {

    // Simple Product class
    static class Product {
        int id;
        String name;
        double price;

        // Constructor
        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    // Simple Cart class using array
    static class Cart {
        Product[] products;
        int count;  // how many products are added

        Cart(int size) {
            products = new Product[size];
            count = 0;
        }

        // Add product
        void addProduct(Product p) {
            products[count] = p;
            count++;
        }

        // Apply discount only to Laptop
        void applyDiscount(double percentage) {
            for (int i = 0; i < count; i++) {
                if (products[i].name.equalsIgnoreCase("Laptop")) {
                    double discount = products[i].price * percentage / 100;
                    products[i].price = products[i].price - discount;
                    System.out.println("Applied " + percentage + "% discount on Laptop");
                }
            }
        }

        // Calculate total price
        double getTotalPrice() {
            double total = 0;
            for (int i = 0; i < count; i++) {
                total += products[i].price;
            }
            return total;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create cart with 3 slots
        Cart cart = new Cart(3);

        // Create products (no input, just fixed values)
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        // Add products to cart
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Apply discount on Laptop
        cart.applyDiscount(10);

        // Print total price
        System.out.println("Total Cart Price = " + cart.getTotalPrice());
    }
}
