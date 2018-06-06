package visitor;

import java.util.ArrayList;

/**
 * Run main() to see how to use the classes in this package.
 */
public class Demo {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        CoffeeMug mugKitty = new CoffeeMug("Cat", "028399075850", 15.95);
        inventory.stockMug(mugKitty, 2);

        CoffeeMug mugTux = new CoffeeMug("I <3 LINUX", "5060242616860", 6.99);
        inventory.stockMug(mugTux, 2);

        CoffeeMug mugTravelEdinburgh = new TravelMug("Edinburgh Travel Mug", "B0788TCW3W", 19.95, "theseat");
        inventory.stockMug(mugTravelEdinburgh, 2);

        Book bookDesignPatterns = new Book("Design Patterns", "978-0201633610", 27.85);
        inventory.stockBook(bookDesignPatterns, 5);

        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        InventorySeller inventorySeller = new InventorySeller(inventory);


        System.out.println("Initial Inventory:");
        inventory.logStock();
        System.out.println("");

        // Create a shopping cart
        ArrayList<Element> shopingCart = new ArrayList<>();
        shopingCart.add(mugTux);
        shopingCart.add(mugTravelEdinburgh);
        shopingCart.add(bookDesignPatterns);


        // Checkout
        inventorySeller.sell(shopingCart);
        System.out.println("User Receipt:");
        receiptBuilder.printReceipt(shopingCart);

        System.out.println("Inventory after completing the sale:");
        inventory.logStock();
    }

}
